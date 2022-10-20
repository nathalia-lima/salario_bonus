import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.next();
        double salarioFixo = input.nextDouble();
        double vendas = input.nextDouble();
        double total = ((vendas * 15) / 100) + salarioFixo;

        System.out.println(String.format("TOTAL = R$ %.2f" , total));
    }
}