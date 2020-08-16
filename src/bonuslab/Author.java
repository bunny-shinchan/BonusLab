/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonuslab;

/**
 *
 * @author verms
 */
import java.util.ArrayList;
import java.util.List;
/* 
Sudhanshu Verma - (Inheritance)The Author class is entending the the Person class because Person has everything that a Person can have. 
*/

public class Author extends Person{
 /*
    * Sudhanshu - (Composition) 
    * Book class cannot exist withour an author 
    * 
    */
    private List books = new ArrayList<>();
     /* 
    * (Constructor) with 4 parameters
    */
    public Author(String name, String email, Gender gender,
            String pubName)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.publisherName = pubName;
    }
   // we add book to books list which is a composition 
    public void addBook(Book book)
    {
        books.add(book);
    }

    // we return books for the view
    public List<Book> getBooks() {
        return books;
    }
    
}
