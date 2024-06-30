import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //Lê os valores de Entrada:
        Scanner terminal = new Scanner(System.in);
       System.out.println("Digite o valor do Salário: ");
        float valorSalario = terminal.nextFloat();
        System.out.println("Digite o valor dos Benefícios:");
        float valorBeneficios = terminal.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //Atribui a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            //Atribui a aliquota de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario;
        } else {  
            //Atribui a aliquota de 15% mediante o salário:
            valorImposto = 0.15F * valorSalario;
        }
        
        float saída = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saída));
    }
}
