public class ChispasChocolate extends DecoradorHelado {

    public ChispasChocolate(Helado heladoDecorado) {
        super(heladoDecorado);
    }

    
    public String getDescripcion() {
        return heladoDecorado.getDescripcion() + " + Chispas de Chocolate";
    }

   
    public double getCosto() {
        return heladoDecorado.getCosto() + 1000.0;
    }
}
