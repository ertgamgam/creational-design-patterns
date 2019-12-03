package com.company.prototype;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setAge(23);
        user1.setName("King");
        user1.setSurname("Arthur");

        User user2 = (User) user1.clone();

        user2.setSurname("f");

        if (user1.getSurname().equals(user2.getSurname())) {
            System.out.println("Shallow copy");
        }
    }
}
