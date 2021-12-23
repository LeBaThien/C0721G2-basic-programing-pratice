import { Component, OnInit } from '@angular/core';
import {WordService} from "../../service/word.service";
import {Word} from "../../model/word";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {
  word: Word | undefined;

  wordDetail: Word | undefined;

  words: Word[] | undefined;
  constructor(private _wordService: WordService,
              private _activateRoute: ActivatedRoute) { }

  ngOnInit(): void {
    let wordIndex = this._activateRoute.snapshot.params['index'];
    this.wordDetail = this._wordService.getWordByIndex(wordIndex);
  }



}
