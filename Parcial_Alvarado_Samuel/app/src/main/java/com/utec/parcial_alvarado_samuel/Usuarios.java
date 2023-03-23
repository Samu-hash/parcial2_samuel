package com.utec.parcial_alvarado_samuel;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

    private String name;
    private String post;
    private String company;
    private String photoString;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhotoString() {
        return photoString;
    }

    public void setPhotoString(String photoString) {
        this.photoString = photoString;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    public static List<Usuarios> obtenerLista(){

        List<Usuarios> lu = new ArrayList<>();

        Usuarios u= new Usuarios();
        u.setName("Alexander Pierrot");
        u.setPost("CEO");
        u.setCompany("Insures S.O.");
        u.setPhotoString("lead_photo_1");
        u.setPhoto(R.drawable.lead_photo_1);
        lu.add(u);
        u= new Usuarios();
        u.setName("Carlos Lopez");
        u.setPost("CEO");
        u.setCompany("Hospital Blue");
        u.setPhotoString("lead_photo_2");
        u.setPhoto(R.drawable.lead_photo_2);
        lu.add(u);
        u= new Usuarios();
        u.setName("Sara Bonz");
        u.setPost("Directora de Marketing");
        u.setCompany("Electrical Parts Itd");
        u.setPhotoString("lead_photo_3");
        u.setPhoto(R.drawable.lead_photo_3);
        lu.add(u);
        u= new Usuarios();
        u.setName("Liliana Clarence");
        u.setPost("Diseñadora de Producto");
        u.setCompany("Creativa App");
        u.setPhotoString("lead_photo_4");
        u.setPhoto(R.drawable.lead_photo_4);
        lu.add(u);
        u= new Usuarios();
        u.setName("Benito Peralta");
        u.setPost("Supervisor de ventas");
        u.setCompany("Neumáticos Press");
        u.setPhotoString("lead_photo_5");
        u.setPhoto(R.drawable.lead_photo_5);
        lu.add(u);
        u= new Usuarios();
        u.setName("Juan Jaramillo");
        u.setPost("CEO");
        u.setCompany("Banco Nacional");
        u.setPhotoString("lead_photo_6");
        u.setPhoto(R.drawable.lead_photo_6);
        lu.add(u);
        u= new Usuarios();
        u.setName("Christian Steps");
        u.setPost("CTO");
        u.setCompany("Cooperativa Verde");
        u.setPhotoString("lead_photo_7");
        u.setPhoto(R.drawable.lead_photo_7);
        lu.add(u);
        u= new Usuarios();
        u.setName("Alexa Giraldo");
        u.setPost("Lead Programmer");
        u.setCompany("Flutisofy");
        u.setPhotoString("lead_photo_8");
        u.setPhoto(R.drawable.lead_photo_8);
        lu.add(u);
        u= new Usuarios();
        u.setName("Linda Murillo");
        u.setPost("Directora de Marketing");
        u.setCompany("ISeguros Boliver.");
        u.setPhotoString("lead_photo_9");
        u.setPhoto(R.drawable.lead_photo_9);
        lu.add(u);
        u= new Usuarios();
        u.setName("Lizeth Astrada");
        u.setPost("CEO");
        u.setCompany("Concesionario Motolox");
        u.setPhotoString("lead_photo_10");
        u.setPhoto(R.drawable.lead_photo_10);
        lu.add(u);
        u= new Usuarios();
        u.setName("Samuel Alvarado");
        u.setPost("Desarrollador Java");
        u.setCompany("Stefanini");
        u.setPhotoString("lead_photo_11");
        u.setPhoto(R.drawable.lead_photo_11);
        lu.add(u);
        return lu;
    }
}
