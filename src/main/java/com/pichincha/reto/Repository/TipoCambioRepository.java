package com.pichincha.reto.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pichincha.reto.modal.TipoCambio;
import java.util.List;


public interface TipoCambioRepository extends JpaRepository<TipoCambio, Long> {

    Optional<TipoCambio> findById(Long id);

    List<TipoCambio> findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);
    
}
