public class Main {
    public static void main(String[] args) {

        // Helado simple
        Helado heladoSimple = new HeladoBase("Vainilla");
        System.out.println(heladoSimple.getDescripcion() + " - $" + heladoSimple.getCosto());

        // Helado decorado con dos toppings
        Helado heladoConCarameloYCrema = new CremaBatida(
                new SalsaCaramelo(
                        new HeladoBase("Fresa")));
        System.out.println(heladoConCarameloYCrema.getDescripcion() + " - $" + heladoConCarameloYCrema.getCosto());

        // Helado con varios toppings
        Helado heladoCompleto = new Galleta(
                new ChispasChocolate(
                        new Frutas(
                                new CremaBatida(
                                        new HeladoBase("Chocolate")))));
        System.out.println(heladoCompleto.getDescripcion() + " - $" + heladoCompleto.getCosto());
    }
}
