import javax.swing.JOptionPane;

public class Grafico2 {
    public static void main(String[] args) {
        String valor;
        int n1;
        valor = JOptionPane.showInputDialog("digite um valor para ser multiplicado por 2");
        n1 = Integer.parseInt(valor);

        JOptionPane.showMessageDialog(null, n1 + "x 2 =" + n1 *2);
    }
    
}
