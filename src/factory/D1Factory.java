package factory;

import model.D1;
import model.Supermercado;

public class D1Factory extends SupermercadoFactory {

    @Override
    public Supermercado crearSupermercado() {
        return new D1(10);
    }
}
