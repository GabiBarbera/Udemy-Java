package ManejoArchivos.manejoArchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado al archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            try {
                var lectura = entrada.readLine();
                while (lectura != null) {
                    System.out.println("lectura = " + lectura);
                    lectura = entrada.readLine();
                }
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
}
