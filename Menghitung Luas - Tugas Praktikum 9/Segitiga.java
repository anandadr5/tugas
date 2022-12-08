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
class Segitiga extends BangunDatar {

    public Segitiga(double tinggi, double alas) {
        super(0.0, 0.0, tinggi, alas);
    }

    public double luas() {
        return 0.5 * alas * tinggi;
    }

}
