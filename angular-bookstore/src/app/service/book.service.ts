import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Book } from '../common/book';
import { catchError, map, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl = "http://localhost:8080/api/v1/books";

  private searchUrl: any;

  constructor(private HttpClient: HttpClient) { }

  getBooks(theCategoryId : number):Observable<Book[]>{
    this.searchUrl = `${this.baseUrl}/search/category/${theCategoryId}`

    console.log(this.searchUrl);

    return this.HttpClient.get<Book[]>(this.searchUrl)

  }
  
}

