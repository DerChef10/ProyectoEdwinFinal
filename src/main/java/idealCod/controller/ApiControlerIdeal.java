package idealCod.controller;

import idealCod.requestDTO.RequestDTO;
import idealCod.response.ResponseFinalIdeal;
import idealCod.service.CharacterIdelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "idealApi/")
public class ApiControlerIdeal {

    @Autowired
    private CharacterIdelService supremo;



    @RequestMapping(path ="saludo")
    public String endPointDeBienvenida(){
        String mensaje="Bienvenido a Mi Api";
        return mensaje;
    }

    @PostMapping(path = "Rick")
    public ResponseFinalIdeal obtenerRespuesta(@RequestBody RequestDTO requestDTO){
        return supremo.generateResponseFinalIdeal(requestDTO.getMapaDelRequestBody().get("identifier"));
    }



}

