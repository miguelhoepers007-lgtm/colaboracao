import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double idade = 12;
        if (idade >= 0 && idade <= 12)
            System.out.println("criança");
        else if (idade >= 12 && idade <= 17) {
            System.out.println("adolecente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("adulto");
        } else {
            System.out.println("idoso");
        }
    }
}
//ioiiio