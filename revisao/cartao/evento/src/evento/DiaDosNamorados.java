
package evento;

import javax.swing.JOptionPane;


public class DiaDosNamorados extends CartaoWeb{
    
    
    public DiaDosNamorados(){
        super.destinatario = destinatario;
    }
    @Override
    public void retornarMensagem(){
    destinatario = JOptionPane.showInputDialog("Insira seu nome: ");
    JOptionPane.showMessageDialog(null,"Feliz dia dos namorados "+destinatario+"!");
        
    }
}
