import java.util.Scanner;
public class Main {
    public static String LongesWord(String sen){
        String[] palavras = sen.split(" "); // Vetor que armazena cada palavra separadamente
        int tamanhoPalavraAnterior=0;
        String maiorPalavra=palavras[0];
        int[] deducao = new int[palavras.length]; // vetor que vai armazenar a quantidae de caracteres especiais em cada palavra individualmente.


        // Loops agrupados para verificar se as palvras do vetor possuem caracteres especiais.(que não sejma letras ou números)
        for (int i=0; i<palavras.length; i++){
            for(char c : palavras[i].toCharArray()){
                if(!Character.isLetterOrDigit(c) ){
                    deducao[i] = deducao[i] + 1;
                }
            }
        }

        // Aqui eu faço a comparação dos tamanhos das palavras, para descobrir qual a maior.
        for (int i=0; i< palavras.length; i++){

            if(palavras[i].length() - deducao[i] >tamanhoPalavraAnterior){
                maiorPalavra= palavras[i];
                tamanhoPalavraAnterior= palavras[i].length() - deducao[i];
            }
        }
        

        // Essa parte serve para garantir que o resultado final seja somente a palavra. Por exemplo se a maior palavra for "Voce@!#" ele retorna "Voce"
        // Jeito 2
        StringBuilder soLetras = new StringBuilder();

        for (char c : maiorPalavra.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                soLetras.append(c);
            }
        }

        maiorPalavra = soLetras.toString();

        return maiorPalavra;
    }
    public static String CodelandUsernameValidation(String str) {
        String aprovado=null;
        int tamanho = str.length();
        char primeiroCar= str.charAt(0);
        char ultimoCar = str.charAt(str.length() -1);

        if((((tamanho>=4) && (tamanho<=25)) &&(Character.isLetter(primeiroCar))) && (ultimoCar !='_')){
            for(char caractere: str.toCharArray()){
                if (!Character.isLetterOrDigit(caractere) && caractere != '_') {
                    aprovado= "false";
                }
                else{
                    aprovado= "true";
                }
            }
        }
        else {
            aprovado="false";
        }
        return aprovado;
    }

    public static int FirstFactorial(int num){

        int fato=num;
        for(int i = num-1; i >0; i--){
            fato = fato * i;
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }
}
