package lab5p2_joselagos;

public class Psicologos extends Persona{
    private String titulo;
    private String ID;
    private String especialidad;
    private int informes = 0;
    private int atendidos = 0;

    public Psicologos() {
        super();
    }

    public Psicologos(String titulo, String ID, String especialidad, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.titulo = titulo;
        this.ID = ID;
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getInformes() {
        return informes;
    }

    public void setInformes(int informes) {
        this.informes = informes;
    }

    public int getAtendidos() {
        return atendidos;
    }

    public void setAtendidos(int atendidos) {
        this.atendidos = atendidos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
