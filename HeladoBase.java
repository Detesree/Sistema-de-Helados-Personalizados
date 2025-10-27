public class HeladoBase implements Helado {
    private String sabor;

    public HeladoBase(String sabor) {
        this.sabor = sabor;
    }

    
    public String getDescripcion() {
        return "Helado de " + sabor;
    }

   
    public double getCosto() {
        return 5000.0; // costo base del helado
    }
}
