public class Frutas extends DecoradorHelado {

    public Frutas(Helado heladoDecorado) {
        super(heladoDecorado);
    }

    
    public String getDescripcion() {
        return heladoDecorado.getDescripcion() + " + Frutas Frescas";
    }

    
    public double getCosto() {
        return heladoDecorado.getCosto() + 1300.0;
    }
}
