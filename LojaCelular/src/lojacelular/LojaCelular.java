package lojacelular;

import javax.swing.JOptionPane;

public class LojaCelular {

    public static void main(String[] args) {

        Pais pais = new Pais();
        pais.setNomepais("Coréia do Sul");
        pais.setCapital("Seul");
        pais.setNumerohabitantes(1200000);

        Fabricante fabricante = new Fabricante();
        fabricante.setNomefabricante("Samsung");
        fabricante.setDatafundaçao("15/08/1970");
        fabricante.setPaisorigem(pais);

        Modelo modelo = new Modelo();
        modelo.setNomemodelo("SIII");
        modelo.setChips("2");
        modelo.setMemoriainterna("8 gb");
        modelo.setFabricante(fabricante);

        JOptionPane.showMessageDialog(null, "modelo" + modelo.getNomemodelo() + "\nFabricante" + fabricante.getNomefabricante() + "\nPaís de origem " + pais.getNomepais());

    }

    static {
        Pais pais = new Pais();
   pais.setNomepais("EUA");
   pais.setCapital("Washington DC");
   pais.setNumerohabitantes(21900000);
   
   Fabricante fabricante = new Fabricante();
   fabricante.setNomefabricante("Apple");
   fabricante.setDatafundaçao("14/09/1976");
   fabricante.setPaisorigem(pais);
   
   Modelo modelo = new Modelo();
   modelo.setNomemodelo("IPhone 6");
   modelo.setChips("1");
   modelo.setMemoriainterna("8 gb");
   modelo.setFabricante(fabricante);
   
   
  JOptionPane.showMessageDialog(null,"modelo" + modelo.getNomemodelo()  + "\nFabricante" + fabricante.getNomefabricante()+ "\nPaís de origem " + pais.getNomepais());
    }
    {
        Pais pais = new Pais();
   pais.setNomepais("Coréia do Sul");
   pais.setCapital("Seul");
   pais.setNumerohabitantes(1200000);
   
   Fabricante fabricante = new Fabricante();
   fabricante.setNomefabricante("Samsung");
   fabricante.setDatafundaçao("15/08/1970");
   fabricante.setPaisorigem(pais);
   
   Modelo modelo = new Modelo();
   modelo.setNomemodelo("SII");
   modelo.setChips("1");
   modelo.setMemoriainterna("16 gb");
   modelo.setFabricante(fabricante);
   
   
  JOptionPane.showMessageDialog(null,"modelo" + modelo.getNomemodelo()  + "\nFabricante" + fabricante.getNomefabricante()+ "\nPaís de origem " + pais.getNomepais());
    }
}
