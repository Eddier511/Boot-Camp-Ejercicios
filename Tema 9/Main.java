public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Eduardo";
        cliente.edad = 32;
        cliente.telefono = 8387383;
        cliente.credito = true;

        Trabajador trabajador = new Trabajador();
        trabajador.salario = 4800;

        System.out.println("EL cliente " + cliente.nombre + " que tiene " + cliente.edad + " años, con el telefono: " + cliente.telefono + " la repuesta del credito fue: " + cliente.credito);
        System.out.println("El salario del trabajador es de:" + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    boolean credito;
}

class Trabajador extends Persona {
    int salario;
}
    

