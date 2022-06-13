import java.io.Serializable;

public class Qlsv extends QL implements Serializable {


    String msv;
    String hoten;
    String tuoi;
    String gioitinh;
    String diachi;
    String diemmontoan;
    String diemmonvan;
    String diemmonhoa;

    double tinhdiemtrungbinh;
    String tendangnhap;
    String pass;
    String pass2;



    public Qlsv(String msv, String hoten, String tuoi, String gioitinh, String diachi, String diemmontoan, String diemmonvan, String diemmonhoa, double tinhdiemtrungbinh, String tendangnhap, String pass, String pass2) {
        this.msv = msv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.diemmontoan = diemmontoan;
        this.diemmonvan = diemmonvan;
        this.diemmonhoa = diemmonhoa;
        this.tinhdiemtrungbinh = Double.parseDouble(String.valueOf(tinhdiemtrungbinh));
        this.tendangnhap=tendangnhap;
        this.pass=pass;
        this.pass2=pass2;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDiemmontoan() {
        return diemmontoan;
    }

    public void setDiemmontoan(String diemmontoan) {
        this.diemmontoan = diemmontoan;
    }

    public String getDiemmonvan() {
        return diemmonvan;
    }

    public void setDiemmonvan(String diemmonvan) {
        this.diemmonvan = diemmonvan;
    }

    public String getDiemmonhoa() {
        return diemmonhoa;
    }

    public void setDiemmonhoa(String diemmonhoa) {
        this.diemmonhoa = diemmonhoa;
    }

    public double getTinhdiemtrungbinh() {
        return tinhdiemtrungbinh;
    }

    public void setTinhdiemtrungbinh(double tinhdiemtrungbinh) {
        this.tinhdiemtrungbinh = tinhdiemtrungbinh;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }

    @Override
    public String toString() {
        return "Qlsv{" +
                "msv='" + msv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + gioitinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", diemmontoan='" + diemmontoan + '\'' +
                ", diemmonvan='" + diemmonvan + '\'' +
                ", diemmonhoa='" + diemmonhoa + '\'' +
                ", tinhdiemtrungbinh=" + tinhdiemtrungbinh +
                ", tendangnhap='" + tendangnhap + '\'' +
                ", pass='" + pass + '\'' +
                ", pass2='" + pass2 + '\'' +
                '}';
    }
}


