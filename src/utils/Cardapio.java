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

package utils;

import java.text.DecimalFormat;

/**
 * @author neo
 * @create 18/08/2019
 */
public class Cardapio {

  private int codigo;
  private double preco;
  private String nome;

  public Cardapio() {

  }
  public Cardapio(int codigo, String nome, double preco) {
    setCodigo(codigo);
    setNome(nome);
    setPreco(preco);
  }

  public int getCodigo() {
    return codigo;
  }

  public boolean setCodigo(int codigo) {
    if (codigo > 0) {
      this.codigo = codigo;
      return true;
    }
    return false;
  }

  public double getPreco() {
    return preco;
  }

  public boolean setPreco(double preco) {
    if (preco >= 0) {
      this.preco = preco;
      return true;
    }
    return false;
  }

  public String getNome() {
    return nome;
  }

  public boolean setNome(String nome) {
    if (nome.length() >= 3) {
      this.nome = nome;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    DecimalFormat format = new DecimalFormat("R$ ###,###.00");
    final StringBuilder sb = new StringBuilder();
    sb.append("  ").append(codigo).append("   ");
    sb.append(nome).append("  ");
    sb.append(format.format(preco));
    return sb.toString();
  }
}
