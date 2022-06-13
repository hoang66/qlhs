import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validatesv {
    static Scanner sc = new Scanner(System.in);
    public static final String msv = "[a-zA-Z0-9]";
    public static final String hoten = "[a-zA-Z0-9]";
    public static final String tuoi = "[0-9]";
    public static final String gioitinh = "[a-zA-Z]";
    public static final String diachi = "[a-zA-Z0-9_]";
    public static final String diemmontoan = "[0-9][.][0-9]";
    public static final String diemmonvan = "[0-9][.][0-9]";
    public static final String diemmonhoa = "[0-9][.][0-9]";
    public static final String tendangnhap = "[a-zA-Z0-9]";

    public static final String pass = "[0-9]";
    public static final String pass2 = "[0-9]";

    public static String msv() {
        while (true) {
            String ms = sc.nextLine();
            Pattern p = Pattern.compile(msv);
            Matcher m = p.matcher(ms);
            if (m.matches()) {
                return ms;


            } else {
                System.out.println("khong hop le--Khong duoc dien ky tu dac biet");
               return msv();

            }
        }
    }


    public static String hoten() {
        while (true) {
            String ho = sc.nextLine();
            Pattern p = Pattern.compile(hoten);
            Matcher m = p.matcher(ho);
            if (m.matches()) {
                return ho;

            } else {
                System.out.println("khong hop le--Khong duc dien ky tu dac biet");
               return hoten();
            }
        }
    }

    public static String tuoi() {
        while (true) {

            String t = sc.nextLine();
            Pattern p = Pattern.compile(tuoi);
            Matcher m = p.matcher(t);
            if (m.matches()) {
                return t;

            } else {
                System.out.println("khong hop le--Phai dien so");
              return  tuoi();

            }
        }
    }

    public static String gioitinh() {
        while (true) {

            String gioi = sc.nextLine();
            Pattern p = Pattern.compile(gioitinh);
            Matcher m = p.matcher(gioi);
            if (m.matches()) {
                return gioi;

            } else {
                System.out.println("khong hop le--Phai dien chu");
              return   gioitinh();

            }
        }
    }

    public static String diachi() {
        while (true) {
            String dia = sc.nextLine();
            Pattern p = Pattern.compile(diachi);
            Matcher m = p.matcher(dia);
            if (m.matches()) {
                return dia;

            } else {
                System.out.println("khong hop le");
                diachi();
            }
        }
    }

    public static String diemmontoan() {
        while (true) {
            String toan = sc.nextLine();
            Pattern p = Pattern.compile(diemmontoan);
            Matcher m = p.matcher(toan);
            if (m.matches()) {
                return toan;

            } else {
                System.out.println("khong hop le--Phai dien so Thap phan");
              return diemmontoan();

            }
        }

    }

    public static String diemmonvan() {
        while (true) {
            String van = sc.nextLine();
            Pattern p = Pattern.compile(diemmonvan);
            Matcher m = p.matcher(van);
            if (m.matches()) {
                return van;

            } else {
                System.out.println("khong hop le--Phai dien so Thap phan");
               return diemmonvan();

            }
        }
    }

    public static String diemmonhoa() {
        while (true) {
            String hoa = sc.nextLine();
            Pattern p = Pattern.compile(diemmonhoa);
            Matcher m = p.matcher(hoa);
            if (m.matches()) {
                return hoa;


            } else {
                System.out.println("khong hop le--Phai dien so Thap phan");
              return   diemmonhoa();

            }
        }
    }
    public static String tendangnhap(){
        while (true){
            String dn=sc.nextLine();
            Pattern p = Pattern.compile(tendangnhap);
            Matcher m=p.matcher(dn);
            if (m.matches()){
                return dn;
            }else {
                tendangnhap();
            }
        }
    }
    public static String pass() {
        while (true) {
            String ps = sc.nextLine();
            Pattern p = Pattern.compile(pass);
            Matcher m = p.matcher(ps);
            if (m.matches()) {
                return ps;

            } else {
                System.out.println("khong hop le--phai dien so");
                pass();

            }
        }

    }


    public static String pass2() {
        while (true){
        String p2 = sc.nextLine();
        Pattern p = Pattern.compile(pass2);
        Matcher m = p.matcher(p2);
        if (m.matches()) {
           return p2;

        } else {
            System.out.println("khong hop le--phai dien so");
                return pass2();

            }
        }
    }
}







