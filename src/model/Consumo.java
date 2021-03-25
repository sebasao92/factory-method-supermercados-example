package model;

public class Consumo extends Supermercado {

    public Consumo(int numeroEmpleados){
        super(numeroEmpleados);
    }

    @Override
    public void pagarProductos() {
        System.out.println("Pagando como model.Consumo");
    }
}
