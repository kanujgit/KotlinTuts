package com.android.custumobserverpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
        private List<Observer> observers = new ArrayList<>();
        private int state;

        public void registerObserver(Observer observer) {
            observers.add(observer);
        }

        public void unregisterObserver(Observer observer) {
            observers.remove(observer);
        }

        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(state);
            }
        }

        public void setState(int state) {
            this.state = state;
            notifyObservers();
        }

}
