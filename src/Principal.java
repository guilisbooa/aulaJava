public class Principal {

    //Método principal, por onde o programa começa
    public static void main(String[] args) {

        //Criar um objeto a partir da classe Piloto
        Piloto borboleto = new Piloto();
        borboleto.nome = "Gabriel Borboleto";
        borboleto.equipe = "Sauber";
        borboleto.peso = 45;
        borboleto.vitorias = 0;

        //Criar um outro objeto de Piloto
        Piloto batata = new Piloto();
        batata.nome = "Souza Batata";
        batata.equipe = "Stack";
        batata.peso = 50.5f;
        batata.vitorias = 2;

        //Exibir os valores
        System.out.println(borboleto.nome + " " + borboleto.peso);
        System.out.println(borboleto.vitorias);


    }

}
