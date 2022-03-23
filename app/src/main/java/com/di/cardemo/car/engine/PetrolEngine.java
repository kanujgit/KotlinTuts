package com.di.cardemo.car.engine;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine{
    private static final String TAG = "Car";

    int horsePower;
    int engineCapacity;
    @Inject
    public PetrolEngine(@Named("horse power")int horsePower, @Named("engine capacity") int engineCapacity) {
        this.engineCapacity =  engineCapacity;
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine is start with horsepower : "+horsePower +" & capacity : " +engineCapacity);
    }
}
