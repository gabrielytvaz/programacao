
package lojacelular;


public class Modelo {
   private String nomemodelo;
   private String memoriainterna;
   private String chips;
   private Fabricante fabricante;

    public String getNomemodelo() {
        return nomemodelo;
    }

    public void setNomemodelo(String nomemodelo) {
        this.nomemodelo = nomemodelo;
    }

    public String getMemoriainterna() {
        return memoriainterna;
    }

    public void setMemoriainterna(String memoriainterna) {
        this.memoriainterna = memoriainterna;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
   
}
