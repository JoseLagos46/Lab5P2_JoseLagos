package lab5p2_joselagos;

public class Partidos {
    private String nombre_rival;
    private int num_jugador;

    public Partidos() {
    }

    public Partidos(String nombre_rival, int num_jugador) {
        this.nombre_rival = nombre_rival;
        this.num_jugador = num_jugador;
    }

    public String getNombre_rival() {
        return nombre_rival;
    }

    public void setNombre_rival(String nombre_rival) {
        this.nombre_rival = nombre_rival;
    }

    public int getNum_jugador() {
        return num_jugador;
    }

    public void setNum_jugador(int num_jugador) {
        this.num_jugador = num_jugador;
    }

    @Override
    public String toString() {
        return "Partidos contra: " + nombre_rival;
    }
    
}
