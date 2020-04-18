/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Rezervasyonlar {
    private int seferno;
    private int koltukno;
    private String nereden;
    private String nereye;
    private String tarih;
    private String kacta;
    private String uye;

    public int getSeferno() {
        return seferno;
    }

    public void setSeferno(int seferno) {
        this.seferno = seferno;
    }

    public int getKoltukno() {
        return koltukno;
    }

    public void setKoltukno(int koltukno) {
        this.koltukno = koltukno;
    }

    public String getNereden() {
        return nereden;
    }

    public void setNereden(String nereden) {
        this.nereden = nereden;
    }

    public String getNereye() {
        return nereye;
    }

    public void setNereye(String nereye) {
        this.nereye = nereye;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getKacta() {
        return kacta;
    }

    public void setKacta(String kacta) {
        this.kacta = kacta;
    }

    public String getUye() {
        return uye;
    }

    public void setUye(String uye) {
        this.uye = uye;
    }

    public Rezervasyonlar(int seferno, int koltukno, String nereden, String nereye, String tarih, String kacta, String uye) {
        this.seferno = seferno;
        this.koltukno = koltukno;
        this.nereden = nereden;
        this.nereye = nereye;
        this.tarih = tarih;
        this.kacta = kacta;
        this.uye = uye;
    }
}
