package br.com.poc.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IntegracaoMainframeDTO {

    private String nomeTransacao;
    private String request;
}
