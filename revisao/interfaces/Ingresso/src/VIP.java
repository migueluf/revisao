
package Ingresso;
import javax.swing.JOptionPane;
public class VIP extends Ingresso{
    
    protected Double Add = 10.0;
    
    public void imprimeValor(){
        Add = Valor + Add;
        JOptionPane.showMessageDialog(null, "O valor do ingresso VIP é: "+Add);
    }
}
