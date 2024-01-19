//proprietà cilindrata, targa, marca e modello.
public class Auto {
    public String marca, modello, cilindrata, targa;
    public Auto(String marca, String modello, String cilindrata, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.targa = targa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public String getCilindrata() {
        return cilindrata;
    }
    public String getTarga() {
        return targa;
    }
    public void setMarca() {
        this.marca = marca;
    }
    public void setModello() {
        this.modello = modello;
    }
    public void setCilindrata() {
        this.cilindrata = cilindrata;
    }
    public void setTarga() {
        this.targa = targa;
    }

}
