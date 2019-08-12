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
public class ex_02 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    String nome  = "";
    String senha = "";

    System.out.println("\nUsuário e SEnha\n");
    while (nome.length() < 3) {
      System.out.print("Informe nome do usuário: ");
      nome = imput.nextLine();
      if (nome.length() < 3)
        nome = imput.nextLine();
    }
    do {
      System.out.print("Informe senha: ");
      senha = imput.nextLine();
      if (nome.equals(senha) || senha.isEmpty() || senha.length() < 8)
        System.out.println("Nome == senha ou vazia ou < 8 char, digite novamente.");
    } while (nome.equals(senha) || senha.isEmpty() || senha.length() < 8);

    System.out.println("\nUsuário e SEnha");
    System.out.printf("Usuário: %s\n", nome);
    System.out.printf("Senha: %s\n", senha);
  }
}
