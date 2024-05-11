public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade() {
        return 2023 - ano;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Preto";

        // Exibir ficha técnica
        meuCarro.exibeFichaTecnica();

        // Calcular idade do carro
        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
    }
}
