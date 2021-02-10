package com.oop.myapp.idol;

import java.lang.reflect.Member;

public class GirlGroup {

    private String groupName;
    private Member[] members;
    private int currentNum;

    public GirlGroup(String groupName,int number){

    }

    public void addMember(Member member){

    }

//    setter - getter

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }
}
