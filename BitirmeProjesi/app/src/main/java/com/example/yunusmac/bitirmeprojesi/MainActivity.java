package com.example.yunusmac.bitirmeprojesi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGiris = (Button) findViewById(R.id.btnGiris);
        Button btnSifreHatirlat = (Button) findViewById(R.id.btnSifreHatirlat);

        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,KarsilamaSayfasi.class);
            startActivity(i);

            }
        });

        btnSifreHatirlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,sifre_hatirlat.class);
                startActivity(i);

            }
        });


    }
}
