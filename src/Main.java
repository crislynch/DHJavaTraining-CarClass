//Scrivere un programma che contenga una classe
// che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.

public class Main {
    public static void main(String[] args) {
        Auto automobile1 = new Auto("BMW", "335is", "3000cc", "AMGKILL");
        System.out.println("L'automobile selezionata e': " + automobile1.getMarca() + ", " + automobile1.getModello() + ", " + automobile1.getCilindrata() + ", " + automobile1.getTarga());
    }
}