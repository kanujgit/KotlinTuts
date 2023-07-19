package com.android.custumobserverpattern;

public class ConcreteObserver implements Observer {
        private int observerState;

        public void update(int state) {
            observerState = state;
            // Perform necessary actions based on the updated state
        }
}
