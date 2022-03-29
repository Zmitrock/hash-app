package com.test;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        Person p1 =new Person();
        p1.setId(100);
        p1.setName("Bob");
        Person p2 =new Person();
        p2.setId(100);
        p2.setName("John");

        System.out.println(p1.equals(p2));
        Person p3 =p2;
        System.out.println(p2.equals(p3));
        System.out.println("TEST for GIT");
    }
}
class Person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }


}