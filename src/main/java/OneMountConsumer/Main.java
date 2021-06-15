package OneMountConsumer;

public class Main {
    public static void main(String[] args) throws InputNumberException {
        DemChuoi d= new DemChuoi();
        System.out.println("You Only Live Once, But if You do it right, once is enough");
        d.demSo();
        d.convertString();
        InputPassword inp= new InputPassword();
        inp.inputPassword();
        NumberInterger num= new NumberInterger();
        num.inputNuber();

    }
}
