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

/* Abstarct class

 * Sudhanshu Verma When class is abstract it can't be initiated.

*/
public abstract class Person {
    
    /* Enum
    
    * Sudhanshu Verma- Enums are generally is used when variable can have
    * only a couple possible values.
    */
    public enum Gender{MALE,FEMALE};
    //Variable names
    protected String name;
    protected String email;
    protected Gender gender;
    protected String publisherName;
    //getters and setter for the varibales
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public Gender getGender()
    {
        return gender;
    }
    
    public String getPublisherName()
    {
        return publisherName;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setGender(Gender gender)
    {
        this.gender = gender;
    }
    
    public void setPublisherName(String publisherName)
    {
        this.publisherName = publisherName;
    }
    
}

