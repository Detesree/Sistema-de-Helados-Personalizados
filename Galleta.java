public class Galleta extends DecoradorHelado {

    public Galleta(Helado heladoDecorado) {
        super(heladoDecorado);
    }

    
    public String getDescripcion() {
        return heladoDecorado.getDescripcion() + " + Galleta Crujiente";
    }

    
    public double getCosto() {
        return heladoDecorado.getCosto() + 800.0;
    }
}
