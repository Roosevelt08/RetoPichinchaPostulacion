package com.pichincha.reto.Controllers;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.reto.Service.TipoCambioService;
import com.pichincha.reto.modal.TipoCambio;

@RestController
@RequestMapping("/api")
public class TipoCambioController {
    
    @Autowired
    private TipoCambioService TipoCambioService;


    @PostMapping("/tipo-cambio")
    public ResponseEntity<TipoCambio> realizarTipoCambio(@RequestBody TipoCambio request) {
        TipoCambio tipoCambio = TipoCambioService.realizarTipoCambio(request);
        return ResponseEntity.ok(tipoCambio);
    }

    @GetMapping("/tipo-cambio/{id}")
    public ResponseEntity<TipoCambio> obtenerTipoCambio(@PathVariable Long id) {
        TipoCambio tipoCambio = TipoCambioService.obtenerTipoCambio(id);
        return ResponseEntity.ok(tipoCambio);
    }
}





