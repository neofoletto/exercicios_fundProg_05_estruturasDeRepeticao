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

import utils.Cidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author neo
 * @create 13/08/2019
 */
public class Ex_32 {
  public static void main(String[] args) {
    Cidade cidade;
    Scanner imput = new Scanner(System.in);

    List<Cidade> listaCidade = new ArrayList<>();
    int maiorIndiceAcidente  = 0;
    int menorIndiceAcidente  = 0;
    int maiorCodigoCidade    = 0;
    int menorCodigoCidade    = 0;
    int count                = 0;
    String maiorNomeCidade   = "";
    String menorNomeCidade   = "";
    double mediaVeiculos     = 0;
    double mediaAcidente2000 = 0;

    System.out.println("\nDados sobre acidentes em cidades brasileiras");
    while (true) {
      cidade = new Cidade();
      System.out.print("\nCódigo: ");
      while (!cidade.setCodigo((int)imput.nextFloat())) {}
      if (cidade.getCodigo() < 0)
        break;
      System.out.print("Nome: ");
      while (!cidade.setNome(imput.nextLine())) {}
      if ("sair".equalsIgnoreCase(cidade.getNome()) || "fim".equalsIgnoreCase(cidade.getNome()))
        break;
      imput.nextLine();
      System.out.print("Número de veículos de passeio: ");
      while (!cidade.setVeiculosPasseio((int)imput.nextFloat())) {}
      System.out.print("Número de acidentes de trânsito com vítumas: ");
      while (!cidade.setVeiculosPasseio((int)imput.nextFloat())) {}

      if (listaCidade.size() == 0) {
        maiorIndiceAcidente = menorIndiceAcidente = cidade.getNumAcidentesVitima();
        maiorCodigoCidade   = menorCodigoCidade   = cidade.getCodigo();
        maiorNomeCidade     = menorNomeCidade     = cidade.getNome();
      } else {
        if (maiorIndiceAcidente < cidade.getNumAcidentesVitima()) {
          maiorIndiceAcidente = cidade.getNumAcidentesVitima();
          maiorNomeCidade     = cidade.getNome();
          maiorCodigoCidade   = cidade.getCodigo();
        }
        if (menorIndiceAcidente > cidade.getNumAcidentesVitima()) {
          menorCodigoCidade   = cidade.getCodigo();
          menorIndiceAcidente = cidade.getNumAcidentesVitima();
          menorNomeCidade     = cidade.getNome();
        }
      }
      if (cidade.getVeiculosPasseio() <= 2000) {
        mediaAcidente2000 += cidade.getNumAcidentesVitima();
        count++;
      }
      mediaVeiculos += cidade.getVeiculosPasseio();
      listaCidade.add(cidade);
    }
    mediaVeiculos /= listaCidade.size();
    mediaAcidente2000 /= count;

    System.out.println("Índice de acidentes de trânsito:");
    System.out.printf("\nMaior: %d cm",   maiorIndiceAcidente);
    System.out.printf(" - Cidade: %d cm", maiorNomeCidade);
    System.out.printf("\nCódigo: %d cm",  maiorCodigoCidade);
    System.out.printf("\nMenor: %d cm",   menorIndiceAcidente);
    System.out.printf("\nCódigo: %d cm",  menorCodigoCidade);
    System.out.printf(" - Cidade: %d cm", menorNomeCidade);
    System.out.printf("\nMédia nas cinco cidades: %d", mediaVeiculos);
    System.out.printf("\nMédia de acidentes nas cidades com > 2000 veículos: %d", mediaAcidente2000);
  }
}
