package model;

public abstract class Supermercado {

    private int numeroDeEmpleados;

    public Supermercado(int numeroDeEmpleados) {
        this.numeroDeEmpleados = numeroDeEmpleados;
    }

    public abstract void pagarProductos();
}
