/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIGUEL PC
 */
public class Assistente extends Funcionario{
    
    private int Matricula;
    
    public int getMatricula(){
        return Matricula;
    }
    public void setMatricula(int Matricula){
        this.Matricula = Matricula;
    }
    
    
    @Override
    public void exibeDados(){}
}
