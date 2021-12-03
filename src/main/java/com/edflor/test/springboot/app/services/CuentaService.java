package com.edflor.test.springboot.app.services;

import com.edflor.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;

public interface CuentaService {

    int revisarTotalTransferencia(Long id);

    Cuenta findById(Long idBanco);

    BigDecimal revisarSaldo(Long cuentaId);

    void transferir(Long numeroCuentaOrigen, Long numeroCuentaMonto, BigDecimal monto, Long bancoId);
}
