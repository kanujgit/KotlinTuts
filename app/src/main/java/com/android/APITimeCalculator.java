package com.android;

import java.util.HashMap;
import java.util.Map;


public class APITimeCalculator {

    private static final String TAG = "APITimeCalculator";
    private Map<String, TimeSummary> timeSummaries;

    public APITimeCalculator() {
        timeSummaries = new HashMap<>();
    }

    public void startAPICall(String apiCallId) {
        long startTime = System.currentTimeMillis();
        TimeSummary timeSummary = new TimeSummary(startTime);
        timeSummaries.put(apiCallId, timeSummary);
    }

    public void endAPICall(String apiCallId, String eventName) {
        long endTime = System.currentTimeMillis();
        TimeSummary timeSummary = timeSummaries.get(apiCallId);
        if (timeSummary != null) {
            timeSummary.setEventName(eventName);
            timeSummary.setEndTime(endTime);
        }
    }

    public void generateTimeSummaries() {
        for (Map.Entry<String, TimeSummary> entry : timeSummaries.entrySet()) {
            String apiCallId = entry.getKey();
            TimeSummary timeSummary = entry.getValue();

            System.out.println("API Call ID: " + apiCallId);
            timeSummary.generateSummary();
        }
    }

    // Inner class representing a single time summary
    private static class TimeSummary {
        private long startTime;
        private long endTime;
        private String eventName;

        public TimeSummary(long startTime) {
            this.startTime = startTime;
        }

        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public void generateSummary() {
            long elapsedTime = endTime - startTime;
            System.out.println("Event: " + eventName);
            System.out.println("Start Time: " + startTime);
            System.out.println("End Time: " + endTime);
            System.out.println("Time Consumed: " + elapsedTime + " milliseconds");
        }
    }

    // Usage example
    // Usage example
    public static void main(String[] args) {
        APITimeCalculator apiTimeCalculator = new APITimeCalculator();

        // Start API call 1
        String apiCall1Id = "API_CALL_1";
        apiTimeCalculator.startAPICall(apiCall1Id);

        // Simulating API call 1
        // Replace this with your actual API call
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Start API call 2
        String apiCall2Id = "API_CALL_2";
        apiTimeCalculator.startAPICall(apiCall2Id);

        // Simulating API call 2
        // Replace this with your actual API call
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // End API call 2
        String eventName2 = "API Call 2";
        apiTimeCalculator.endAPICall(apiCall2Id, eventName2);


        // End API call 1
        String eventName1 = "API Call 1";
        apiTimeCalculator.endAPICall(apiCall1Id, eventName1);

        apiTimeCalculator.generateTimeSummaries();
    }
}



