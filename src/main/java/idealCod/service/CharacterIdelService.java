package idealCod.service;

import idealCod.client.RestClientIdeal;
import idealCod.model.Character;
import idealCod.response.ResponseFinalIdeal;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CharacterIdelService {
    private final RestClientIdeal restClientIdeal =new RestClientIdeal();
    public ResponseFinalIdeal generateResponseFinalIdeal(Integer id){
        ResponseEntity<Character> apiResponse=restClientIdeal.getCharacterAsEntity(id);
        ResponseFinalIdeal respuestaFormateada = new ResponseFinalIdeal();
        respuestaFormateada.setId(apiResponse.getBody().getId());
        respuestaFormateada.setName(apiResponse.getBody().getName());
        respuestaFormateada.setSpecies(apiResponse.getBody().getSpecies());
        respuestaFormateada.setStatus(apiResponse.getBody().getStatus());
        return respuestaFormateada;

    }
}
