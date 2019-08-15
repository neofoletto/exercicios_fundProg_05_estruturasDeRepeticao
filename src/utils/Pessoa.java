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
 * @create 12/08/2019
 */
public class Pessoa {

  private String nome = "";
  private int codigo = -1;
  private float altura;
  private float peso;

  public Pessoa() { }

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
    if (codigo != -1)
      sb.append("\nCódigo = ").append(codigo);
    if (!nome.isBlank() || !nome.isEmpty())
      sb.append("\nNome   = ").append(nome);
    sb.append("\nAltura = ").append(altura);
    sb.append("\nPeso   = ").append(peso);
    return sb.toString();
  }
}
