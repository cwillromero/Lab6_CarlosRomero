/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_carlosromero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author Will
 */
public class Universo{
    private javax.swing.JTextArea ta_1;
    private String y="";
    private String Nombre;
    private ArrayList<SeresVivos> SeresVivos=new ArrayList();
    private File Archivo=null;
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
    
    public void Crear(String Nombre){
        this.Nombre=Nombre;
        Archivo =new File("./"+this.Nombre+".txt");
    }
    
    public void EscribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);
            for (SeresVivos t : SeresVivos) {
                bw.write(t.getNombreDeRaza()+ "|");
                bw.write(t.getNumeroDeKi()+ "|");
                bw.write(t.getNumeroMaximoDeAnios()+"|");
                bw.write(t.getNombreDelPlaneta()+ "|");
                bw.write("     ");
                System.out.println(t);
                
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void setTetxtArea(javax.swing.JTextArea jtAbrrir){
        this.ta_1=jtAbrrir;
    }
    
    public String AbrirArchivo(File archivo) throws FileNotFoundException, IOException{
        String linea=null;
        String x="";
        FileReader fr=null;
        BufferedReader br=null;
        this.Archivo=archivo;
        fr=new FileReader(this.Archivo);
        br=new BufferedReader(fr);
        while ((linea=br.readLine())!=null) {
                    x+=linea;
                    x+="\n";
        }
        try {
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return x;
        
    }
    
}
