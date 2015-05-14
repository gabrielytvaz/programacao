

package caixaeletronico;


public class Conta {
private String agencia;
private String numeroConta;
private Cliente Correntista;
private Double saldo;
private Boolean ativo;
private Gerente gerente;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
  
    public Cliente getCorrentista() {
        return Correntista;
    }

    public void setCorrentista(Cliente Correntista) {
        this.Correntista = Correntista;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }


void abrir(String vagencia, String vnumero, Cliente vnome)
{
agencia = vagencia;
numeroConta = vnumero;
Correntista = vnome;
ativo = true;
saldo = 0.0;

}

Boolean fecharConta()
{

Boolean retorno;
if(saldo==0.0)
{
ativo=false;
retorno = true;

}
else
{
retorno = false;
}
return retorno;
}

Boolean depositar(Double valor)
{
if(ativo == true)
{
saldo = saldo + valor;
return true;
}
else
{
return false;
}
}

Boolean sacar(Double valor)
{
if(ativo == true && valor<=saldo)
{
saldo = saldo - valor;
return true;
}
else
{
return false;
}
}

Double retornarSaldo()
{
return saldo;
}    
}
