import { Injectable } from '@angular/core';
import {Word} from "../model/word";

@Injectable({
  providedIn: 'root'
})
export class WordService {
 private _words: Word[]=[{
    id:1,
    englishWord: 'hello',
    vnWord:'xin chào'
  },{
    id:2,
    englishWord: 'One',
    vnWord: 'một'
  }, {
    id:3,
    englishWord: 'Two',
    vnWord: 'hai'
  }
  ];

  constructor() { }

  getAll(){
    return this._words;
  }

  saveWord(word){
    this._words.push(word);
  }

  getWordByIndex(index: number){
    return this._words[index];
  }

}
