package com.example.youchowmein.fastec;

import android.app.Application;
import android.os.Bundle;

public class MainActivity extends Application {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
