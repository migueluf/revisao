
package interfaces;


public abstract class Building implements CarbonFootprint{
    int nPessoas;
    Boolean usoEnergia;
    int nLampadas;
    Boolean arCond;
    
    @Override
    public void getCarbonFootprint(){}
}
