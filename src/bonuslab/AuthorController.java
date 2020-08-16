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
public class AuthorController {
    
    private Author model;
    AuthorView view;
    //constructor with 2 para
    public AuthorController(Author model, AuthorView view)
    {
        this.model = model;
        this.view = view;
    }
    // Updating view with controller
    public void updateView()
    {
        view.printAuthorDetails(model.getName(), model.getEmail(), model.getBooks());
    }
    public void addBook(Book book)
    {
        model.addBook(book);
    }
    //From here we have accessors and mutators.
    public String getAuthorName()
    {
        return model.getName();
    }
    
    public String getAuthorEmail()
    {
        return model.getEmail();
    }
    
    public Person.Gender getAuthorGender()
    {
        return model.getGender();
    }
    
    public String getAuthorPublisher()
    {
        return model.getPublisherName();
    }
    public void setAuthorName(String name)
    {
        model.setName(name);
    }
    
    public void setAuthorEmail(String email)
    {
        model.setEmail(email);
    }
    
    public void setAuthorGender(Person.Gender gender)
    {
        model.setGender(gender);
    }
    
    public void setAuthorPublisher(String publisher)
    {
        model.setPublisherName(publisher);
    }
    
}

