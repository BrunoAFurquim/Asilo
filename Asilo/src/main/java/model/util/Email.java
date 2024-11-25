/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.Usuario;

/**
 *
 * @author saraa
 */
public class Email {


    public final void notificarDoacao( Usuario doador, double valor) throws IOException {
       LocalDate hoje = LocalDate.now(); 
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
       String dataFormatada = hoje.format(formatter);
       String templatePath = "src/main/resources/Emails/email.html";
       String outPath = "src/main/resources/Emails/email" + dataFormatada + "to_" + doador.getEmail() + ".html";
       String conteudo = new String(Files.readAllBytes(Paths.get(templatePath)));
       
       conteudo = conteudo.replace("{{nome}}", doador.getNome());
       conteudo = conteudo.replace("{{valor}}", Double.toString(valor));
       conteudo = conteudo.replace("{{data}}", dataFormatada);
       
       Files.write(Paths.get(outPath), conteudo.getBytes());
    }

}
