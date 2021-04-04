package com;

public abstract class BangunRuang {
    private String warna;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    abstract double volume();
    abstract double luasPermukaan();
}
