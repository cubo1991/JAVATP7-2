package Ejercicios;


public class ComponenteCPU {
    private string Marca;
    private string Modelo;
    private int cantidad;
    private double precio;

    public string getMarca() {
        return Marca;
    }

    public void setMarca(string marca) {
        Marca = marca;
    }

    public string getModelo() {
        return Modelo;
    }

    public void setModelo(string modelo) {
        Modelo = modelo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}