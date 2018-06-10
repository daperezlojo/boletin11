package seleccion;

public class Xogador extends Persoa {

    private int dorsal;
    private String demarcacion;

    public Xogador(int id, int edade, int dorsal, String nome, String apelido, String demarcacion) {
                    super(id, edade, nome, apelido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void xogarPartido() {

    }

    public void entrenar() {

    }
    //Setters

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    

    //Getters
   
    public int getDorsal() {
        return dorsal;
    }



    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public String toString() {
        return (super.toString())+"Xogador\n" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os xogadores"); 
    }

    
    
    
    
}
