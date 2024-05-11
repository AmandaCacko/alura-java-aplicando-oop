public class Calculadora {
    public int retornaDobro(int numero) {
      return numero * 2;
    }

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.retornaDobro(5);
        System.out.println(resultado);
    }
}
