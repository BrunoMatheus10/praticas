public class TestePessoa3 {
    public static void main(String[] args) {
        pessoa3 p1 = new Pessoa();
        
        p1.nome = "Camila"; //erro de acesso
        p1.idade = 30; // acesso bem sucedido
        p1.renda = 1700.55; //acesso bem sucedido

        p1.imprimeDados(); //acesso bem sucedido
    }
}
