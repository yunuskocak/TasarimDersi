package com.example.yunusmac.bitirmeprojesi;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class IcerikEkrani extends ActionBarActivity {

    private String[] icerikler =
            {"Tam Sayilar", "Pozitif Tam Sayilar", "Negatif Tam Sayilar", "Rasyonel Sayilar","Irrasyonel Sayilar",
                    "Dogal Sayilar", "Sayma Sayilari", "Reel Sayilar", "Karmasik Sayilar"};
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icerik_ekrani);
      /*  Button btnIcerıkEkle = (Button) findViewById(R.id.btnEkle);

        btnIcerıkEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IcerikEkrani.this, icerikislemleri.class);
                startActivity(i);

            }
        });*/


        ListView lstIcerik=(ListView)findViewById(R.id.lstIcerikler);

        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, icerikler);

        //(C) adımı
        lstIcerik.setAdapter(veriAdaptoru);

        lstIcerik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                dialog = new Dialog(IcerikEkrani.this);
                dialog.setContentView(R.layout.activity_dialog_popup);
                dialog.setTitle("Islem Listesi");
                dialog.show();
            }

            catch(Exception ex)
            {


            }
            }
        });

        /*lstIcerik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          */
/*


            }
        });*/
    }

}
