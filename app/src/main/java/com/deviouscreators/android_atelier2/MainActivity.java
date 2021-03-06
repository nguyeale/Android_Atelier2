package com.deviouscreators.android_atelier2;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String EXTRA_MESSAGE = "ExtraMessage";
    private int varA;
    private String varB;

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonActivity2 = (Button)findViewById(R.id.button);
        buttonActivity2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                // Intent intent = new Intent("android.media.action.IMAGE_CAPTURE"); Ouvre l'appareil photo
                intent.putExtra(EXTRA_MESSAGE, "Hello World !");
                startActivity(intent);
            }
        });
        final Button buttonFragmentActivity = (Button)findViewById(R.id.button3);
        buttonFragmentActivity.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
                // Intent intent = new Intent("android.media.action.IMAGE_CAPTURE"); Ouvre l'appareil photo
                intent.putExtra(EXTRA_MESSAGE, "Hello World !");
                startActivity(intent);
            }
        });
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
