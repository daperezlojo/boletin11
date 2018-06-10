package seleccion;

public class Adestrador extends Persoa {
    
    private String idFederacion;

    public Adestrador(int id, int edade, String nome, String apelido, String idFederacion) {
       super(id, edade, nome, apelido);
        this.idFederacion = idFederacion;
    }
    public void dirixirPartido() {

    }

    public void dirixirAdestramento() {

    }

    //Setter
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    //Getter
    public String getIdFederacion() {
        return idFederacion;
    }

    @Override
    public String toString() {
        return (super.toString())+"Adestrador\n" + "idFederacion=" + idFederacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os xogadores");
    }






}
