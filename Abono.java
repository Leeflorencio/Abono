package com.br.alura;

import java.util.Scanner;

public class Abono {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salario dos funcionarios: ");
        Double salario = 0.0;
        Double abono = 0.0;
        int valorMinimo = 0;
        double totalAbono = 0.0;
        double maiorAbono = 0.0;

        int i = 0;
        while (true) {
            salario = sc.nextDouble();

            if (salario == 0) {
                break;
            } else if (salario < 1000.0) {
                valorMinimo++;
                abono = 100.0;
            } else {
                abono = (salario * 20) / 100;
            }

            if (abono > maiorAbono){
                maiorAbono = abono;
            }

            System.out.println("Salario: " + salario + " Abono: " + abono);
            totalAbono += abono;
            i++;
        }

        System.out.println("Projeção de Gastos com Abono");
        System.out.println("============================");
        System.out.println("Foram processados " + i + " colaboradores");
        System.out.println("Total gasto com abonos: R$ " + totalAbono);
        System.out.println("Valor mínimo pago a " + valorMinimo + " colaboradores");
        System.out.println("Maior valor de abono pago: R$ " + maiorAbono);
    }
}
