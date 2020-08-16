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
public class BookFactory {
    //  This class is singleton and we can create only one instance of this class
    
    /* Static keyword
     we use static when there is only one instance
    */
       
    private static BookFactory bookFactoryInstance = null;
    
    private BookFactory()
    {
        
    }
   
    /*
    
    * Sudhanshu Verma This method is designed in such a way that
    * there can only be one object of the class at a time.
    */
    public static BookFactory getInstance()
    {
      
        if(bookFactoryInstance == null)
        {
           bookFactoryInstance = new BookFactory();
        }
        
           return bookFactoryInstance;
    }
    /*  This is a Factory method
    
    * Sudhanshu- This is factory method of this class.

    * We done have to make changes in other classes, all we have to do is to change the method
    
    */
   
    public Book create(String title,double price, Author author)
    {
        return new Book(title,price,author);
    }

    
}
