
package Ingresso;
import javax.swing.JOptionPane;

public class CamaroteSuperior extends VIP{
    
    protected Double AddVIP = 5.0;
    
    @Override
    public void imprimeValor(){
        AddVIP = Add + AddVIP;
        JOptionPane.showMessageDialog(null, "Ingresso extra VIP: R$"+AddVIP);
    }
}
