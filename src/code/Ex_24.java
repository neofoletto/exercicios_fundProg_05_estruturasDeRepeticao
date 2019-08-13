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
 * @create 11/08/2019
 */
public class Ex_24 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int quantidade = 0;
    double valor   = 0;
    double media   = 0;

    System.out.println("\nMédia de valores dos CDs\n");
    System.out.print("Informe quantidade de CDs: ");
    quantidade = (int)imput.nextFloat();

    System.out.println("Informe valor pago em cada: R$ ");
    for (int i = 0; i < quantidade; i++) {
      System.out.printf("Turma %d: ", (i + 1));
      valor = imput.nextDouble();
      while (valor < 0)
        valor = imput.nextDouble();
      media += valor;
    }

    media /= quantidade;

    System.out.println("\nResultado");
    System.out.printf("Média R$ %.2f", media);
  }
}
