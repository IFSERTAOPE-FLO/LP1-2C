package Aula4;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tempo(int h) {
        if (validarTime(h, 0, 0)) {
            this.hora = h;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Tempo(int h, int m) {
        if (validarTime(h, m, 0)) {
            this.hora = h;
            this.minuto = m;
            this.segundo = 0;
        }
    }

    public Tempo(int h, int m, int s) {
        if (validarTime(h, m, s)) {
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
        }
    }

    public boolean validarTime(int h, int m, int s) {
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)) {
            return true;
        } else {
            return false;
        }
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    //Métodos que serão criados...


    //5ª questão
    //public long compare(Tempo t){
    //}

}
