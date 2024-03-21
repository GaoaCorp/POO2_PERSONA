import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el nombre: ");
    String nombre = scanner.nextLine();

    System.out.println("Ingrese la edad: ");
    int edad = scanner.nextInt();

    System.out.println("Ingrese el sexo (H/M): ");
    char sexo = scanner.next().charAt(0);

    System.out.println("Ingrese el peso (en kg): ");
    double peso = scanner.nextDouble();

    System.out.println("Ingrese la altura (en metros): ");
    double altura = scanner.nextDouble();

    Persona persona = new Persona();
    persona.setNombre(nombre);
    persona.setEdad(edad);
    persona.setSexo(sexo);
    persona.setPeso(peso);
    persona.setAltura(altura);


    System.out.println(persona);


    int resultadoIMC = persona.calcularIMC();
    if (resultadoIMC == Persona.PESO_BAJO) {
        System.out.println("Está por debajo de su peso ideal.");
    } else if (resultadoIMC == Persona.PESO_IDEAL) {
        System.out.println("Está en su peso ideal.");
    } else {
        System.out.println("Tiene sobrepeso.");
    }


    if (persona.esMayorDeEdad()) {
        System.out.println("Es mayor de edad.");
    } else {
        System.out.println("Es menor de edad.");
    }


    System.out.println("Cédula: " + persona.getCedula());
}
