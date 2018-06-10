package seleccion;

public class Persoa {
    private int id, edade;
    private String nome, apelido;
    
    public void viaxar(){
        System.out.println("Viaxa a seleccion");
    }
    public void concentrarse(){
        System.out.println("concentrase a seleccion");
    }

    public Persoa(int id, int edade, String nome, String apelido) {
        this.id = id;
        this.edade = edade;
        this.nome = nome;
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Persoa\n" + "id=" + id + ", edade=" + edade + ", nome=" + nome + ", apelido=" + apelido;
    }


}
