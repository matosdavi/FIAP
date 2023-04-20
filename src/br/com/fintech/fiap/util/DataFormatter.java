package br.com.fintech.fiap.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataFormatter {

    public String formatarData(LocalDateTime dataNascimento) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataNascimentoFormatada = dataNascimento.format(formatter);

        return dataNascimentoFormatada;
    }
}
