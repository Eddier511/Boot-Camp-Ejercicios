public class Parte2{

public static void main(String[] args) {

    Coche miCoche = new Coche();
    miCoche.IncrementarPuerta();
    System.out.println(miCoche.puertas);


}
}

class Coche {

    public int puertas = 4;

    public void IncrementarPuerta() {
        this.puertas++;
    }

}
