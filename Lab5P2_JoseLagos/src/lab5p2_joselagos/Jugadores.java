package lab5p2_joselagos;

public class Jugadores extends Persona{
    private int num_J;
    private int partidos = 0;
    private int copas = 0;
    private int tarjetas = 0;
    private int contrato;

    public Jugadores() {
        super();
    }

    public Jugadores(int num_J, int contrato, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.num_J = num_J;
        this.contrato = contrato;
    }

    public int getNum_J() {
        return num_J;
    }

    public void setNum_J(int num_J) {
        this.num_J = num_J;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public int getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(int tarjetas) {
        this.tarjetas = tarjetas;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
