package EjercicioSupermercado;


class Producto implements Comparable<Producto> {
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " + descripcion + " /// Precio: $" + precio;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return Double.compare(this.precio, otroProducto.precio);
    }

    public String getNombre() {
        return nombre;
    }
}