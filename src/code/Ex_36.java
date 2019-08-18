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
 * @create 18/08/2019
 */
public class Ex_36 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int CANDIDATO = 4;

    int totalVotantes = 0;
    int voto[]        = new int[CANDIDATO];
    int aux           = 0;
    int nulo          = 0;
    int branco        = 0;

    System.out.println("\nVotação\n");
    System.out.print("Informe quantidade de votantes: ");
    totalVotantes = (int)imput.nextFloat();

    System.out.println("Informe voto..");
    System.out.println("01 - Candidato 01");
    System.out.println("02 - Candidato 02");
    System.out.println("03 - Candidato 03");
    System.out.println("04 - Candidato 04");
    System.out.println("05 - Branco");
    System.out.println("06 - Nulo");
    for (int i = 0; i < totalVotantes; i++) {
      System.out.printf("Votante %d: ", (i + 1));
      aux = (int)imput.nextDouble();
      while (aux < 1 || aux > 3)
        aux = (int)imput.nextDouble();

      switch (aux) {
        case 1:
          voto[0]++;
        case 2:
          voto[1]++;
        case 3:
          voto[2]++;
        case 4:
          voto[3]++;
        case 5:
          branco++;
        case 6:
          nulo++;
      }
    }

    System.out.println("\nQuantidade de votos");
    for (int i = 0; i < CANDIDATO; i++)
      System.out.printf("\nCanditado %d: %d", (i + 1), voto[i]);
  }
}

