package com;

public class Tabung extends BangunRuang{
    int tinggi, jari;
    
    public Tabung(int tinggi, int jari) {
        this.tinggi = tinggi;
        this.jari = jari;
    }
    
    @Override
    double volume(){
        return Math.PI*jari*jari*tinggi;
    }
    
    @Override
    double luasPermukaan(){
        return Math.PI*jari*jari+2*Math.PI*jari*tinggi;
    }
    
    void tampilkan(){
        System.out.println("Volume Tabung : " + volume());
        System.out.println("Luas Permukaan Tabung : " + luasPermukaan());
    }
}
