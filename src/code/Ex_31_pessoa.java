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

/**
 * @author neo
 * @create 12/08/2019
 */
public class Ex_31_pessoa {

  private String nome;
  private float altura;

  public Ex_31_pessoa() {

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

  public float getAltura() {
    return altura;
  }

  public boolean setAltura(float altura) {
    if (altura > 0 && altura < 280) {
      this.altura = altura;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("\nNome   = ").append(nome);
    sb.append("\nAltura = ").append(altura);
    return sb.toString();
  }
}
