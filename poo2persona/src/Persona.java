import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Persona {
    public static final char SEXO_POR_DEFECTO = 'H';
    public static final int PESO_BAJO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;

    private String nombre = "";
    private int edad = 0;
    private char sexo = SEXO_POR_DEFECTO;
    private double peso = 0.0;
    private double altura = 0.0;
    private long cedula;

    public Persona() {
        generarCedula();
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public long getCedula() {
        return cedula;
    }


    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return PESO_BAJO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SEXO_POR_DEFECTO;
        }
    }

    private void generarCedula() {
        Random rand = new Random();
        cedula = Math.abs(rand.nextLong()) % 10000000000L;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + df.format(peso) +
                ", altura=" + df.format(altura) +
                ", cedula=" + cedula +
                '}';
    }
}