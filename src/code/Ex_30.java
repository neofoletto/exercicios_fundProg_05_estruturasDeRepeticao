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

import utils.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author neo
 * @create 12/08/2019
 */
public class Ex_30 {
  public static void main(String[] args) {
    Pessoa pes;
    Scanner imput = new Scanner(System.in);

    List<Pessoa> pessoa = new ArrayList<>();
    float maiorAltura = 0;
    float menorAltura = 0;
    float maiorPeso   = 0;
    float menorPeso   = 0;
    float mediaAltura = 0;
    float mediaPeso   = 0;

    System.out.println("\nAcademia\n");
    while (true) {
      pes = new Pessoa();
      System.out.print("Código: ");
      while (!pes.setCodigo((int) imput.nextFloat())) {}
      if (pes.getCodigo() == 0)
        break;
      System.out.print("Altura (centimetros): ");
      while (!pes.setAltura(imput.nextFloat())){}
      System.out.print("Peso (quilogramas): ");
      while (!pes.setPeso(imput.nextFloat())){}

      if (pessoa.size() == 0) {
        maiorAltura = menorAltura = pes.getAltura();
        maiorPeso   = menorPeso   = pes.getPeso();
      } else {
        if (maiorAltura < pes.getAltura())
          maiorAltura = pes.getAltura();
        if (menorAltura > pes.getAltura())
          menorAltura = pes.getAltura();
        if (maiorPeso < pes.getPeso())
          menorPeso = pes.getPeso();
        if (menorPeso > pes.getPeso())
          menorPeso = pes.getPeso();
      }

      mediaAltura += pes.getAltura();
      mediaPeso   += pes.getPeso();
      pessoa.add(pes);

    }
    mediaAltura /= pessoa.size();
    mediaPeso   /= pessoa.size();

    for (Pessoa p: pessoa)
      System.out.println(p.toString());
    System.out.printf("\nMaior Altura: %.1f cm", maiorAltura);
    System.out.printf("\nMenor Altura: %.1f cm", menorAltura);
    System.out.printf("\nMaior Peso:   %.1f kg", maiorPeso);
    System.out.printf("\nMenor Peso:   %.1f kg", menorPeso);
    System.out.printf("\nMédia Altura: %.1f cm", mediaAltura);
    System.out.printf("\nMédia Peso:   %.1f kg", mediaPeso);
  }
}