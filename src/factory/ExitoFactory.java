package factory;

import model.Exito;
import model.Supermercado;

public class ExitoFactory extends SupermercadoFactory {
    @Override
    public Supermercado crearSupermercado() {
        return new Exito(10);
    }
}
