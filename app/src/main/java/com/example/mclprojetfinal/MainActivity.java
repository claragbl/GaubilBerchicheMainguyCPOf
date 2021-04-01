package com.example.mclprojetfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("METHOD","MainActivity.onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra(NewEventActivity.EXTRA_EVENT_NAME);
            Log.d("METHOD", "name " + name);
        }
    }

    /** Called when the user taps the Send button */
    public void openNewEventActivity(View view) {
        Intent intent = new Intent(this, NewEventActivity.class);
        startActivity(intent);
    }
}


