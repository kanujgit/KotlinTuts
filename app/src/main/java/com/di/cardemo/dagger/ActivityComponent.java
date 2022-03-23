package com.di.cardemo.dagger;

import com.di.cardemo.CarDaggerDemoActivity;
import com.di.cardemo.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Activity
@Component (modules = {WheelModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(CarDaggerDemoActivity activity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        ActivityComponent build();
    }

}

