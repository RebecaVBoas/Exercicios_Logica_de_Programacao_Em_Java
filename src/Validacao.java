public class Validacao {

    public void Validacao(String str){
         boolean aprovado=false;
         int tamanho = str.length();
         char primeiroCar= str.charAt(0);
         char ultimoCar = str.charAt(str.length() -1);

         if((((tamanho>=4) && (tamanho<=25)) &&(Character.isLetter(primeiroCar))) && (ultimoCar !='_')){
           for(char caractere: str.toCharArray()){
              if (!Character.isLetterOrDigit(caractere) && caractere != '_') {
                  aprovado= false;
               }
              else{
                  aprovado= true;
              }
           }

        }
        System.out.println(tamanho);
        System.out.println(primeiroCar);
        System.out.println(aprovado);
        System.out.println(ultimoCar);
    }

}
