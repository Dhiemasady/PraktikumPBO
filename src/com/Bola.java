package com;

public class Bola extends BangunRuang{
    int jari;
    float jari2;
    
    public Bola(int jari) {
        this.jari = jari;
        super.setWarna("Merah");
    }
    
    public Bola(float jari2) {
        this.jari2 = jari2;
        super.setWarna("Merah");
    }
    
    @Override
    double volume(){
        return Math.PI*jari*jari*jari*4/3;
    }
    
    
    float volume(float jari2){
        return (float) (Math.PI*jari2*jari2*jari2*4/3);
    }
    
    
    double luasPermukaan(float jari2){
        return Math.PI*jari*jari*4;
    }
    
    
    double luasPermukaan(int jari2){
        return (float) (Math.PI*jari2*jari2*4);
    }
    
    void tampilkan(){
        System.out.println("Volume Bola : " + volume());
        System.out.println("Luas Permukaan Bola : " + luasPermukaan(jari2));
        System.out.println("Warna : " + super.getWarna());
    }

    @Override
    double luasPermukaan() {
        // TODO Auto-generated method stub
        return 0;
    }
}