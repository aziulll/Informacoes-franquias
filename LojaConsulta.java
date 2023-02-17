package PastaLoja;

public class LojaConsulta {
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.setNome("Lojas Brasil");
        loja.setEndereco("Copacabana");
        loja.setTelefone(989643342);

       //Criei a estrutura de repetição pois pretendo adicionar (antes de vincular à um banco de dados) varios valores no endereço das lojas e 
       //imprimir o códido + nome de todas, com suas informações conforme exemplo abaixo
       for(int i = 1; i <= 1; i++) {
        int anoLoja = 2023;
        loja.setCodLocal(i);
        System.out.println(loja.getNome() + " - " + loja.getEndereco());
        System.out.println("código: " + anoLoja + i);
        System.out.println("Para entrar em contato com o Proprietário da franquia, basta ligar nesse número " + loja.getTelefone());
    
    }

  }
}
