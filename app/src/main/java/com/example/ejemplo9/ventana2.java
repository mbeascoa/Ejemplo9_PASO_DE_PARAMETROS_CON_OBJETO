package com.example.ejemplo9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class ventana2 extends AppCompatActivity {

    private TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        this.texto1 = (TextView) findViewById(R.id.txtRegistro);

        ArrayList<String> dato = getIntent().getStringArrayListExtra("nombre");

        String cadena="";
        for(int i=0;i<dato.size();i++)
        {
            cadena+=dato.get(i)+"<BR/>";
        }


        this.texto1.setText(Html.fromHtml("<p><h2>CLIENTES:</h2></p>" + cadena)
                , TextView.BufferType.SPANNABLE);
    }

    public void cerrarVentana(View view) {
        finish();
    }

}


