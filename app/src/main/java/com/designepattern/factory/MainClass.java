package com.designepattern.factory;

public class MainClass {
    public static void main(String[] args) {
        DevelopManager developManager = new DevelopManager();
        developManager.takeInterview();

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.takeInterview();
    }
}
