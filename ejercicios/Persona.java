public class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return nombre + " - " + edad;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona otra = (Persona) obj;
        return nombre.equals(otra.nombre) && edad == otra.edad;
    }
}
