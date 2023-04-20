public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pessoa eu = new Pessoa();
        eu.nome = "Sandra Lima";
        eu.cpf = "123456789";
        eu.anoNascimento = 1990;

        Pessoa voce = new Pessoa();
        voce.nome = "João das Couves";
        voce.cpf = "999.999.999-99";
        voce.anoNascimento = 1992;

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Ford";
        meuCarro.modelo ="KA";
        meuCarro.cor = "Preto";
        meuCarro.anoFabricacao = 2010;
        meuCarro.precoCompra = 120000;
        meuCarro.proprietario = eu;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;

        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();
    }

}