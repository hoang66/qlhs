import java.util.Scanner;

public class Dangnhap  {
    public void Dangnhap(){

        String username ="hoang";
        String   password = "1";
        String guessUser ;
        String guessPass ;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("nhap username: ");
        guessUser = scanner.nextLine();
        System.out.println("nhap password: ");
        guessPass = scanner.nextLine();
        if ((username.equals( guessUser)) && (password.equals( guessPass))) {
            QL ql = new QL();
            while (true) {
                ql.Menu();
break;
            }
        }

        else if ((QL.sv.get(i).getTendangnhap().equals( guessUser)) && (QL.sv.get(i).getPass().equals( guessPass))) {
            QL ql = new QL();
            while (true) {
                ql.Menusv();
                break;
            }

        } else
            System.out.println("Dang nhap sai--Dang nhap lai");
        while (true) {
            QL ql = new QL();
            ql.Dangnhap();
break;
        }
    }
}

