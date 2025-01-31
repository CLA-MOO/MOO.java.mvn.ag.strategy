package descuento;

import venta.Venta;

public class MenonitaDescuento implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        System.out.println("Sin descuento ...");
        return 0;
    }
}
