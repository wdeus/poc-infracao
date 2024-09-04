package br.com.poc.outbound.http;

import br.com.poc.core.dto.IntegracaoMainframeDTO;
import br.com.poc.core.repository.MainframeRepository;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey="integracao-api")
@Path("/integracao")
public interface MainframeHttpClient extends MainframeRepository {

    @POST
    String enviarTransacao(IntegracaoMainframeDTO integracaoMainframeDTO);
}
