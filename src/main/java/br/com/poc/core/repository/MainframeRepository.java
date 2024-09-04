package br.com.poc.core.repository;

import br.com.poc.core.dto.IntegracaoMainframeDTO;

public interface MainframeRepository {

    String enviarTransacao(IntegracaoMainframeDTO integracaoMainframeDTO);
}
