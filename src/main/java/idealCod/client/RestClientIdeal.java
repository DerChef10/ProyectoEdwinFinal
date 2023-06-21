package idealCod.client;

import idealCod.model.Character;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClientIdeal {

    public ResponseEntity<Character> getCharacterAsEntity(Integer id){
        RestTemplate llamada=new RestTemplate();
        ResponseEntity<Character> respuesta=llamada.getForEntity("https://rickandmortyapi.com/api/character/{id}",Character.class,id);
        return respuesta;}

    public int sumarDosNumeros(int parametro1, int parametro2){

            int variable=parametro1 + parametro2;
            System.out.println(variable);
            return variable;}

    public ResponseEntity<Character> devolverEntidad(Integer id){
            RestTemplate llamada=new RestTemplate();
            ResponseEntity<Character> respuesta;
            respuesta=llamada.getForEntity("https://rickandmortyapi.com/api/character/{id}",Character.class,id);
            return respuesta;
        }

}
