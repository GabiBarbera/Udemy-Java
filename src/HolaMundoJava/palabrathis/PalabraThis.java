package HolaMundoJava.palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
    Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre = " + persona.nombre);
        System.out.println("persona apellido = " + persona.apellido);
    }
}

class Persona {
    public String nombre;
    public String apellido;

    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        new Imprimir().imprimir(this);
    }
}
class Imprimir {
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
    }
}