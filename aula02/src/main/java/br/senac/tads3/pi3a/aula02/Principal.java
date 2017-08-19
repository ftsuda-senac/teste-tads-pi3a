/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3a.aula02;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando.tsuda
 */
public class Principal {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("INICIANDO APLICATIVO");
    for (int i = 0; i < 15; i++) {
      long timestamp = System.currentTimeMillis();
      if (timestamp % 2 == 1) {
	System.out.println("Hello world git maven");
      } else {
	System.out.println("Erro");
      }
      try {
	Thread.sleep(3L);
      } catch (InterruptedException ex) {
	// TRATAR EXCECAO
      }
    }
  }

}
