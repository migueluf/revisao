
package evento;
import javax.swing.JOptionPane;

public class Natal extends CartaoWeb{
 
    
    public Natal(){
        super.destinatario = destinatario;
    }
    
    @Override
    public void retornarMensagem(){
    destinatario = JOptionPane.showInputDialog("Qual seu nome: ");
   
    JOptionPane.showMessageDialog(null,"Feliz natal "+ destinatario+"!");   
    

    }
}
