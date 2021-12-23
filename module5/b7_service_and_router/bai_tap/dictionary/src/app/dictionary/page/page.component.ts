import { Component, OnInit } from '@angular/core';
import {Word} from "../../model/word";
import {WordService} from "../../service/word.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-page',
  templateUrl: './page.component.html',
  styleUrls: ['./page.component.css']
})
export class PageComponent implements OnInit {
  words: Word[] = [];

  constructor(private wordService: WordService,
              private _router: Router) { }

  ngOnInit() {
    this.getAll();
  }

  getAll(){
    this.words = this.wordService.getAll();
  }

  showDetail(index: number) {
      this._router.navigate(['detail', index]);
  }

}
