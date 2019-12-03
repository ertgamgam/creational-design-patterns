package com.company.prototype;

import java.util.logging.Logger;

/*
Shallow Copy: Simply makes a copy of the reference to A into B.
Think about it as a copy of A's Address.
So, the addresses of A and B will be the same i.e. they will be pointing to the same memory location i.e. data contents.

Deep copy: Simply makes a copy of all the members of A, allocates memory in a different location for B and then assigns the copied members to B to achieve deep copy.
In this way, if A becomes non-existant B is still valid in the memory.
The correct term to use would be cloning, where you know that they both are totally the same, but yet different (i.e. stored as two different entities in the memory space).
You can also provide your clone wrapper where you can decide via inclusion/exclusion list which properties to select during deep copy. This is quite a common practice when you create APIs.
 */
public class User implements Cloneable {

    private static Logger logger = Logger.getLogger(User.class.getName());

    private String name;

    private String surname;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            logger.info(e.getMessage());
        }

        return clone;
    }
}
