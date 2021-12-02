package com.edflor.test.springboot.app.exeptions;

public class DineroInsuficienteExeption extends RuntimeException{

    public DineroInsuficienteExeption(String message) {
        super(message);
    }
}
