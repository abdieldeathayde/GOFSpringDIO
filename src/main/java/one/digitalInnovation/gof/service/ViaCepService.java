package one.digitalInnovation.gof.service

import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name = "viacep", url = "https://viacepo.com.br/ws")
public interface ViaCepService {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}