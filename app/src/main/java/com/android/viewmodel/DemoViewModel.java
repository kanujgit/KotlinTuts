package com.android.viewmodel;

import androidx.lifecycle.ViewModel;

public class DemoViewModel extends ViewModel {
    private final String demo;

    public DemoViewModel(String demo) {
        this.demo = demo;
    }
}
