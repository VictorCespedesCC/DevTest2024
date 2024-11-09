package com.victor.devTest.Model;


public class Vote {
    private int id;
    private int pollId;
    private int optionId;
    private String voterEmail;

    public Vote(int id, int pollId, int optionId, String voterEmail){
        this.id = id;
        this.pollId = pollId;
        this.optionId = optionId;
        this.voterEmail = voterEmail;
    }
}
