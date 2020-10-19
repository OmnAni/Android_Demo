package com.example.work1;

import java.util.Date;

public class Phonecall {
    private String phonecallText;
    private Date phonecallTime;

    public Phonecall(String text) {
        phonecallText = text;
        phonecallTime = new Date();

    }

    public String getPhonecallText() {
        return phonecallText;
    }

    public void setPhonecallText(String phonecallText) {
        this.phonecallText = phonecallText;
    }

    public Date getPhonecallTime() {
        return phonecallTime;
    }

    public void setPhonecallTime(Date phonecallTime) {
        this.phonecallTime = phonecallTime;
    }

    @Override
    public String toString() {
        return "Phonecall{" +
                "phonecallText='" + phonecallText + '\'' +
                ", phonecallTime=" + phonecallTime +
                '}';
    }
}
