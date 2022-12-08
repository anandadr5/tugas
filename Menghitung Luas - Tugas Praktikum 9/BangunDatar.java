/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenghitungLuas_TugasPraktikum9;

/**
 *
 * @author Ananda Dwi Rizkyta
 */
class BangunDatar {
    
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected double alas;

    BangunDatar(double panjang, double lebar, double tinggi, double alas) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.alas = alas;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

}

