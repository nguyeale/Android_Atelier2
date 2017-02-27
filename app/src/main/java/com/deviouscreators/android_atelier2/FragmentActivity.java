package com.deviouscreators.android_atelier2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentActivity extends android.support.v4.app.FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
