import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Gabriel Sousa";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("""     
        ***********************
        Dados iniciais do cliente:

        Nome: Gabriel Sousa
        Tipo conta: Corrente
        Saldo inicial: R$ 2500,00
        ***********************
        """);

        Scanner leitura = new Scanner(System.in); // Scanner declarado uma vez fora do loop

        while (true) {
            System.out.println("""
            Operações

            1- Consultar saldos
            2- Receber valor
            3- Transferir valor
            4- Sair

            Digite a opção desejada:
            """);

            opcao = leitura.nextInt();
            System.out.println();

            if (opcao == 1) {
                System.out.println("O seu saldo atual é: R$ " + saldo);

            } else if (opcao == 2) {
                System.out.println("Digite a quantidade a ser recebida: ");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Seu saldo atual é: R$ " + saldo);

            } else if (opcao == 3) {
                System.out.println("Digite a quantidade a ser debitada: ");
                double retirada = leitura.nextDouble();

                if (retirada > saldo) {
                    System.out.println("Operação inválida. Saldo insuficiente.");
                } else {
                    saldo -= retirada;
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                }

            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida!");
            }
        }

        leitura.close(); // Fechando o Scanner após o uso
    }
}
