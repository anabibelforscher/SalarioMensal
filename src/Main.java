import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double salarioFixo, vendas, total;

        System.out.println("Informe o nome:");
        String nome = leitor.nextLine();

        System.out.println("Informe o salário fixo:");
        salarioFixo = leitor.nextDouble();

        System.out.println("Informe o valor das vendas mensais:");
        vendas = leitor.nextDouble();

        total = ((vendas * 20) / 100) + salarioFixo;
        System.out.println("O Salário com bônus de " + nome + " é:");
        System.out.println(String.format("TOTAL = R$ %.2f", total));
    }
}