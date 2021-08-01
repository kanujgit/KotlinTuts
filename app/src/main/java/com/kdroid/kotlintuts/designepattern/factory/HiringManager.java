package com.kdroid.kotlintuts.designepattern.factory;

abstract class HiringManager {

    public void takeInterview() {
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();
    }

    abstract protected Interviewer makeInterviewer();
}
