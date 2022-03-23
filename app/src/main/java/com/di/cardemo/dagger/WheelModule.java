package com.di.cardemo.dagger;

import com.di.cardemo.car.wheel.Rims;
import com.di.cardemo.car.wheel.Tires;
import com.di.cardemo.car.wheel.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    public static Rims provideRims(){
        return new Rims();
    }

    @Provides
    public static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheel provideWheel(Rims rims,Tires tires){
        return new Wheel(rims,tires);
    }


}
