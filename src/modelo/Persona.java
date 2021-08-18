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
public class Persona {
    
    private String nombrep;
    private String telefonop;
    private String correop;

    public Persona() {
    }

    public Persona(String nombrep, String telefonop, String correop) {
        this.nombrep = nombrep;
        this.telefonop = telefonop;
        this.correop = correop;
    }

    /**
     * Get the value of correop
     *
     * @return the value of correop
     */
    public String getCorreop() {
        return correop;
    }

    /**
     * Set the value of correop
     *
     * @param correop new value of correop
     */
    public void setCorreop(String correop) {
        this.correop = correop;
    }


    /**
     * Get the value of telefonop
     *
     * @return the value of telefonop
     */
    public String getTelefonop() {
        return telefonop;
    }

    /**
     * Set the value of telefonop
     *
     * @param telefonop new value of telefonop
     */
    public void setTelefonop(String telefonop) {
        this.telefonop = telefonop;
    }


    /**
     * Get the value of nombrep
     *
     * @return the value of nombrep
     */
    public String getNombrep() {
        return nombrep;
    }

    /**
     * Set the value of nombrep
     *
     * @param nombrep new value of nombrep
     */
    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    @Override
    public String toString() {
        return nombrep + "," + telefonop + "," + correop+",";
    }

    

    
    
}
