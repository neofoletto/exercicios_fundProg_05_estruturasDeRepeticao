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

/**
 * @author neo
 * @create 15/08/2019
 */
public class Cidade {

  private String nome;
  private int codigo;
  private int veiculosPasseio;
  private int numAcidentesVitima;

  public Cidade() {
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

  public int getCodigo() {
    return codigo;
  }

  public boolean setCodigo(int codigo) {
    if (codigo >= 0) {
      this.codigo = codigo;
      return true;
    }
    return false;
  }

  public int getVeiculosPasseio() {
    return veiculosPasseio;
  }

  public boolean setVeiculosPasseio(int veiculosPasseio) {
    if (veiculosPasseio >= 0) {
      this.veiculosPasseio = veiculosPasseio;
      return true;
    }
    return false;
  }

  public int getNumAcidentesVitima() {
    return numAcidentesVitima;
  }

  public boolean setNumAcidentesVitima(int numAcidentesVitima) {
    if (numAcidentesVitima >= 0) {
      this.numAcidentesVitima = numAcidentesVitima;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("\n");
    sb.append("Codigo = ").append(codigo);
    sb.append("\nNome =").append(nome).append(' ');
    sb.append("\nVeiculos de Passeio     = ").append(veiculosPasseio);
    sb.append("\nNúmero Acidentes Vítima = ").append(numAcidentesVitima);
    return sb.toString();
  }
}