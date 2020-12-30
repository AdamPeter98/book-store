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

  currentCategoryId :number;

  constructor(private _bookService: BookService, 
      private _activatedRoute: ActivatedRoute
    ) { }

  ngOnInit(): void {
    this._activatedRoute.paramMap.subscribe(()=>{
      this.listBooks();
    })
    
  }

  listBooks(){

   const hasCategoryId: boolean =  this._activatedRoute.snapshot.paramMap.has('id');

  

    if(hasCategoryId){
     this.currentCategoryId = +this._activatedRoute.snapshot.paramMap.get('id')
    }else{
      this.currentCategoryId = 1;
    }

 console.log(this.currentCategoryId);


    this._bookService.getBooks(this.currentCategoryId).subscribe(
      
      data => {
        let booksObj = Object.keys(data).map(i =>data[i])
        console.log(booksObj[1]);
       this.books = booksObj[1];
      }
    )
  }

  

}
