
package atividade5.estoque;

import java.math.BigDecimal;

public class Banana extends FrutasGeral {
    
    private Float preco;

    public Banana() {
    }

    public Banana(Float preco, String nome, int codigo, int quantidade) {
        super(nome, codigo, quantidade);
        this.preco = preco;
    }

    public Float getPreco() {
        return this.preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "{" +
            "Nome='" + getNome() + "'" +
            ", Código='" + getCodigo() + "'" +
            ", Quantidade='" + getQuantidade() + "'" +
            ", Preço='" + getPreco() + "'" +
            "}";
    }
    

}

