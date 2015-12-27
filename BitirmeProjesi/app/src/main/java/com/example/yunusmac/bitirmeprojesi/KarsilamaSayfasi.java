package com.example.yunusmac.bitirmeprojesi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class KarsilamaSayfasi extends ActionBarActivity {

    String[] dersler= { "Matematik","Fizik" ,"Kimya"};
    String[] konular= { "Sayilar","Kesirler" ,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karsilama_sayfasi);

        Button btnIcerık = (Button) findViewById(R.id.btnIcerik);
        Spinner spnDersler =(Spinner)findViewById(R.id.spinner);
        Spinner spnKonular =(Spinner)findViewById(R.id.spinner2);


        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, dersler);

        aa.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spnDersler.setAdapter(aa);

        aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, konular);

        aa.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spnKonular.setAdapter(aa);


        btnIcerık.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent( KarsilamaSayfasi.this,IcerikEkrani.class);
                startActivity(i);

            }
        });


    }

}
