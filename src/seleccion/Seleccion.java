
package seleccion;

public class Seleccion {
    public static void main(String[] args) {
    
    Persoa X1 = new Xogador(15, 25 ,11, "Zinedine", "Zidane", "centrocampista");
    Persoa A1 = new Adestrador(17,36,"Agustin", "Fernandez", "A78");
    Persoa M1 = new Masaxista(45,43,9,"Martin", "Martinez","Experto");
   
       X1.concentrarse();
       A1.concentrarse();
       M1.concentrarse();

       X1.viaxar();
       A1.viaxar();
       M1.viaxar();
    
  //     X1.entrenar();
    }
   
}
