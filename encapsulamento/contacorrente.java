package encapsulamento;

public class contacorrente {

        private Integer numero;
        private Double saldo;

        public contacorrente (Integer numero, Double saldo){
            this.numero = numero;
            this.saldo = saldo;
        }

        public Integer getNumero(){
            return this.numero;
}        

        public void setNumero
        public void transferir(contacorrente contaDestino, Double valor)

public void depositar(Double valor){
    }


    @Override
    public String toString() {
        return "{" +
            " numero='" + this.numero() + "'" +
            ", saldo='" + this.Saldo() + "'" +
            "}";
    }

}