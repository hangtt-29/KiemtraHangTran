package OneMountConsumer;

public class DemChuoi {

    String str = "You Only Live Once, But if You do it right, once is enough";

    public void demSo() {
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                dem = dem + 1;
            }
        }
        System.out.println("Đếm số in hoa trong chuỗi trên :" + dem);
    }

    public void convertString() {
        str = str.toLowerCase();
        boolean needtoUpperCase = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') continue;
            if (needtoUpperCase) {
                char temp = Character.toUpperCase(str.charAt(i));
                str = str.substring(0, i) + temp + str.substring(i+1);
                needtoUpperCase = false;
            }
            if (str.charAt(i) == '.') needtoUpperCase = true;
        }
        System.out.println("Chuỗi sau khi đổi: \n" + str);
    }
}


