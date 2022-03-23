package com.di.cardemo.car;

import android.util.Log;

import com.di.cardemo.car.driver.Driver;
import com.di.cardemo.car.engine.Engine;
import com.di.cardemo.car.engine.PetrolEngine;
import com.di.cardemo.car.remote.Remote;
import com.di.cardemo.car.wheel.Wheel;
import com.di.cardemo.dagger.Activity;

import javax.inject.Inject;

@Activity
public class Car {
    private static final String TAG = "Car";

  //  @Inject Remote remote;

    private Wheel wheel;
    private Engine engine;
    private Driver driver;

    // constructor injection
    @Inject
    public Car(Wheel wheel,Engine engine,Driver driver) {
        this.wheel = wheel;
        this.engine =engine;
        this.driver = driver;
    }

    // method injection
    @Inject
    public void enableRemote(Remote remote){
        remote.setRemoteListener(this);
    }

    public String drive(){
        engine.start();
        Log.d(TAG, "Driver "+driver+" drive car ");
        return "Driving";

    }
}
