package Records;

public class Main {
    public static void main(String[] args) {
        Ninja ninja1 = new Ninja("Naruto",9999999,"naruto@email.com.br");
        NinjaRecord ninja2 = new NinjaRecord("Sasuke",1111111,"sasuke@email.com.br");
        System.out.println(ninja1);
        System.out.println(ninja2);
    }
}
