package com.pichincha.reto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.reto.Repository.TipoCambioRepository;
import com.pichincha.reto.modal.TipoCambio;

@Service
public class TipoCambioService {

    @Autowired
    public TipoCambioRepository tipoCambioRepository;

    public TipoCambio realizarTipoCambio(TipoCambio tipoCambio){
        return tipoCambioRepository.save(tipoCambio);
    }

    public TipoCambio obtenerTipoCambio(Long id) {
        return tipoCambioRepository.findById(id)
                .orElseThrow(() -> new TipoCambioNotFoundException("Tipo de cambio no encontrado"));
    }

    public List<TipoCambio> buscarTipoCambioPorMonedas(String monedaOrigen, String monedaDestino) {
        return tipoCambioRepository.findByMonedaOrigenAndMonedaDestino(monedaOrigen, monedaDestino);
    }

    public TipoCambio actualizarTipoCambio(Long id, TipoCambio tipoCambioActualizado) {
        TipoCambio tipoCambioExistente = obtenerTipoCambio(id);
        tipoCambioExistente.setMonedaOrigen(tipoCambioActualizado.getMonedaOrigen());
        tipoCambioExistente.setMonedaDestino(tipoCambioActualizado.getMonedaDestino());
        tipoCambioExistente.setMontoTipoCambio(tipoCambioActualizado.getMontoTipoCambio());
    
        return tipoCambioRepository.save(tipoCambioExistente);
    }    
}
