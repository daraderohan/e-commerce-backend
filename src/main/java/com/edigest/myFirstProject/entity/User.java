package com.edigest.myFirstProject.entity;

public class User {

    private int id;
    private String name;
    private int age;

    public User(int id, int age, String name)
    {
        this.name=name;
        this.id=id ;
        this.age=age;

    }
    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }
    public String  toString()
    {
        return "Name:- "+this.name+" "+"Age:- "+this.age+" "+"Id:- "+this.id;
    }


}
