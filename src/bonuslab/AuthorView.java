/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonuslab;

import java.util.List;

/**
 *
 * @author verms
 */
public class AuthorView {
    // The user can only see something with this class only
    public void printAuthorDetails(String name, String email,List<Book> books)
    {
        System.out.println(name + "(" + email + ")" + "\n and Books:");
        
        for(Book book : books)
        {
            System.out.println(book.getTitle() + ", and the book price " + book.getPrice() + "$");
        }
        
    }
        
    
}