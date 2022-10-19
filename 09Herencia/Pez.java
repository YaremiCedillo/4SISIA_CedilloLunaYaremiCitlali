import java.util.Scanner;

public class Pez extends Animal{
    String aleta;
    Scanner entrada = new Scanner(System.in);

    public Pez(){

    }

    public Pez(String nombre, String raza, String tipo_alimento, int edad, String aleta){
        super(nombre, raza, tipo_alimento, edad);
        this.aleta = aleta;
    }

    //recibir
    public String getAleta(){
      System.out.println("Ingrese cuanto mide su aleta:");
       aleta= entrada.nextLine();
        return aleta;
    }

    //enviar
    public void setAleta(String aleta){
        this.aleta = aleta;
    }

    //el metodo propio 
    public void mostrarPez(){
        System.out.println("\n --------- Datos del Pececito ---------\n\n   El nombre del pez es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " +getTipo_alimento() +  "\n" + "   Tiene la edad de: " + getEdad() + " años \n" + "   Su aleta mide: " + getAleta()+"\n --------------------------------------");
        
    }




    
}