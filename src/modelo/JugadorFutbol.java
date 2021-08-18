/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dacastro
 */
public class JugadorFutbol extends Persona {

    private int numerodorsal;
    private String posicion;

    public JugadorFutbol() {
    }

    public JugadorFutbol(int numerodorsal, String posicion, String nombrep,
            String telefonop, String correop) {
        
        super(nombrep, telefonop, correop);
        this.numerodorsal = numerodorsal;
        this.posicion = posicion;
    }
    
    /**
     * Get the value of posicion
     *
     * @return the value of posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * Set the value of posicion
     *
     * @param posicion new value of posicion
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * Get the value of numerodorsal
     *
     * @return the value of numerodorsal
     */
    public int getNumerodorsal() {
        return numerodorsal;
    }

    /**
     * Set the value of numerodorsal
     *
     * @param numerodorsal new value of numerodorsal
     */
    public void setNumerodorsal(int numerodorsal) {
        this.numerodorsal = numerodorsal;
    }

    @Override
    public String toString() {
        return super.toString()+ numerodorsal + ", " + posicion ;
    }

    
    
}
