package OneMountConsumer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInterger {
    public int inputNuber() throws InputNumberException{
        Scanner sn = new Scanner(System.in);
        int input;
        try {
            System.out.println("Nhập vào 1 số nguyên dương:");
            input = Integer.valueOf(sn.nextLine());
            if (input>=12 || input<=0) throw new InputNumberException("Số nhập vào không phải là tháng trong năm");
            else {
                System.out.println("sô nhập vào là tháng trong năm");
                checkNgay(input);
            }

        } catch (InputMismatchException e){
            throw new InputNumberException("Cần nhập số");
        }
        return input;

    }
    public void checkNgay(int ngay) {
        switch (ngay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Là Tháng 31 ngày");
                break;
            case 2:
                System.out.println("Là Tháng có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Là Tháng có 30 ngày");
                break;


        }

    }


}
