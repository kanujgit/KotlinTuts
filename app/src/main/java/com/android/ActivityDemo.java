package com.android;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.android.viewmodel.DemoViewModel;
import com.android.viewmodel.DemoViewModelFactory;
import com.kotlintuts.R;
import com.ndk.NdkDemo;

import java.util.List;

public class ActivityDemo extends AppCompatActivity {

    private DemoViewModel demoViewModel;


    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {

            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        demoViewModel = ViewModelProviders.of(this,
                new DemoViewModelFactory(""))
                .get(DemoViewModel.class);

        Intent intent = new Intent(ActivityDemo.this, NdkDemo.class);
        Bundle bundle = new Bundle();
        bundle.putString("key", "");
        new Activity().setResult(Activity.RESULT_OK, intent);
        new Activity().finish();

        EditText editText ;
        MyWatcher myWatcher = new MyWatcher();
    }


    class MyWatcher implements TextWatcher{

        private EditText editText;
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            editText.addTextChangedListener(this);
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

    private void shareContact(Intent intent){
        List<ResolveInfo> infoList = getPackageManager().queryIntentActivities(intent, PackageManager.MATCH_ALL);
        if(infoList.size()>1){
            String title = "Share Contact";
            Intent chooser = Intent.createChooser(intent,title);
            startActivity(chooser);
        }else if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        //getSupportFragmentManager().beginTransaction().replace(R.id.ghost_view, Sampler()).commit()
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //getSupportFragmentManager().beginTransaction().replace(R.id.ghost_view, Sampler()).commit()
    }
}
