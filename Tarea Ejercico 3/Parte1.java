public class Parte1 {

public static void main(String[] args) {

    int param1 = 10;
    int param2 = 15;
    int param3 = 20;

    var valor = suma(param1, param2, param3);
     
     System.out.println(valor);
}

  public static int suma(int a, int b, int c){
  return a + b + c;
}

}