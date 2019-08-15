/*
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 */

package code;

import java.util.Scanner;

/**
 * @author neo
 * @create 15/08/2019
 */
public class Ex_33 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final float PARCELA3  = 0.1f;
    final float PARCELA6  = 0.15f;
    final float PARCELA9  = 0.2f;
    final float PARCELA12 = 0.25f;

    double divida = 0;
    double juros  = 0;

    System.out.println("\n Valor da dívida\n");
    System.out.print("Informe o valor da divida: R$ ");
    divida = imput.nextDouble();

    System.out.println("\nTabela de Parcelas");
    System.out.print("Valor da Dívida");
    System.out.print(" | Valor do Juros");
    System.out.print(" | Quantidade de Parcelas");
    System.out.print(" | Valor da Parcela");
    System.out.printf("\nR$ ", divida);
    System.out.print(" | R$ 0,00");
    System.out.print(" | 1 ");
    System.out.printf(" | R$ ", divida);

    juros = divida * PARCELA3;
    System.out.printf("\nR$ %.2f", divida + juros);
    System.out.printf(" | R$ %.2f", juros);
    System.out.print(" | 3 ");
    System.out.printf(" | R$ %.2f", (divida + juros) / 3);

    juros = divida * PARCELA6;
    System.out.printf("\nR$ %.2f", divida + juros);
    System.out.printf(" | R$ %.2f", juros);
    System.out.print(" | 6 ");
    System.out.printf(" | R$ %.2f", (divida + juros) / 6);

    juros = divida * PARCELA9;
    System.out.printf("\nR$ %.2f", divida + juros);
    System.out.printf(" | R$ %.2f", juros);
    System.out.print(" | 9 ");
    System.out.printf(" | R$ %.2f", (divida + juros) / 9);

    juros = divida * PARCELA12;
    System.out.printf("\nR$ %.2f", divida + juros);
    System.out.printf(" | R$ %.2f", juros);
    System.out.print(" | 12 ");
    System.out.printf(" | R$ %.2f", (divida + juros) / 12);
  }
}