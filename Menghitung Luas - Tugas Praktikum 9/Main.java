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
class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(10.0, 2.0);
        PersegiPanjang persegipanjang = new PersegiPanjang(5.1, 5.34);

        System.out.println("Luas Segitiga: " +segitiga.luas());

        System.out.println("Luas Persegi Panjang: " +persegipanjang.luas());
    }
}