package com.example.vasistartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class name extends AppCompatActivity {

    private Button savenotebutton1;
    private SharedPreferences savednotes;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        Button name = (Button) findViewById(R.id.name);
        EditText editText = (EditText) findViewById(R.id.name_text);
        SharedPreferences savedvehicles = getSharedPreferences("notes", MODE_PRIVATE);

        editText.setText(savedvehicles.getString("tag", "Default Value"));

        name.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(v.getContext(), my_vehicle.class);
                v.getContext().startActivity(intent);}
        });
    }
}