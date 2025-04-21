public class Tecnico {
    private int id;
    private String nombre;
    private String especialidad;

    // Constructor
    public Tecnico(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Técnico ID: " + id +
                "\nNombre: " + nombre +
                "\nEspecialidad: " + especialidad;
    }
}
