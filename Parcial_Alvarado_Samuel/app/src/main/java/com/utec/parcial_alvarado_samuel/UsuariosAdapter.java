package com.utec.parcial_alvarado_samuel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UsuariosAdapter extends ArrayAdapter<Usuarios> {

    public UsuariosAdapter(Context c, ArrayList<Usuarios> u){
        super(c, 0, u);
    }

    @Override
    public View getView(int position, View v, ViewGroup vg){

        Usuarios u = getItem(position);

        if(v == null)
            v = LayoutInflater.from(getContext())
                .inflate(R.layout.empleado, vg, false);


        TextView tvNameDeta =  v.findViewById(R.id.tvNameDeta);
        TextView tvPostDeta = v.findViewById(R.id.tvPostDeta);
        TextView tvCompanyDeta = v.findViewById(R.id.tvCompanyDeta);
        ImageView imPhoto = v.findViewById(R.id.imPhoto);

        tvNameDeta.setText(u.getName());
        tvPostDeta.setText(u.getPost());
        tvCompanyDeta.setText(u.getCompany());
        imPhoto.setImageResource(u.getPhoto());


        return v;
    }
}
