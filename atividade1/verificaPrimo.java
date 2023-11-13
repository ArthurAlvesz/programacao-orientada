public class verificaPrimo {

    
    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; 
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0; 
            }
        }

        return 1; 
    }

    public static void main(String[] args) {
        Integer numero = 17;
        
        int resultado = verificaNumeroPrimo(numero);
        
        if (resultado == 1) {
            System.out.println("1 - O número " + numero + " é primo.");
        } else {
            System.out.println("0 - O número " + numero + " não é primo.");
        }
    }
}
