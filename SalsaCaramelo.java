public class SalsaCaramelo extends DecoradorHelado {

    public SalsaCaramelo(Helado heladoDecorado) {
        super(heladoDecorado);
    }

    
    public String getDescripcion() {
        return heladoDecorado.getDescripcion() + " + Salsa de Caramelo";
    }

    
    public double getCosto() {
        return heladoDecorado.getCosto() + 1200.0;
    }
}
