/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author marcelo
 */
public class EscritaArquivo {

    public static void main(String[] args) {

        PrintWriter arquivo = null;

        try {
            FileWriter out = new FileWriter("numeros.txt");
            arquivo = new PrintWriter(out);

            for (int i = 0; i < 10; i++) {
                arquivo.println(Math.round(Math.random() * 60));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            arquivo.close();
        }

    }

}
