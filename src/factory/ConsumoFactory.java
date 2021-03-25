package factory;

import model.Consumo;
import model.Supermercado;

public class ConsumoFactory extends SupermercadoFactory {

    @Override
    public Supermercado crearSupermercado() {
        return new Consumo(10);
    }
}
