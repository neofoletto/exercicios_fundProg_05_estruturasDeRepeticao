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
public class Ex_23 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int turmas  = 0;
    int aluno   = 0;
    float media = 0;

    System.out.println("\nMédia de alunos por turma\n");
    System.out.print("Informe quantidade de turmas: ");
    turmas = (int)imput.nextFloat();

    System.out.println("Informe quantidade de alunos pro turma: ");
    for (int i = 0; i < turmas; i++) {
      System.out.printf("Turma %d: ", (i + 1));
      aluno = (int)imput.nextDouble();
      while (aluno < 0 || aluno > 40)
        aluno = (int)imput.nextDouble();
      media += aluno;
    }

    media /= turmas;

    System.out.println("\nResultado");
      System.out.printf("Média %.2f", media);
  }
}
