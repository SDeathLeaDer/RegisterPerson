package model;

import java.io.Serializable;

/**
 * Created by wilder on 20/06/15.
 */
public class Person implements Serializable{

    // <ambito> <tipo-dato> <nombre varible>
    private String name;
    private String lastName;
    private  Boolean sex;

    public Person(String name, String lastName, Boolean sex) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}
