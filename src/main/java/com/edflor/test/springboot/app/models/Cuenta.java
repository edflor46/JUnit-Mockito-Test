package com.edflor.test.springboot.app.models;

import com.edflor.test.springboot.app.exeptions.DineroInsuficienteExeption;

import java.math.BigDecimal;

public class Cuenta {
    private Long id;
    private String persona;
    private BigDecimal saldo;

    public Cuenta() {
    }

    public Cuenta(Long id, String persona, BigDecimal saldo) {
        this.id = id;
        this.persona = persona;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Cuenta)) return false;

        Cuenta cuenta = (Cuenta) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder().append(getId(), cuenta.getId()).append(getPersona(), cuenta.getPersona()).append(getSaldo(), cuenta.getSaldo()).isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37).append(getId()).append(getPersona()).append(getSaldo()).toHashCode();
    }

    public void debito(BigDecimal monto){
        BigDecimal nuevoSaldo = this.saldo.subtract(monto);

        if (nuevoSaldo.compareTo(BigDecimal.ZERO)<0){
            throw new DineroInsuficienteExeption("Dinero insuficiente");
        }

        this.saldo = nuevoSaldo;
    }

    public void credito(BigDecimal monto){
        this.saldo = this.saldo.add(monto);
    }

}
