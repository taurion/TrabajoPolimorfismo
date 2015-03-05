/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

import java.math.BigDecimal;

/**
 *
 * @author Usuario
 */
public class Consultor extends Trabajador{
   
    private BigDecimal tarifa, numeroDeHoras;
    
   
    public BigDecimal calcularCantidadAPagarle(){
        return tarifa.multiply(numeroDeHoras);
    }

    /**
     * @return the tarifa
     */
    public BigDecimal getTarifa() {
        return tarifa;
    }

    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(BigDecimal tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * @return the numeroDeHoras
     */
    public BigDecimal getNumeroDeHoras() {
        return numeroDeHoras;
    }

    /**
     * @param numeroDeHoras the numeroDeHoras to set
     */
    public void setNumeroDeHoras(BigDecimal numeroDeHoras) {
        this.numeroDeHoras = numeroDeHoras;
    }
    
}
