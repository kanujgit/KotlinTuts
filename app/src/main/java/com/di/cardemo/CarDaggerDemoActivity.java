package com.di.cardemo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.di.cardemo.car.Car;
import com.di.cardemo.dagger.ActivityComponent;
import com.kotlintuts.R;

import javax.inject.Inject;

public class CarDaggerDemoActivity extends AppCompatActivity {

    @Inject
    Car car1;
//    @Inject
//    Car car2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_demo_main);
        //CarComponent carComponent = DaggerCarComponent.create();

//        CarComponent carComponent = DaggerCarComponent.builder().
//                diesalEngineModule(new DiesalEngineModule(10)).
//                build();

//        CarComponent component = DaggerCarComponent.builder()
//                .engineCapacity(100)
//                .horsePower(10)
//                .build();
        ActivityComponent component = ((App)getApplication()).getAppComponent();
        component.inject(this);

        String text;
        text = car1.drive();
       // text = car2.drive();



        TextView view = findViewById(R.id.text);
        view.setText(text);
    }
}
