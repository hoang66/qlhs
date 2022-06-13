

import java.util.ArrayList;
import java.util.Scanner;


public class QL extends Dangnhap {

    static io ghi = new io();

    static ArrayList<Qlsv> sv = ghi.reader();
    static Scanner sc = new Scanner(System.in);
    public void Menusv() {
        System.out.println("nhap pass 2");
            String pass2 = sc.nextLine();
                show1(pass2);

        }

    public  void Menu(){
        System.out.println("1.xem danh sach sv");
        System.out.println("2.them moi");
        System.out.println("3.cap nhat");
        System.out.println("4.xoa");
        System.out.println("5.sap xep");
        System.out.println("6.doc tu file");
        System.out.println("7.ghi vao file");
        System.out.println("8.dang xuat");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                show();
                break;
            case 2:
                addsv(taosv());
                break;
            case 3:
                System.out.println("ma sinh vien muon sua");
                String msv1=sc.nextLine();
                edit(checksv(msv1),taosv());

                break;
            case 4:
                System.out.println("nhap msv");
                String msv=sc.nextLine();
                delete(checksv(msv));
                break;
            case 5:
                sapxep();
                break;

            case 6:
                ghi.reader();
                break;
            case 7:
                ghi.write(sv);
                break;
            case 8:
                Dangnhap();
                break;
        }
    }


    public Qlsv taosv() {
        System.out.println("msv");
        //   String msv= sc.nextLine();
        String msv = Validatesv.msv();
        System.out.println("ho ten");
        String hoten = Validatesv.hoten();
        //  String hoten=sc.nextLine();
        System.out.println("tuoi");
         String tuoi= Validatesv.tuoi();
       // String tuoi = sc.nextLine();
        System.out.println("gioi tinh");
        String gioitinh = Validatesv.gioitinh();
        //  String gioitinh=sc.nextLine();
        System.out.println("dia chi");
        String diachi = Validatesv.diachi();
        // String diachi=sc.nextLine();
        System.out.println("1.diem mon toan");
        String diemmontoan = Validatesv.diemmontoan();
        System.out.println("2.diem mon van");
        String diemmonvan = Validatesv.diemmonvan();
        System.out.println("3.diem mon hoa");
        String diemmonhoa = Validatesv.diemmonhoa();

        String tendangnhap ;
        while (true){
            boolean checkuser=true;
        System.out.println("4.ten dang nhap");
        tendangnhap = sc.nextLine();
        for (int i = 0; i < sv.size(); i++) {
            if (sv.get(i).getTendangnhap().equals(tendangnhap)) {
                checkuser=false;
                break;
            }
        }
        if (checkuser){
            break;
        }else System.out.println("UserName dda trung");
        }
        System.out.println("5.pass");
        String pass = Validatesv.pass();
        System.out.println("6.pass2");
        String pass2 = Validatesv.pass2();
        double tinhdiemtrungbinh = (Math.round((((Double.parseDouble(diemmontoan)) + (Double.parseDouble(diemmonvan)) + (Double.parseDouble(diemmonhoa))) / 3) * 10.0) / 10.0);
        return new Qlsv(msv, hoten, tuoi, gioitinh, diachi, diemmontoan, diemmonvan, diemmonhoa, tinhdiemtrungbinh, tendangnhap, pass, pass2);
    }

    public void addsv(Qlsv sv1){
        sv.add(sv1);

    }
    public  void show(){
        for (Qlsv sv1 : sv) {
            System.out.println(sv1);
        }
    }
    public  void show1(String pass2){
        for (int i = 0; i < sv.size(); i++) {
           if (i == checksv2(pass2)){
              System.out.println(sv.get(i).toString());
              break;
           }
        }
    }
    public  int checksv(String msv){
        int index=-1;
        for(int i=0;i<sv.size();i++){
            if(sv.get(i).getMsv().equals(msv)){
                index=i;
                return index;
            }
        }

        return index;
    }
    public  int checksv2(String pass2){
        int index=-1;
        for(int i=0;i<sv.size();i++){
            if(sv.get(i).getPass2().equals(pass2)){
                index=i;
                return index;
            }
        }

        return index;
    }
    public void delete(int index){
        sv.remove(index);
    }
    public void edit(int index, Qlsv qlsv){
        sv.set(index,qlsv);
    }
    public void sapxep(){
        System.out.println("1.sap xep tang");
        System.out.println("2.sap xep giam");
        System.out.println("3.menu");
        switch (Integer.parseInt(sc.nextLine())){
            case 1 :
                sv.sort(new Sorttang());
                break;
            case 2:
                sv.sort(new Sortgiam());
                break;
            case 3:
                Menu();
                break;

        }
    }

}

