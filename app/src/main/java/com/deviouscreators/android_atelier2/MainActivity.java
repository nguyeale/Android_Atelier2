package com.deviouscreators.android_atelier2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private int varA;
    private String varB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.v(TAG, "onRestart");
    };

   @Override
    protected void onResume(){
       super.onResume();
        Log.v(TAG, "onResume");
    };

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAG, "onPause");
    };

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAG, "onStop");
    };

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("someVarA", varA);
        outState.putString("someVarB", varB);
        Log.v(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        varA = savedInstanceState.getInt("varA");
        varB = savedInstanceState.getString("varB");
        Log.v(TAG, "onRestoreInstanceState");
    }

}
