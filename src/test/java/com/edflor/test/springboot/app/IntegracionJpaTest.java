package com.edflor.test.springboot.app;

import com.edflor.test.springboot.app.models.Cuenta;
import com.edflor.test.springboot.app.repositories.CuentaRepository;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class IntegracionJpaTest {
    @Autowired
    CuentaRepository cuentaRepository;

    @Test
    void testFindById() {
        Optional<Cuenta> cuenta = cuentaRepository.findById(1L);

        assertTrue(cuenta.isPresent());
        assertEquals("Eduardo", cuenta.orElse(null).getPersona());
    }

    @Test
    void testFindByIdPersona() {
        Optional<Cuenta> cuenta = cuentaRepository.findByPersona("Eduardo");

        assertTrue(cuenta.isPresent());
        assertEquals("Eduardo", cuenta.orElse(null).getPersona());
        assertEquals("1000.00", cuenta.orElse(null).getSaldo().toPlainString());

    }
    
}
