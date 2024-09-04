package br.com.poc.core.usecase;

import br.com.poc.core.domain.enums.CodigoTransacaoEnum;
import br.com.poc.core.domain.trx401.Trx401Request;
import br.com.poc.core.domain.trx401.Trx401Response1;
import br.com.poc.core.domain.trx401.Trx401Response2;
import br.com.poc.core.dto.IntegracaoMainframeDTO;
import br.com.poc.core.repository.MainframeRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class ConsultaInfracaoUC {

    @RestClient
    MainframeRepository mainframeRepository;

    Trx401Request request;

    public Trx401Response1 executar(){
        String response = mainframeRepository
                .enviarTransacao(new IntegracaoMainframeDTO(CodigoTransacaoEnum.TRX_401.name(), request.toString()));
        // converte response para Trx401Response
        return new Trx401Response1();
    }
}
