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

import utils.Cardapio;

import java.util.*;

/**
 * @author neo
 * @create 18/08/2019
 */
public class Ex_35 {
  public static void main(String[] args) {
    Cardapio cardapio = new Cardapio();
    Scanner imput = new Scanner(System.in);

    List<Cardapio> list = new ArrayList<>();

    cardapio = new Cardapio(100, "Cachorro Quente", 1.2);
    list.add(cardapio);
    cardapio = new Cardapio(101, "Bauru SImples", 1.3);
    list.add(cardapio);
    cardapio = new Cardapio(102, "Bauru com Ovo", 1.5);
    list.add(cardapio);
    cardapio = new Cardapio(103, "Hambúerguer", 1.2);
    list.add(cardapio);
    cardapio = new Cardapio(104, "Cheeseburguer", 1.3);
    list.add(cardapio);
    cardapio = new Cardapio(105, "Refrigerante", 1);
    list.add(cardapio);

    double precoCodigo[] = new double[list.size()];
    double total         = 0;
    int codigo           = 0;
    int quantidade       = 0;
    int codigoInicio     = list.get(0).getCodigo();
    int codigoFim        = list.get(list.size() - 1).getCodigo();

    System.out.println("\nLANCHONETE");
    System.out.println("\nCardápio");
    System.out.print("Código  Especificações    Preço");
    for (Cardapio c : list)
      System.out.println(c);

    System.out.print("\nInforme 99 para sair");
    while (true) {
      System.out.print("\nCódigo: ");
      codigo = (int)imput.nextDouble();
      while (codigo < (codigoInicio - 1) || codigo > codigoFim)
        codigo = (int)imput.nextDouble();
      if (codigo == 99)
        break;
      System.out.print("\nQuantidade: ");
      quantidade = (int)imput.nextDouble();
      while (quantidade < 0)
        quantidade = (int)imput.nextDouble();

      for (Cardapio c : list)
        if (c.getCodigo() == codigo)
          switch (codigo) {
            case 100:
              precoCodigo[c.getCodigo() - codigoInicio] += quantidade * list.get(c.getCodigo() - codigoInicio).getPreco();
              break;
            case 101:
              precoCodigo[c.getCodigo() - codigoInicio] += quantidade * list.get(c.getCodigo() - codigoInicio).getPreco();
              break;
            case 102:
              precoCodigo[c.getCodigo() - codigoInicio] += quantidade * list.get(c.getCodigo() - codigoInicio).getPreco();
              break;
            case 103:
              precoCodigo[c.getCodigo() - codigoInicio] += quantidade * list.get(c.getCodigo() - codigoInicio).getPreco();
              break;
            case 104:
              precoCodigo[c.getCodigo() - codigoInicio] += quantidade * list.get(c.getCodigo() - codigoInicio).getPreco();
              break;
            case 105:
              precoCodigo[c.getCodigo() - codigoInicio] += quantidade * list.get(c.getCodigo() - codigoInicio).getPreco();
              break;
          }
    }

    for (Cardapio c: list)
      if (precoCodigo[c.getCodigo() - codigoInicio] != 0) {
        System.out.printf("\n%d  %s \n- Preço: R$ %.2f", c.getCodigo(), c.getNome(), precoCodigo[c.getCodigo() - codigoInicio]);
        total += precoCodigo[c.getCodigo() - codigoInicio];
      }
    System.out.printf("\nTotal: R$ %.2f", total);
  }
}
