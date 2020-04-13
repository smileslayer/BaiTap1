/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linhp
 */
public class GiaoVien extends CaNhan {
    private String monDay, toBoMon;

    public GiaoVien(String monDay, String toBoMon, String hoTen, String diaChi, String sdt, int tuoi) {
        super(hoTen, diaChi, sdt, tuoi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
    public String hienTT() {
        return "Ho Ten: " + super.getHoTen() + ". Tuoi: " + super.getTuoi() + ".Dia chi: " + super.getDiaChi() + ".SDT: " + super.getSdt() + ".Mon Day: " + this.monDay + ".To Bo Mon: " + this.toBoMon;
    }
}
