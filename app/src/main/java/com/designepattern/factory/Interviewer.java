package com.designepattern.factory;

interface Interviewer {
    void askQuestions();
}

class Developer implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Developer ask question");
    }
}

class CommunityExecutive implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Communicator ask  questions");
    }
}