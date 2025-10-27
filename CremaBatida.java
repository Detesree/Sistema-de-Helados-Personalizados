public class CremaBatida extends DecoradorHelado {

    public CremaBatida(Helado heladoDecorado) {
        super(heladoDecorado);
    }

    public String getDescripcion() {
        return heladoDecorado.getDescripcion() + " + Crema Batida";
    }

   
    public double getCosto() {
        return heladoDecorado.getCosto() + 1500.0;
    }
}
