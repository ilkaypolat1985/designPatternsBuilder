package com.asd.designpatterns.builder;

public class Main {
    public static void main(String[] args) {

        Email email = new Email.Builder()
                .subject("Holiday information")
                .content("Next week will be holiday")
                .recipient("All")
                .build();
        System.out.println(email);
    }
}
