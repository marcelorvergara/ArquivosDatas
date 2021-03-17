/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class LeituraArquivo {

    public static void main(String[] args) {
        Scanner arquivo = null;

        try {
            FileReader in = new FileReader("numeros.txt");
            arquivo = new Scanner(in);
            int soma = 0;
            for (int i = 0; i < 10; i++) {
                soma = soma + arquivo.nextInt();
            }
            System.out.println("Média: " + soma / 10f);
        } catch (Exception e) {
            arquivo.close();

        }
    }
}
