/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionMedicaAG;

/**
 *
 * @author allan
*/
public class PersonaAG {
    
    private String nombre_AG;
    private Integer Edad_AG;
    private String DireccionAG;

    public PersonaAG(String nombre_AG, Integer Edad_AG, String DireccionAG) {
        this.nombre_AG = nombre_AG;
        this.Edad_AG = Edad_AG;
        this.DireccionAG = DireccionAG;
    }  

    // Getters y Setters
    public String getNombre_AG() {
        return nombre_AG;
    }

    public void setNombre_AG(String nombre_AG) {
        this.nombre_AG = nombre_AG;
    }

    public Integer getEdad_AG() {
        return Edad_AG;
    }

    public void setEdad_AG(Integer Edad_AG) {
        this.Edad_AG = Edad_AG;
    }

    public String getDireccionAG() {
        return DireccionAG;
    }

    public void setDireccionAG(String DireccionAG) {
        this.DireccionAG = DireccionAG;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre_AG);
        System.out.println("Edad: " + Edad_AG);
        System.out.println("Dirección: " + DireccionAG);
    }
}




