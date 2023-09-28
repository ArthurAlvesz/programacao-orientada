package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Engenheiro {
    private String nome;
    private Integer cpf;
    private Integer telefone;
    private String crea;
    private String projeto;


    public Engenheiro(String nome, Integer cpf, Integer telefone, String crea, String projeto) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.crea = crea;
        this.projeto = projeto;
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public Integer getCpf(){
        return this.cpf;
    }

    public void setCpf(Integer c){
        this.cpf = c;
    }

    public Integer getTelefone(){
        return this.telefone;
    }

    public void setTelefone(Integer t){
        this.telefone = t;
    }  
    public String getCrea(){
            return this.crea;
    }
    
    public void setCrea(String cr){
            this.crea = cr;
    }

    public String getProjeto(){
        return this.projeto;
    }

    public void setProjeto(String p){
        this.projeto = p;
    }   

    public BigDecimal getSalario(){
        return new BigDecimal(10000.00);
    }

    public BigDecimal getBonificacao(){
        return getSalario().multiply(new BigDecimal(0.15));
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", crea='" + getCrea() + "'" +
            ", projeto='" + getProjeto() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.UP) + "'" +
            "}";
    }

}
