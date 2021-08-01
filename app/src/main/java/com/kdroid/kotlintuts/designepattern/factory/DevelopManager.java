package com.kdroid.kotlintuts.designepattern.factory;

class DevelopManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
