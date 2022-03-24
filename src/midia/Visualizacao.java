package midia;

public class Visualizacao {
    private Boy espectador;
    private Video filme;

    public Visualizacao(Boy espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }
/*
    public void avaliar(){}

    public void avaliar(int nota){}

    public void avaliar(float porcent){}*/

    public Boy getEspectador() {
        return espectador;
    }

    public void setEspectador(Boy espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
