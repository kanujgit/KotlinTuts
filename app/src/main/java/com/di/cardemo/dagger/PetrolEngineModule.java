package com.di.cardemo.dagger;

import com.di.cardemo.car.engine.Engine;
import com.di.cardemo.car.engine.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

//    @Provides
//    Engine provideEngine(PetrolEngine engine){
//        return engine;
//    }

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
