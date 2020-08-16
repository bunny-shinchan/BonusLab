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
public class PersonFactory {
    
    // Sudhanshu verma This class is singleton - only one instance can be created.
    
    /* Static keyword
    
     *Sudhanshu verma When using static keyword there is only 1 instance of this
  
    */
   
    private static PersonFactory personFactoryInstance = null;
    
    
    // Constructor is private, so object can only be created inside this class
    private PersonFactory(){}//default constructor
    
   /*
    
    * Sudhanshu Verma 
    * this method do the fuctaionality when there can only be one object of this class at a time.
    
    */
    public static PersonFactory getInstance()
    {
      
        if(personFactoryInstance == null)
        {
           personFactoryInstance = new PersonFactory();
        }
        
           return personFactoryInstance;
    }
    
     /* Factory method
    
    * Sudhanshu verma  This is factory method of this class.
    * Depending on variable type we are getting a certain kind of person
    * which is the point of factory class design.
    */
    public Person create(String type, String name, String email,Person.Gender gender,
            String publisherName)
    {
        if(type.equalsIgnoreCase("AUTHOR"))
        {
            return new Author(name,email,gender,publisherName);
        }
        
        return null;
    }
    
}
