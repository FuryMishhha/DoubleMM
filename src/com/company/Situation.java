package com.company;

public class Situation {

    public Situation[] direction;
    String subject,text;
    int um,mor;
    public Situation (String subject, String text, int variants,int um,int mor) {
        this.subject=subject;
        this.text=text;
        this.um=um;
        this.mor=mor;
        direction=new Situation[variants];
    }
}