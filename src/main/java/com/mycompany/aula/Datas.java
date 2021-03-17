/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/**
 *
 * @author marcelo
 */
public class Datas {

    public static void main(String[] args) {

        //Local Date
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje);

        LocalDate natal = LocalDate.of(2021, 12, 25);
        System.out.println("Natal: " + natal);

        LocalDate feriado = LocalDate.parse("2020-11-15");
        System.out.println("Feriado: " + feriado);

        //Local Time
        LocalTime agora = LocalTime.now();
        System.out.println("Agora: " + agora);

        LocalTime porDoSol = LocalTime.of(17, 48);
        System.out.println("Por do Sol: " + porDoSol);

        LocalTime almoco = LocalTime.parse("12:20:00");
        System.out.println("Almoço: " + almoco);

        //Data e hora
        LocalDateTime porDoSolDeNatal = LocalDateTime.of(2021, 12, 25, 17, 48);
        System.out.println("Por do Sol do Natal: " + porDoSolDeNatal);

        LocalDateTime porDoSolDeNatalS = LocalDateTime.parse("2021-12-25T17:48");
        System.out.println("Por do Sol do Natal: " + porDoSolDeNatalS);

        //Date Time Formater
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, HH:mm:ss");
        System.out.println("Formatação: " + porDoSolDeNatal.format(dtf1));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy, 'às' HH:mm");
        System.out.println("Formatação 2: " + porDoSolDeNatal.format(dtf2));

        //Zone DateTime - collection
        LocalDateTime porDoSolDeNatalZ = LocalDateTime.of(2020, 12, 25, 17, 48);
        Set<String> regioes = ZoneId.getAvailableZoneIds();
        for (String regiao : regioes) {
            if (regiao.contains("America")) {
                System.out.println("Fuzo Horário: " + regiao);

            }
        }

        System.out.format("%d regiões. %n", regioes.size());

        ZoneId norteBr = ZoneId.of("America/Manaus");
        ZonedDateTime fusoNorteBr = ZonedDateTime.of(porDoSolDeNatalZ, norteBr);
        System.out.println("Horário do Norte do BR: " + fusoNorteBr);

        //Intervalos de Período
        LocalDate dataNascimento = LocalDate.of(1994, 1, 1);

        Period p1 = Period.between(dataNascimento, LocalDate.now());
        System.out.println("Periodo: " + p1);

        //Duration
        //Duration d1
    }

}
