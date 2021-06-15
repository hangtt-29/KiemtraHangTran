package OneMountConsumer;

import java.util.Scanner;

public class InputPassword {
    public void inputPassword(){
        Scanner sn= new Scanner(System.in);
        System.out.println("Nhập mật khẩu:");
        String input= sn.nextLine();
        if (input.length() < 10) {
            System.out.println("Mật khẩu hơi yếu");
        } else if (!input.matches("[A-Z]+[0-9]+[.,-_...]+")) {
            System.out.println("Mật khẩu chưa đủ mạnh");
        } else {
            System.out.println("Nhập mật khẩu thành công");
        }


    }
}
