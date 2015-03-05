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
public class Empleado extends Trabajador{
      private BigDecimal sueldo, IRPF;
      private String nombre, apellido,apellido2;

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
      private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public BigDecimal getIRPF() {
        return IRPF;
    }

    public void setIRPF(BigDecimal IRPF) {
        this.IRPF = IRPF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
      
      
   public BigDecimal calcularCantidadAPagarle() {
     return sueldo.multiply(BigDecimal.ONE.subtract(this.IRPF));
    }
}
