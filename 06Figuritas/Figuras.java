import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

//libreria math es para el uso de raiz cuadrada y potencias, asi como numero de euler pi, etc

class Figura {

  // variables globales
  double lado, altura, area, perimetro, lado2, lado3, base;
  int opcion, opcion2;
  char letra;
  boolean comprobacion = false;

  // objeto
  Scanner entrada = new Scanner(System.in);

  // metodos

  public void menu() {
    /**
     * vamos a realizar un prgorama que se encargue del calculo del area y perimetro
     * de cuadrado, triangulo, rectangulo y circulo
     */

    do {
      System.out.println("Programa para el calculo de area y perimetro de figuras");
      System.out.println("Elija una opcion deseada: ");
      System.out.println("1.- Cuadrado");
      System.out.println("2.- Triangulo");
      System.out.println("3.- Circulo");
      System.out.println("4.- Rectangulo");
      System.out.println("5.- Salir");

      opcion = entrada.nextInt();

      switch (opcion) {
        case 1:
          calcularCuadrado();
          break;
        case 2:
          calcularTriangulo();
          break;
        case 3:
          calcularCirculo();
          break;
        case 4:
          calcularRectangulo();
          break;
        default:
          System.out.println("Gracias por ocupar este programa saluditos");
          break;
      }
      System.out.println("¿Desea repetir el programa?, escriba S para repetir ");
      letra = entrada.next().charAt(0);

    } while (letra == 's' || letra == 'S');
  }

  public void calcularCuadrado() {
    do {
      comprobacion = false;
      try {
        System.out.println("-- Área y perímetro del cuadrado --");
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        lado = entrada.nextDouble();
        perimetro = lado * 4;
        area = lado * lado;
        System.out.println("El perimetro es de: " + perimetro + " el area es de: " + area);

      } catch (InputMismatchException e) {
        System.out.println("Ingrese unicamente valores numericos");
        comprobacion = true;
        entrada.nextLine();

      }
    } while (comprobacion);
  }

  public void calcularTriangulo() {
    do {
      comprobacion = false;
      try {
        System.out.println("Ingrese 1 para el area y 2 para el perimetro : ");
        opcion = entrada.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Ingrese unicamente valores numericos");
        comprobacion = true;
        entrada.nextLine();
      }
    } while (comprobacion);

    switch (opcion) {
      case 1:
        do {
          comprobacion = false;
          try {
            System.out.println("-- Área del triangulo --");
            System.out.println("Ingresa la base del triangulo: ");
            base = entrada.nextDouble();
            System.out.println("Ingrese la altura del triangulo: ");
            altura = entrada.nextDouble();
            area = (base * altura) / 2;
            System.out.println("El area del triangulo es: " + area);

          } catch (InputMismatchException e) {
            System.out.println("Ingrese unicamente valores numericos");
            comprobacion = true;
            entrada.nextLine();
          }
        } while (comprobacion);
        break;

      case 2:
        do {
          comprobacion = false;
          try {
            System.out.println("1. Triangulo equilatero");
            System.out.println("2. Triangulo escaleno");
            System.out.println("3. Triangulo isoseles");
            opcion2 = entrada.nextInt();
          } catch (InputMismatchException e) {
            System.out.println("Ingrese unicamente valores numericos");
            comprobacion = true;
            entrada.nextLine();
          }
        } while (comprobacion);
        switch (opcion2) {
          case 1:
            do {
              comprobacion = false;
              try {
                System.out.println("-- Perímetro del Triangulo equilatero --");
                System.out.println("Ingrese el valor del lado del triangulo: ");
                lado = entrada.nextDouble();
                perimetro = lado * 3;
                System.out.println("El perimetro es de: " + perimetro);
              } catch (InputMismatchException e) {
                System.out.println("Ingrese unicamente valores numericos");
                comprobacion = true;
                entrada.nextLine();
              }
            } while (comprobacion);
            break;

          case 2:
            do {
              comprobacion = false;
              try {
                System.out.println("-- Perímetro del Triangulo escaleno --");
                System.out.println("Ingrese el valor del lado 1 del triangulo: ");
                lado = entrada.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del triangulo: ");
                lado2 = entrada.nextDouble();
                System.out.println("Ingrese el valor del lado 3 del triangulo: ");
                lado3 = entrada.nextDouble();
                perimetro = lado + lado2 + lado3;
                System.out.println("El perimetro es de: " + perimetro);
              } catch (InputMismatchException e) {
                System.out.println("Ingrese unicamente valores numericos");
                comprobacion = true;
                entrada.nextLine();
              }
            } while (comprobacion);
            break;

          case 3:
            do {
              comprobacion = false;
              try {
                System.out.println("-- Perímetro del Triangulo isoseles --");
                System.out.println("Ingresa la base del triangulo: ");
                base = entrada.nextDouble();
                System.out.println("Ingrese el valor de un lado del triangulo: ");
                lado = entrada.nextDouble();
                perimetro = (lado * 2) + base;
                System.out.println("El perimetro es de: " + perimetro);
              } catch (InputMismatchException e) {
                System.out.println("Ingrese unicamente valores numericos");
                comprobacion = true;
                entrada.nextLine();
              }
            } while (comprobacion);
            break;
        }
      default:
        System.out.println("Opcion invalida ");
        break;
    }
  }

  public void calcularCirculo() {
    do {
      comprobacion = false;
      try {
        System.out.println("Ingrese 1 para el area y 2 para el perimetro : ");
        opcion = entrada.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Ingrese unicamente valores numericos");
        comprobacion = true;
        entrada.nextLine();
      }
    } while (comprobacion);

    switch (opcion) {
      case 1:
        do {
          comprobacion = false;
          try {
            System.out.println("-- Área del circulo --");
            System.out.println("Ingresa el radio del circulo: ");
            lado = entrada.nextDouble();
            // pi * r* r
            area = Math.PI * lado * lado;
            System.out.println("El area es de: " + area);
          } catch (InputMismatchException e) {
            System.out.println("Ingrese unicamente valores numericos");
            comprobacion = true;
            entrada.nextLine();
          }
        } while (comprobacion);
        break;

      case 2:
        do {
          comprobacion = false;
          try {
            System.out.println("-- Perímetro del circulo --");
            System.out.println("Ingrese el diametro del circulo: ");
            lado = entrada.nextDouble();
            // PI * diametro
            perimetro = Math.PI * lado;
            System.out.println("El perimetro es de : " + perimetro);
          } catch (InputMismatchException e) {
            System.out.println("Ingrese unicamente valores numericos");
            comprobacion = true;
            entrada.nextLine();
          }
        } while (comprobacion);
        break;

      default:
        System.out.println("Opcion no valida");
        break;
    }

  }

  public void calcularRectangulo() {
    do {
      comprobacion = false;
      try {
        System.out.println("-- Área y perímetro del rectangulo --");
        System.out.println("Ingrese la base del rectangulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = entrada.nextDouble();
        perimetro = (2 * altura) + (2 * base);
        area = altura * base;
        System.out.println("El perimetro es de: " + perimetro + " el area es de: " + area);

      } catch (InputMismatchException e) {
        System.out.println("Ingrese unicamente valores numericos");
        comprobacion = true;
        entrada.nextLine();

      }
    } while (comprobacion);

  }

}