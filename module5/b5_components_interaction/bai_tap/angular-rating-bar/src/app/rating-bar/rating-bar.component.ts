import {Component, EventEmitter, Input, OnInit, Output, SimpleChanges} from '@angular/core';
import {InflateRaw} from "zlib";
import {IRatingUnit} from "../i-rating-unit";
import {installTempPackage} from "@angular/cli/tasks/install-package";

@Component({
  selector: 'app-rating-bar',
  templateUrl: './rating-bar.component.html',
  styleUrls: ['./rating-bar.component.css']
})
export class RatingBarComponent implements OnInit {
  @Input()
  max = 10;
  @Input()
  ratingValue = 5;
  @Input()
  showRatingValue = true;

  @Output()
  ratechange = new EventEmitter<number>();

  ratingUnits: Array<IRatingUnit> = [];

  constructor() { }

  ngOnChanges(changes: SimpleChanges){
    if('max' in changes){
      let max = changes.max.currentValue;
      max = typeof max === 'undefined' ? 5: max;
      this.max = max;
      this.calculate(max, this.ratingValue);
    }
  }

  calculate(max, ratingValue) {
    this.ratingUnits = Array.from({length: max},
      (_, index) => ({
        value: index + 1,
        active: index < ratingValue
      }));
  }

  ngOnInit(): void {
    this.calculate(this.max, this.ratingValue);
  }

  select(index){
    this.ratingValue = index + 1;
    this.ratingUnits.forEach((item, idx) => item.active = idx < this.ratingValue);
    this.ratechange.emit(this.ratingValue);
  }

  enter(index){
    this.ratingUnits.forEach((item, idx) => item.active = idx <= index);
  }

  reset(){
    this.ratingUnits.forEach((item, idx) => item.active = idx < this.ratingValue);
  }
}
