package com.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ndk.NdkDemo;

public class ActivityDemo extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(ActivityDemo.this, NdkDemo.class);
        Bundle bundle = new Bundle();
        bundle.putString("key", "");
        new Activity().setResult(Activity.RESULT_OK, intent);
        new Activity().finish();
    }

}
