package com.di.cardemo.car.remote;

import android.util.Log;

import com.di.cardemo.car.Car;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {
    }

    public void setRemoteListener(Car car){
        Log.d(TAG, "Remote is connected..");
    }
}
