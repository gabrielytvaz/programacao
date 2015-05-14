package caixaeletronico;

public class Cliente {

    private String cpf;
    private String nome;
    private String datanascimento;
    private String endereco;
    private Boolean SPC;
    private Boolean SERASA;
    private String nomepai;
    private String nomemae;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Boolean getNegativadoSPC() {
        return SPC;
    }

    public void setNegativadoSPC(Boolean negativadoSPC) {
        this.SPC = negativadoSPC;
    }

    public Boolean getNegaticadoSERASA() {
        return SERASA;
    }

    public void setNegaticadoSERASA(Boolean negaticadoSERASA) {
        this.SERASA = negaticadoSERASA;
    }

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public Boolean verificacredito() {
        Boolean retorno;
     if(this.SPC == false && this.SERASA == false){
         retorno = true;
     }else {
         retorno = false;
     }
    return retorno;
    }
}
