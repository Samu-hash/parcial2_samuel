package com.utec.parcial_alvarado_samuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TableLayout tl;

    private Button btnVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tl = findViewById(R.id.tlData);
        this.btnVer = findViewById(R.id.btnVer);

        boolean value = false;
        for(Usuarios u : Usuarios.obtenerLista()){
            View v = LayoutInflater.from(this).inflate(R.layout.table_row, null, false);

            TextView tvName =  v.findViewById(R.id.tvName);
            TextView tvPost = v.findViewById(R.id.tvPost);
            TextView tvCompany = v.findViewById(R.id.tvCompany);
            TextView tvPhoto = v.findViewById(R.id.tvPhoto);

            tvName.setText(u.getName());
            tvPost.setText(u.getPost());
            tvCompany.setText(u.getCompany());
            tvPhoto.setText(u.getPhotoString());

            tl.addView(v);
        }
    }

    public void verData(View v){
        startActivity(new Intent(this, VerListado.class));
    }

}