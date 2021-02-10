package com.oop.myapp.company;

import com.oop.myapp.idol.GirlGroup;

public class Manager {

    private GirlGroup[] idol;
    private int number;

    public Manager() {

    }

    public void addGroup(GirlGroup idol) {

    }

    public void showAllGroupName() {

    }
//    setter - getter

    public GirlGroup[] getIdol() {
        return idol;
    }

    public void setIdol(GirlGroup[] idol) {
        this.idol = idol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number >= 0 && number <= 10) {
            this.number = number;
            return;
        }
        this.number = 0;
    }
}
