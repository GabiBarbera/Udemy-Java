package Interfaces.accesoDatos;

public interface AccesoDatos {
    int MAX_REGISTRO = 10;

    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}
