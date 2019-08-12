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

public class ex_16 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int tam      = 0;
    double num[];
    double menor = 0;
    double maior = 0;
    double soma  = 0;

    System.out.println("Mario e Menor");
    System.out.print("Informe quantidade de números: ");
    tam = (int)imput.nextFloat();
    num = new double[tam];

    System.out.println("Informe números..");
    for (int i = 0; i < tam; i++) {
      System.out.printf("Número %d: ", (i + 1));
      num[i] = imput.nextDouble();

      soma += num[i];
      if (i == 0) {
        maior = menor = num[i];
      } else {
        if (maior < num[i])
          maior = num[i];
        if (menor > num[i])
          menor = num[i];
      }
    }

    System.out.println("\nResultado:");
    System.out.printf("Maior: %.2f", maior);
    System.out.printf("\nMenor: %.2f", menor);
    System.out.printf("\nSoma: %.2f", soma);
  }
}
