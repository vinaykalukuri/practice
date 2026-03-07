/*  Problem 3: Book → EBook
Scenario:
Base class Book
title
author
constructor
method displayBook()
Child class EBook
fileSize
constructor (use super)
method displayEBook()
👉 Task:
Print complete information of EBook.
Use super keyword properly.*/

import java.util.*;
class Book{
    String title;
    String author;
    public Book(String title,String author){
        this.title = title;
        this.author = author ;

    }
   void  displayBook(){
    System.out.println("tittle of the book :"+ title );
    System.out.println("author of the book :"+ author );
   }

}
class Ebook extends Book{
    public Ebook(String title,String author){
        super( title, author);
        
    }
   void  displayEBook(){
    int file = 100;
    System.out.println("file size:"+file+"mb");
    super.displayBook();
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String title = sc.nextLine();
       String author = sc.nextLine();
       Ebook ee = new Ebook(title, author);
       ee.displayEBook();
   }
}