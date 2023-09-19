package aula03.exercicio01;

public class VerificaCpf {

    public static boolean validarCpf(String cpf) {
        int[] digitos = new int[11];

        if (cpf == null || cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }
        int somaDigitos1 = 0, somaDigitos2 = 0;

        for (int i = 0; i < 11; i++) {
            digitos[i] = cpf.charAt(i) - 48;

            if (i < 9 ){
                somaDigitos1 += digitos[i] * (10 - i);
                somaDigitos2 += digitos[i] * (11 - i);
            }
        }

        int restoDivisao1 = somaDigitos1 % 11;
        int digitoVerificador1 = (restoDivisao1 < 2) ? 0 : (11 - restoDivisao1);

        somaDigitos2 += digitoVerificador1 * 2;
        int restoDivisao2 = somaDigitos2 % 11;
        int digitoVerificador2 = (restoDivisao2 < 2) ? 0 : (11 - restoDivisao2);

        if (digitos[9] == digitoVerificador1 && digitos[10] == digitoVerificador2) return true;


        return false;
    }
}
