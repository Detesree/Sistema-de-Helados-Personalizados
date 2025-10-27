public abstract class DecoradorHelado implements Helado {
    protected Helado heladoDecorado;

    public DecoradorHelado(Helado heladoDecorado) {
        this.heladoDecorado = heladoDecorado;
    }

    
    public String getDescripcion() {
        return heladoDecorado.getDescripcion();
    }

    public double getCosto() {
        return heladoDecorado.getCosto();
    }
}
