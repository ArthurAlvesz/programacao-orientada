package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Diretor {
    private String nome;
    private Integer cpf;
    private Integer telefone;
    private Integer qtdGerencias;


    public Diretor() {
    }
     

    public Diretor(String nome, Integer cpf, Integer telefone, Integer qtdGerencias) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.qtdGerencias = qtdGerencias;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getQtdGerencias() {
        return this.qtdGerencias;
    }

    public void setQtdGerencias(Integer qtdGerencias) {
        this.qtdGerencias = qtdGerencias;
    }

    public BigDecimal getSalario(){
        return new BigDecimal(30000.00);
    }

    public BigDecimal getBonificacao(){
        return getSalario().multiply(new BigDecimal(0.40));
    }
    

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", qtdGerencias='" + getQtdGerencias() + "'" +
            ", salario='" + getSalario() + "'" +
            ", qtdBonificacao='" + getBonificacao().setScale(2, RoundingMode.UP) + "'" +
            "}";
    }
    

}
