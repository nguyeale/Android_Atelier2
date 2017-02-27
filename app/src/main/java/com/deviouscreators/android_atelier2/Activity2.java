package com.deviouscreators.android_atelier2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "ExtraMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        editText.setText(message);
    }
}
