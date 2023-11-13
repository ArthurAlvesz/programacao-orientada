package encapsulamento;

public class contacorrente {

        private Integer numero;
        private Double saldo;

        public contacorrente (Integer numero, int i){
            this.numero = numero;
            this.saldo = i;
        }

        public contacorrente(int numero2, int i) {
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
            ", saldo='" + this.saldo() + "'" +
            "}";
    }

}