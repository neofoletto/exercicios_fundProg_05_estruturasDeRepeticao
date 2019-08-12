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
public class ex_03 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    String nome = "";
    float idade = -1.1f;
    double salario = -1;
    char sexo = '0';
    char estadoCivil = '0';

    System.out.println("\nInformações usuário\n");
    System.out.print("Informe nome do usuário: ");
    nome = imput.nextLine();
    while (nome.length() < 3)
      nome = imput.nextLine();

    System.out.print("Informe idade (entre 0 e 150): ");
    idade = imput.nextFloat();
    while (idade != (int)idade || (idade < 0 || idade > 150))
      idade = imput.nextFloat();

    System.out.print("Informe Salário (> 0): ");
    salario = imput.nextDouble();
    while (salario < 0)
      salario = imput.nextDouble();

    System.out.print("Informe sexo (F - feminino | M - Masculino): ");
    sexo = imput.next().toLowerCase().charAt(0);
    System.out.println(sexo != 'f');
    System.out.println(sexo != 'm');
    while (sexo != 'f' && sexo != 'm')
      sexo = imput.next().toLowerCase().charAt(0);

    System.out.print("Informe estado civil (S - Solteiro, C - casado, V - Viuvo e D - Divorciado): ");
    estadoCivil = imput.next().toLowerCase().charAt(0);
    while (estadoCivil != 's'
        && estadoCivil != 'c'
        && estadoCivil != 'v'
        && estadoCivil != 'd')
      estadoCivil = imput.next().toLowerCase().charAt(0);

    System.out.println("\nInformações usuário");
    System.out.printf("Usuário: %s\n",nome);
    System.out.printf("Idade: %.0f\n",idade);
    System.out.printf("Salário: R$%.2f\n",salario);
    System.out.printf("Sexo: %s\n",(sexo =='f')?"Feminino":"Masculino");
    System.out.printf("Estado Civil: %s\n",
        (estadoCivil =='s')?"Solteiro":
      (estadoCivil =='c')?"Casado":
      (estadoCivil =='V')?"Viuvo":
      "Divorciado");
}
}