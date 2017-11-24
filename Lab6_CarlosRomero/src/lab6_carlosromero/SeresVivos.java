/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_carlosromero;

/**
 *
 * @author Will
 */
public class SeresVivos {
    private String NombreDeRaza;
    private int NumeroDeKi;
    private int NumeroMaximoDeAnios;
    private String NombreDelPlaneta;

    public SeresVivos() {
    }

    public SeresVivos(String NombreDeRaza, int NumeroDeKi, int NumeroMaximoDeAnios, String NombreDelPlaneta) {
        this.NombreDeRaza = NombreDeRaza;
        this.NumeroDeKi = NumeroDeKi;
        this.NumeroMaximoDeAnios = NumeroMaximoDeAnios;
        this.NombreDelPlaneta = NombreDelPlaneta;
    }

    public String getNombreDeRaza() {
        return NombreDeRaza;
    }

    public void setNombreDeRaza(String NombreDeRaza) {
        this.NombreDeRaza = NombreDeRaza;
    }

    public int getNumeroDeKi() {
        return NumeroDeKi;
    }

    public void setNumeroDeKi(int NumeroDeKi) {
        this.NumeroDeKi = NumeroDeKi;
    }

    public int getNumeroMaximoDeAnios() {
        return NumeroMaximoDeAnios;
    }

    public void setNumeroMaximoDeAnios(int NumeroMaximoDeAnios) {
        this.NumeroMaximoDeAnios = NumeroMaximoDeAnios;
    }

    public String getNombreDelPlaneta() {
        return NombreDelPlaneta;
    }

    public void setNombreDelPlaneta(String NombreDelPlaneta) {
        this.NombreDelPlaneta = NombreDelPlaneta;
    }

    @Override
    public String toString() {
        return NombreDeRaza +"|"+ NumeroDeKi +"|"+ NumeroMaximoDeAnios +"|"+ NombreDelPlaneta+"\n";
    }

    
}
