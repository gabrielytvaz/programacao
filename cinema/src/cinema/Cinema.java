/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinema;
import javax.swing.JOptionPane;

public class Cinema {
   

    
    public static void main(String[] args) {
     Filme filme = new Filme();
     filme.nome = "TropadeE";
     filme.classificação = 18;
     filme.duração= 120;
     filme.genero="ação";
     filme.atores=JOptionPane.showInputDialog("nome dos atores:");

        System.out.println("------FILME-------");
        System.out.println(filme.nome);
        System.out.println("classificação"+filme.classificação);
        System.out.println("duração"+filme.duração);
        System.out.println("genero"+filme.genero);
        System.out.println("atores"+filme.atores);
     
        int idade = 14;
       if(filme.verificaIdade(idade) == true)
       {
           System.out.println("Pode assitir");
       }
       else
       {
           System.out.println("não pode assitir o filme,idade abaixo do permitido");
       }
    }
    int dur;
    
    
    
}
