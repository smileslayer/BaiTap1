/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linhp
 */
public class HocSinh extends CaNhan {
    private String lop, nangKhieu;

    public HocSinh(String lop, String nangKhieu, String hoTen, String diaChi, String sdt, int tuoi) {
        super(hoTen, diaChi, sdt, tuoi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    public String hienTT() {
        return "Ho Ten: " + super.getHoTen() + ". Tuoi: " + super.getTuoi() + ".Dia chi: " + super.getDiaChi() + ".SDT: " + super.getSdt() + ".Lop: " + this.lop + ". Nang Khieu: " + this.nangKhieu;
    }
}
