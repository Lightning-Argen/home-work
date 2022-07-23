package com.company;

public class Class {

    private int san;
    private String soz;
    private int[] massiv;


    public Class(int san, String soz, int [] massiv) {
        this.san = san;
        this.soz = soz;
        for (int a : massiv) {
            System.out.println(a);
        }
    }

    public int getSan() {
        return san;
    }

    public void setSan(int san) {
        this.san = san;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMassiv() {
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }
}
