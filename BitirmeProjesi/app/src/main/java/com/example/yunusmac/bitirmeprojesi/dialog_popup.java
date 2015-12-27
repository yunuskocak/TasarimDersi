package com.example.yunusmac.bitirmeprojesi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class dialog_popup extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_popup);

        Button btnEkle=(Button)findViewById(R.id.btnYeniKayit);


        btnEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(dialog_popup.this, icerikislemleri.class);
                startActivity(i);

            }
        });





    }

}
