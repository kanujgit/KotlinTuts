package com.designepattern.factory;

public class MarketingManager extends HiringManager{
    @Override
    protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
