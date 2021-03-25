package model;

public class Exito extends Supermercado {

    public Exito(int numeroDeEmpleados) {
        super(numeroDeEmpleados);
    }

    @Override
    public void pagarProductos() {
        System.out.println("Pagando como Exito");
    }
}
