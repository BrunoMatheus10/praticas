import javax.swing.JOptionPane;

public class Atividademedia {
    public static void main(String[] args) {
    
        String valor;
     
        int n1;
        int n2;
        int n3;

        valor = JOptionPane.showInputDialog("digite sua primeira nota");
        valor = JOptionPane.showInputDialog("digite sua segunda nota");
        valor = JOptionPane.showInputDialog("digite sua terceira nota");

        n1 = Integer.parseInt(valor);
        n2 = Integer.parseInt(valor);
        n3 = Integer.parseInt(valor);

        JOptionPane.showMessageDialog(null, "sua media é " + (n1 + n2 + n3 ) / 3);

    }
    
}
