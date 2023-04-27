public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Eduardo");
        persona.setEdad(28);
        persona.setTelefono(8568132);

        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años" + " y su telefono es " + persona.getTelefono() );

    }
}

class Persona {

    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public int getTelefono() {
        return this.telefono;
    }
}