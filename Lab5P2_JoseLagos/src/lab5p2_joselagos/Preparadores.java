package lab5p2_joselagos;

public class Preparadores extends Persona{
    private String ID;
    private int contrato;
    private String especialidad;
    private String titulo;

    public Preparadores() {
        super();
    }

    public Preparadores(String ID, int contrato, String especialidad, String titulo, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.ID = ID;
        this.contrato = contrato;
        this.especialidad = especialidad;
        this.titulo = titulo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
