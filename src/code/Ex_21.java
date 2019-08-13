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
public class Ex_21 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int IDADE = 150;

    float idade = 0;
    float media = 0;
    int cont    = 1;

    System.out.println("\nMario e Menor");
    System.out.println("\nInforme -1 para sair\n");
    System.out.println("Informe números..");
    while (idade >= 0 && idade <= IDADE) {
      System.out.printf("Idade %d: ", cont);
      idade = imput.nextFloat();
      while (idade != (int)idade)
        idade = imput.nextFloat();
      if (idade >= 0 && idade <= IDADE)
        media += idade;
      cont++;
    }

    media /= cont;

    System.out.println("\nResultado:");
    if (media <= 25)
      System.out.printf("Média da turma de %.2f anos: Turma Jovem", media);
    else
      if(media > 25 & media < 60)
        System.out.printf("Média da turma de %.2f anos: Turma Adulta", media);
      else
        System.out.printf("Média da turma de %.2f anos: Turma Idosa", media);
  }
}

