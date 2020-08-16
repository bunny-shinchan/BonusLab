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
public class Book {
    //variable names
    private String title;
    private double price;
    private Author author;
    //constructor with 3 parameters title price and author
    public Book(String title, double price, Author author)
    {
        this.title = title;
        this.price = price;
        this.author = author;
    }
    //getters and setters for all the variables
    public void setTitle(String t)
    {
        title = t;
    }
    
    public void setPrice(int p)
    {
        price = p;
    }
    
    public void setAuthor(Author a)
    {
        author = a;
    }
    public String getTitle()
    {
        return title;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public Author getAuthor()
    {
        return author;
    }
    
}
