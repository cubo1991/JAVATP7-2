package Ejercicios;

import java.util.HashMap;
import java.util.HashSet;

public class Computadora {
    private String marca;
    private String modelo;
    private HashSet<ComponenteCPU> ComponenteCPU;



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<Ejercicios.ComponenteCPU> getComponenteCPU() {
        return ComponenteCPU;
    }

    public void setComponenteCPU(HashSet<Ejercicios.ComponenteCPU> componenteCPU) {
        ComponenteCPU = componenteCPU;
    }
}
