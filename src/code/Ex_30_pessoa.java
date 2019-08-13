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

import java.util.StringJoiner;

/**
 * @author neo
 * @create 12/08/2019
 */
public class Ex_30_pessoa {

  private int codigo;
  private float altura;
  private float peso;

  public Ex_30_pessoa() {

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

  public float getPeso() {
    return peso;
  }

  public boolean setPeso(float peso) {
    if (peso > 0) {
      this.peso = peso;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("\nCódigo = ").append(codigo);
    sb.append("\nAltura = ").append(altura);
    sb.append("\nPeso   = ").append(peso);
    return sb.toString();
  }
}
