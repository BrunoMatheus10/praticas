import javax.swing.JOptionPane;

public class pessoa3 {
    //Atributos
    private String nome;
    public int idade;
    protected double renda;

    //métodos
    public void imprimeDados() {
        JOptionPane.showMessageDialog(null,"nome:"+ nome
        +"\nIdade: "+idade
        +"\nRenda: "+renda);
    }
}
