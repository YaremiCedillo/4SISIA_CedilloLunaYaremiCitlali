import java.util.Scanner;

public class Huron extends Animal{
    String largo;
    Scanner entrada = new Scanner(System.in);

    public Huron(){

    }

    public Huron(String nombre, String raza, String tipo_alimento, int edad, String largo){
        super(nombre, raza, tipo_alimento, edad);
        this.largo = largo;
    }

    //recibir
    public String getLargo(){
      System.out.println("Ingrese cuanto mide:");
      largo = entrada.nextLine();
        return largo;
    }

    //enviar
    public void setLargo(String largo){
        this.largo = largo;
    }

    //el metodo propio 
    public void mostrarHuron(){
        System.out.println("\n --------- Datos del Huroncito ---------\n\n   El nombre del huron es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " +getTipo_alimento() +  "\n" + "   Tiene la edad de: " + getEdad() + " años \n" + "   Mide: " + getLargo()+"\n --------------------------------------");
        
    }




    
}