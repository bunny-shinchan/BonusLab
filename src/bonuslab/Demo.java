/*
 *Date of the code 16/8/2020
 * name of the coder : Sudhanshu verma
 * 
 */
package bonuslab;

/**
 *
 * @author verms
 */
public class Demo {
    
    
    public static void main(String[] args)
    {
        // Sudhanshu verma- Person factory object
        PersonFactory personFactory = PersonFactory.getInstance();
       // Sudhanshu verma- Book factory object
        BookFactory bookFactory = BookFactory.getInstance();
        
        Author author = (Author) personFactory.create("author", "Brad Thor", "brad.thor@authors.com", Person.Gender.MALE, "Publisher");
       // Mujda Farid - View object
        AuthorView authorView = new AuthorView();
            // Mujda Farid - Contoller object
        AuthorController autControl = new AuthorController(author,authorView);
        
        autControl.addBook(bookFactory.create("Near Dark", 14.99, author));
        autControl.addBook(bookFactory.create("Backlash", 8.99, author));
        autControl.addBook(bookFactory.create("The Lions of Lucerne", 12.99, author));
        autControl.addBook(bookFactory.create("Spy Master", 8.99, author));
        autControl.addBook(bookFactory.create("Path of the Assassin", 12.99, author));

        
        autControl.updateView();
    }
    
}
