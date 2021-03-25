package model;

public class D1 extends Supermercado {

    public D1(int numeroDeEmpleados) {
        super(numeroDeEmpleados);
    }

    @Override
    public void pagarProductos() {
        System.out.println("Pagando como model.D1");
    }
}
