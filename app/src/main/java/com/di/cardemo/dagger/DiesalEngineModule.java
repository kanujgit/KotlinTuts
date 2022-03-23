package com.di.cardemo.dagger;

import com.di.cardemo.car.engine.DieselEngine;
import com.di.cardemo.car.engine.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DiesalEngineModule {

    int horsePower;

    public DiesalEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine dieselEngine){
        return  dieselEngine;
    }

}
