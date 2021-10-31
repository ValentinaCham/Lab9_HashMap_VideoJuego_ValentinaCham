package lab9_valentinachambilla;


public class Soldado {
    private String Nom="";
    private int puntoVida=0;
    private int Fila=0;
    private int Columna=0;
    private int Equipo;
    //Equipo 1: Primer equipo
    //Equipo 2: Segundo Equipo
    
    public Soldado(String nombre, int Vida, int fila, int columna, int equi){
        Nom = nombre;
        puntoVida = Vida;
        Fila = fila;
        Columna = columna;
        Equipo = equi;
    }
    
    public String getNom(){
        return Nom;
    }
    
    public int getPuntoVida(){
        return puntoVida;
    }
    
    public int getFila(){
        return Fila;
    }
    
    public int getColumna(){
        return Columna;
    }
    
    public int getEqui(){
        return Equipo;
    }
}
