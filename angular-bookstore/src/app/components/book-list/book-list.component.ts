import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Book } from 'src/app/common/book';
import { BookService } from 'src/app/service/book.service';

@Component({
  selector: 'app-book-list',
  // templateUrl: './book-list.component.html',
  templateUrl: './book-grid.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Book[] = [];



  searchMode: boolean | undefined;

  constructor(private _bookService: BookService,
    private _activatedRoute: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this._activatedRoute.paramMap.subscribe(() => {
      this.listBooks();
    })

  }

  listBooks() {

    this.searchMode = this._activatedRoute.snapshot.paramMap.has('keyword')

    if (this.searchMode) {
      this.handleSearchBooks();
    } else {
      this.handleListBooks();
    }
  }

  handleListBooks() {
    const hasCategoryId: boolean = this._activatedRoute.snapshot.paramMap.has('id');
    let currentCategoryId = 1;
    
    if (hasCategoryId) {
      currentCategoryId = + this._activatedRoute.snapshot.paramMap.get('id')
    } 
 
    this._bookService.getBooks(currentCategoryId).subscribe(
      data => {
        let booksObj = Object.keys(data).map(i => data[i]);
        console.log(booksObj[1]);
        this.books = booksObj[1];
      }
    )
  }


  handleSearchBooks() {
   const keyword = this._activatedRoute.snapshot.paramMap.get('keyword');

    this._bookService.searchBooks(keyword).subscribe(
      data =>{
        this.books = data;
      }
    )
  }

}
