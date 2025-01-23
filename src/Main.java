//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("apple", "16 pro");
        String msg = phone1.call("123456");
        System.out.println(msg);

        Smartphone smartphone1 = new Smartphone("apple", "15 pro max");
        smartphone1.photograph();
        smartphone1.alarm();
        System.out.println(smartphone1.call("321"));
    }
}