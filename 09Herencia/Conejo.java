import java.util.Scanner;

public class Conejo extends Animal{
    String orejas;
    Scanner entrada = new Scanner(System.in);

    public Conejo(){

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, String orejas){
        super(nombre, raza, tipo_alimento, edad);
        this.orejas = orejas;
    }

    //recibir
    public String getOrejas(){
      System.out.println("Ingrese el tamaño de sus orejas:");
      orejas = entrada.nextLine();
        return orejas;
    }

    //enviar
    public void setOrejas(String orejas){
        this.orejas = orejas;
    }

    //el metodo propio 
    public void mostrarConejo(){
        System.out.println("\n --------- Datos del conejito ---------\n\n   El nombre del conejo es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " +getTipo_alimento() +  "\n" + "   Tiene la edad de: " + getEdad() + " años \n" + "   El tamaño de sus orejas es: " + getOrejas()+"\n ---------------------------------------");
        
    }




    
}