import java.util.Scanner;

public class Atividades {

    Scanner sc = new Scanner(System.in);

    
    static void tabuada(int numero) {
        int i = 1, resultado;
        do {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i = i + 1;
        } while (i <= 10);
    }

    
    static void chutar(int numero) {
        int chute;

        do {
            System.out.print("Chute um numero: ");
            chute = sc.nextInt();

            if (chute < numero) {
                System.out.println("E MENOR");
            } else if (chute > numero) {
                System.out.println("E MAIOR");
            } else {
                System.out.println("E IGUAL");
            }
        } while (chute != numero);
    }

    
    static void caixaEletronico() {
        double saldo = 1000, valor;
        int op;
        char continuar;


        do {
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.print("Escolha uma opcao: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 2:
                    System.out.print("Valor do deposito: ");
                    valor = sc.nextDouble();
                    saldo = saldo + valor;
                    System.out.println("Deposito realizado. Saldo: " + saldo);
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    valor = sc.nextDouble();
                    if (valor <= saldo) {
                        saldo = saldo - valor;
                        System.out.println("Saque realizado. Saldo: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

            System.out.print("Deseja continuar S/N? ");
            
        } while (continuar == 'S' || continuar == 's');
    }

 
    static int potencia(int base, int expoente) {
        int resultado = 1;
        int i;

        for (i = 1; i <= expoente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

   
    static int fatorial(int numero) {
        int resultado;
        int i;

        resultado = 1;
        for (i = 2; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero,base,expoente;

        System.out.print("Numero para a tabuada: ");
        numero = sc.nextInt();
        tabuada(numero);

        System.out.print("Numero para ser adivinhado: ");
        numero = sc.nextInt();
        chutar(numero);

        caixaEletronico();

        System.out.print("Base: ");
        base = sc.nextInt();
        System.out.print("Expoente: ");
        expoente = sc.nextInt();
        System.out.println(base + " elevado a " + expoente + " = " + potencia(base, expoente));

        System.out.print("Numero para o fatorial: ");
        numero = sc.nextInt();
        System.out.println("Fatorial de " + numero + " = " + fatorial(numero));
    }
}