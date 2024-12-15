
package model;

import java.sql.Time;

public class CaTruc{
    
    int maCaTruc;
    Time gioBatDau;
    Time gioKetCa;

    public int getMaCaTruc() {
        return maCaTruc;
    }

    public void setMaCaTruc(int maCaTruc) {
        this.maCaTruc = maCaTruc;
    }

    public Time getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(Time gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public Time getGioKetCa() {
        return gioKetCa;
    }

    public void setGioKetCa(Time gioKetCa) {
        this.gioKetCa = gioKetCa;
    }

}
