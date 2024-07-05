public class usaClasses {
    public static void main (String[] args) {
        //pessoa p = new pessoa ();
        Pessoa p;
        p = new Pessoa();
        Pessoa p1 = new Pessoa();

        p.nome = "fulano";
        p.idade = "25 anos";
        p.renda = "1.000.00 R$";
        p.numero = "(11) 3003-2002";
        p.email = "fulano@gmail.com";
        p.cpf = "111.222.333-44";
        p.rg = "44.444.444";
        p.datanasc = "11/11/2011";
        p.cidade = "sao paulo";
        p.peso = "75 kls";
        p.altura = "1,75 cm";
        p.raça = "pardo";
        p.nacionalidade = "brasileiro";


        System.out.println ("nome:" + p.nome);
        System.out.println ("idade:" + p.idade);
        System.out.println("numero:" + p.numero);
        System.out.println("email:" + p.email);
        System.out.println("renda:" + p.renda);
        System.out.println("cpf:" + p.cpf);
        System.out.println("rg:" + p.rg);
        System.out.println("datanasc:" + p.datanasc);
        System.out.println("cidade:" + p.cidade);
        System.out.println("peso:" + p.peso);
        System.out.println("altura:" + p.altura);
        System.out.println("raça:" + p.raça);
        System.out.println("nacionalidade:" + p.nacionalidade);


        System.out.println("nome:" + p1.nome);
        System.out.println("idade: "+ p1.idade);
        System.out.println("Renda:" + p1.renda);

    } 
    
}
