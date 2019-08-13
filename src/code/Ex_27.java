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
 * @create 12/08/2019
 */
public class Ex_27 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double VALOR = 0.18f;

    int cont         = 0;
    double valor     = 1;
    double total     = 0;
    double pagamento = 0;
    double troco     = 0;

    System.out.println("\nLoja Tabajara\n");
    while (valor > 0) {
      System.out.printf("Produto %d: R$: ", ++cont);
      valor = imput.nextDouble();
      total += valor;
    }

    total /= cont;
    System.out.printf("Total: R$ %.2f", total);
    System.out.print("\nDinheiro: R$ ");
    pagamento = imput.nextDouble();
    while (pagamento < total)
      pagamento = imput.nextDouble();
    troco = pagamento - total;
    System.out.printf("Troco: R$ %.2f", troco);
  }
}