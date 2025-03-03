package com.example.budgetTracker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import  jakarta.persistence.Id;

@Entity
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public  Category()
    {
            // constructor
    }
    // parameterized constructor is missing if any problem occur lets add it.
    public  Category(String name)
    {
        this.name = name;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
