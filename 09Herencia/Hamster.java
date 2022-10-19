import java.util.Scanner;

public class Hamster extends Animal{
    String cachetes;
    Scanner entrada = new Scanner(System.in);

    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String cachetes){
        super(nombre, raza, tipo_alimento, edad);
        this.cachetes = cachetes;
    }

    //recibir
    public String getCachetes(){
      System.out.println("Ingrese que tan grande tiene sus cachetes:");
      cachetes = entrada.nextLine();
        return cachetes;
    }

    //enviar
    public void setCachetes(String cachetes){
        this.cachetes = cachetes;
    }

    //el metodo propio 
    public void mostrarHamster(){
        System.out.println("\n ------ Datos del hamster ------\n\n   El nombre del hamster es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " +getTipo_alimento() +  "\n" + "   Tiene la edad de: " + getEdad() + " años \n" + "   Su cachetes son: " + getCachetes()+"\n -------------------------------");
        
    }
}