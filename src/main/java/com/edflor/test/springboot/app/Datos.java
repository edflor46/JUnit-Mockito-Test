package com.edflor.test.springboot.app;

import com.edflor.test.springboot.app.models.Banco;
import com.edflor.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;

public class Datos {
    //public static final Cuenta CUENTA_001 = new Cuenta(1L, "Eduardo", new BigDecimal("1000"));
    //public static final Cuenta CUENTA_002 = new Cuenta(2L, "Luis", new BigDecimal("2000"));
    /*public static final Cuenta CUENTA_003 = new Cuenta(3L, "Maria", new BigDecimal("3000"));
    public static final Cuenta CUENTA_004 = new Cuenta(4L, "Karina", new BigDecimal("4000"));*/

    //public static final Banco BANCO = new Banco(1L, "El banco financiero", 0);

    public static Cuenta crearCuenta(){
        return new Cuenta(1L, "Eduardo", new BigDecimal("1000"));
    }

    public static Cuenta crearCuenta02(){
        return new Cuenta(2L, "Luis", new BigDecimal("2000"));
    }

    public static Banco crearBanco(){
        return new Banco(1L, "El banco financiero", 0);
    }
}
