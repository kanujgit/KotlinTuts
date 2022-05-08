package com.di.cardemo;

import android.app.Application;

import com.di.cardemo.dagger.ActivityComponent;
import com.di.cardemo.dagger.DaggerActivityComponent;
import com.techyourchance.coroutines.common.dependencyinjection.ApplicationCompositionRoot;

public class App extends Application {

    private ActivityComponent component;
    ApplicationCompositionRoot applicationCompositionRoot = new ApplicationCompositionRoot();


    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerActivityComponent.builder()
                .horsePower(100)
                .engineCapacity(12)
                .build();
    }

    public ActivityComponent getAppComponent() {
        return component;
    }
}
