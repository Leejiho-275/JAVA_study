package com.oop.myapp.idol;

public class Member {
    private String name;
    private GirlGroup girlGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GirlGroup getGirlGroup() {
        return girlGroup;
    }

    public void setGirlGroup(GirlGroup girlGroup) {
        this.girlGroup = girlGroup;
    }

    public Member(String name, GirlGroup girlGroup){

    }
}
