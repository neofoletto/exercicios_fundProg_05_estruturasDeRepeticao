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
public class Ex_37 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final char[] ALTERNATIVAS = {' ', 'A', 'B', 'C', 'D', 'E'};
    final char[] GABARITO     = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
    final int TAM = 10;

    char questao[]   = new char[TAM];
    int matricula    = 0;
    int maiorNota    = 0;
    int menorNota    = 0;
    int quantidade   = 0;
    int mediaAcertos = 0;
    float mediaTurma = 0;
    boolean aux      = false;

    System.out.println("\nGABARITO DA PROVA\n");
    for (char gab: GABARITO)
      System.out.printf("%d %s\n", ++quantidade, gab);
    quantidade = 0;

    while (true) {
      System.out.print("Informe -1 para sair");
      System.out.print("\nInforme matrícula do aluno: ");
      matricula = (int)imput.nextDouble();
      while (matricula < -1)
        matricula = (int)imput.nextDouble();
      if (matricula == -1)
        break;

      for (int i = 0; i < TAM; i++) {
        System.out.printf("Informe opção assinalada (pergunta %d): ", (i + 1));
        questao[i] = imput.next().toUpperCase().charAt(0);
        while (true) {
          for (char alt : ALTERNATIVAS)
            if (alt == questao[i]) {
              aux = true;
              break;
            }
          if (aux) {
            aux = false;
            break;
          }
          questao[i] = imput.next().toUpperCase().charAt(0);
        }
      }

      for (int i = 0; i < GABARITO.length - 1; i++)
        for (int j = i; j < questao.length - 1; j++)
          if (GABARITO[i] == questao[j]) {
            mediaAcertos++;
            break;
          }

      if (quantidade == 0) {
        maiorNota = menorNota = mediaAcertos;
      } else {
        if (maiorNota < mediaAcertos)
          maiorNota = mediaAcertos;
        if (menorNota > mediaAcertos)
          menorNota = mediaAcertos;
      }

      mediaTurma += mediaAcertos;
      quantidade++;
      System.out.printf("\nMédia de acertos: %d\n\n", mediaAcertos);
      mediaAcertos = 0;
    }

    mediaTurma /= quantidade;

    System.out.println("\nResultado");
    System.out.printf("\nMaior acerto: %d", maiorNota);
    System.out.printf("\nMenor acerto: %d", menorNota);
    System.out.printf("\nTotal de alunos: %d", quantidade);
    System.out.printf("\nMédia da turma: %.2f", mediaTurma);
  }
}
