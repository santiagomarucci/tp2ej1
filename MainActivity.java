package com.aplicacionesmoviles.tp2ej1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensaje(View view){
    Toast toast;
        toast=Toast.makeText(this,"hola",Toast.LENGTH_SHORT);
        toast.show();
    }
}
