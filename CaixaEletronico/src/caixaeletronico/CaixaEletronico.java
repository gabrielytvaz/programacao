
package caixaeletronico;

import javax.swing.JOptionPane;
public class CaixaEletronico {

    
    public static void main(String[] args) {
     
 Conta c = new Conta();
Integer opcao = 0;
while (opcao != 6){
opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU:\n\t1. Abrir conta\n\t2. Depositar\n\t3. Sacar\n\t4. Fechar conta\n\t5. Mostrar saldo\n\t6. SAIR."));
switch(opcao){
case 1:
String nome, agencia, numero;
nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
agencia = JOptionPane.showInputDialog(null, "Digite a sua agência: ");
numero = JOptionPane.showInputDialog(null, "Digite o número da sua conta: ");
c.abrir(nome, agencia, numero);
break;

case 2:
Double valor = Double.parseDouble(JOptionPane.showInputDialog("R$ Depósito"));
Boolean ret = c.depositar(valor);
if (ret==true){
JOptionPane.showMessageDialog(null, "Depósito OK");
}
else{
JOptionPane.showMessageDialog(null, "Não foi possivel depositar");
}
break;
case 3:
Double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Quanto você deseja sacar?"));
Boolean ret1 = c.sacar(valor1);
if (ret1 == true){
JOptionPane.showMessageDialog(null, "Saque feito com sucesso.");
}
else {
JOptionPane.showMessageDialog(null, "ERRO.");
}
break;
case 4:
Boolean fechar = c.fecharConta();
if (fechar == true){
JOptionPane.showMessageDialog(null, "Conta fechada.");
}
else {
JOptionPane.showMessageDialog(null, "A conta não pode ser fechada (Deve-se sacar todo dinheiro da conta)");
}
break;
case 5: JOptionPane.showMessageDialog(null, "Seu saldo é: " +c.saldo);
break;
case 6: JOptionPane.showMessageDialog(null, "Sessão finalizada.");
break;
default: JOptionPane.showMessageDialog(null, "Opção inválida.");
}

}
}
    }
    

