package lab5p2_joselagos;


public class Entrenadores extends Persona{
    private int contrato;
    private int copas;

    public Entrenadores() {
        super();
    }

    public Entrenadores(int contrato, int copas, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.contrato = contrato;
        this.copas = copas;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
