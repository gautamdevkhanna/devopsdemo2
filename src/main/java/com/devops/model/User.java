
package com.devops.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

    private String firstName;
    private String lastName;
    private String country;
    
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}