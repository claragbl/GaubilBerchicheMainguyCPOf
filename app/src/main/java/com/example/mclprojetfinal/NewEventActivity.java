package com.example.mclprojetfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewEventActivity extends AppCompatActivity {

    public static final String EXTRA_EVENT_NAME = "com.example.mclprojetfinal.EVENT_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);
    }

    public void backMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class); //créer un intent pour passer d'une page à une autre
        EditText eventName = (EditText) findViewById(R.id.eventName);          //intent retourne à la main activity
        String name = eventName.getText().toString();
        intent.putExtra(EXTRA_EVENT_NAME, name);
        startActivity(intent);

    }
    //1) dans l'ensemble de l'activité on selectionne l'ID editText, findViewById = cherche et retourne dans editText
    //2) dans editText on fait un getText pour recup le texte que l'utilisateur à saisie -> message
    //3) putExtra = on met tout ce qu'on a recup (message) dans l'intent

    public void onCreateEvent(View view) {
        backMainActivity(view);
    }
}