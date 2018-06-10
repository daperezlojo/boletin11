package seleccion;

public class Masaxista extends Persoa {

    private int  anosExperiencia;
    private String titulación;

    public Masaxista(int id, int edade, int anosExperiencia, String nome, String apelido, String titulación) {
        super(id, edade, nome, apelido);
        this.anosExperiencia = anosExperiencia;
        this.titulación = titulación;
    }


    public void darMasaxex() {

    }

    //Setters
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setTitulación(String titulación) {
        this.titulación = titulación;
    }

    //Getters
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String getTitulación() {
        return titulación;
    }

    @Override
    public String toString() {
        return (super.toString())+"Masaxista\n" + "anosExperiencia=" + anosExperiencia + ", titulaci\u00f3n=" + titulación;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os xogadores"); 
    }

    
    
    
    
    
}
