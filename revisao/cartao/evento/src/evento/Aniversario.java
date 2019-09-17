
package evento;
import javax.swing.JOptionPane;

public class Aniversario extends CartaoWeb{
    
    
    public Aniversario(){
        super.destinatario = destinatario;
    }
    
    
    
    @Override
    public void retornarMensagem(){
        destinatario = JOptionPane.showInputDialog("Insira seu nome: ");
        JOptionPane.showMessageDialog(null,"Feliz aniversario "+destinatario+"!");
    }
}
