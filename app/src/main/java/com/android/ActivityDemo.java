package com.android;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.android.viewmodel.DemoViewModel;
import com.android.viewmodel.DemoViewModelFactory;
import com.ndk.NdkDemo;

import java.util.List;

public class ActivityDemo extends AppCompatActivity {

    private DemoViewModel demoViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        demoViewModel = ViewModelProviders.of(this,
                new DemoViewModelFactory(""))
                .get(DemoViewModel.class);

        Intent intent = new Intent(ActivityDemo.this, NdkDemo.class);
        Bundle bundle = new Bundle();
        bundle.putString("key", "");
        new Activity().setResult(Activity.RESULT_OK, intent);
        new Activity().finish();
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

}
