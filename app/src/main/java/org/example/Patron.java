
package org.example;

public class Patron {

    private String name;
    private String patronId;


    public Patron (String name, String patronId){
        this.name = name;
        this.patronId = patronId;
    }



    public void setName(String name){
        this.name = name;
    }

    public void setPatronId(String patronId){
        this.patronId = patronId;
    }

    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }



}
