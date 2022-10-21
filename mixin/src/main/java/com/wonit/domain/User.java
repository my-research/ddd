package com.wonit.domain;

public class User implements Purchasable, Changeable{
    private Long id;
    private String username;
    private String password;

    @Override
    public void change(String toBe) {

    }

    @Override
    public void buy() {

    }
}
