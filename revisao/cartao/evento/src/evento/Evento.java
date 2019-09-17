
package evento;
        

public class Evento {

   
    
    public static void main(String[] args) {
        
   Natal natals = new Natal();
   DiaDosNamorados namorados = new DiaDosNamorados();
   Aniversario ano = new Aniversario();
   

    CartaoWeb [] cartao = new CartaoWeb[3];
 
    
   
   ano.retornarMensagem();
   namorados.retornarMensagem();
   natals.retornarMensagem();
    }
    
}
