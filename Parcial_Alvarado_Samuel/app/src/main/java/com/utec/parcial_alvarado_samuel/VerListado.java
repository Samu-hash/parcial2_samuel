package com.utec.parcial_alvarado_samuel;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class VerListado extends AppCompatActivity {

    private ListView lvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado_orden);

        this.lvList = findViewById(R.id.lvList);

        UsuariosAdapter uAdapter = new UsuariosAdapter((Context) this, (ArrayList<Usuarios>) Usuarios.obtenerLista());

        this.lvList.setAdapter(uAdapter);
    }
}
