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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author neo
 * @create 18/08/2019
 */
public class Ex_38 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    List<Character> alternativas = new ArrayList<>();
    List<Character> gabarito     = new ArrayList<>();

    int matricula    = 0;
    int maiorNota    = 0;
    int menorNota    = 0;
    int quantidade   = 0;
    int mediaAcertos = 0;
    float mediaTurma = 0;
    char auxChar     = ' ';
    boolean aux      = false;

    System.out.println("\nInforme Z para sair ou");
    while (true) {
      System.out.print("Informe alternativas das questões (ex: A, B, C, D, E): ");
      alternativas.add(imput.next().toUpperCase().charAt(0));
      if (alternativas.get(alternativas.size() - 1) == 'Z') {
        alternativas.remove(alternativas.lastIndexOf('Z'));
        break;
      }
    }

    System.out.println("\nInforme Z para sair");
    while (true) {
      System.out.print("Informe gabarito das questões: ");
      gabarito.add(imput.next().toUpperCase().charAt(0));
      if (gabarito.get(gabarito.size() - 1) == 'Z') {
        gabarito.remove(gabarito.lastIndexOf('Z'));
        break;
      }

      while (true) {
        for (char c : gabarito)
          if (c == gabarito.get(gabarito.size() - 1)) {
            aux = true;
            break;
          }
        if (aux) {
          aux = false;
          break;
        }
        gabarito.set(gabarito.size() - 1, imput.next().toUpperCase().charAt(0));
      }
    }

    System.out.println("\nGABARITO DA PROVA\n");
    for (char gab: gabarito)
      System.out.printf("%d %s\n", ++quantidade, gab);
    quantidade = 0;

    char questao[] = new char[gabarito.size()];

    while (true) {
      System.out.print("Informe -1 para sair");
      System.out.print("\nInforme matrícula do aluno: ");
      matricula = (int)imput.nextDouble();
      while (matricula < -1)
        matricula = (int)imput.nextDouble();
      if (matricula == -1)
        break;

      for (int i = 0; i < gabarito.size() - 1; i++) {
        System.out.printf("Informe opção assinalada (pergunta %d): ", (i + 1));
        questao[i] = imput.next().toUpperCase().charAt(0);
        while (true) {
          for (char alt : alternativas)
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

      for (int i = 0; i < gabarito.size() - 1; i++)
        for (int j = i; j < questao.length - 1; j++)
          if (gabarito.get(i) == questao[j]) {
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