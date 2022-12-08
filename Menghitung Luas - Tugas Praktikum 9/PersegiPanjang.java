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
class PersegiPanjang extends BangunDatar {

    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar, 0.0, 0.0);
    }

    public double luas() {
        return panjang * lebar;
    }

}

