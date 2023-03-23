package com.utec.parcial_alvarado_samuel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private TableLayout tl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tl = findViewById(R.id.tlData);

        for(Usuarios u : Usuarios.obtenerLista()){
            var register= LayoutInflater.from(this).inflate(R.layout.table_row, null, false);


        }
    }


}