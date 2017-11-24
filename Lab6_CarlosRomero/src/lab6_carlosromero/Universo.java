/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_carlosromero;

import java.util.ArrayList;

/**
 *
 * @author Will
 */
public class Universo {
    private String Nombre;
    private ArrayList<SeresVivos> SeresVivos=new ArrayList();

    public Universo() {
    }

    public Universo(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<SeresVivos> getSeresVivos() {
        return SeresVivos;
    }

    public void setSeresVivos(ArrayList<SeresVivos> SeresVivos) {
        this.SeresVivos = SeresVivos;
    }
    
    
}
