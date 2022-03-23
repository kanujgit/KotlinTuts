package com.di.cardemo;

import android.app.Application;

import com.di.cardemo.dagger.ActivityComponent;
import com.di.cardemo.dagger.DaggerActivityComponent;

public class App extends Application {

    private ActivityComponent component;

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
