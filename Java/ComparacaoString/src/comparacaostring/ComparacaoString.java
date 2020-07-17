
package comparacaostring;

public class ComparacaoString {

    
    public static void main(String[] args) {
        
        String n1 = "Gustavo";
        String n2 = "Gustavo";
        String n3 = new String("Gustavo");
        String res;
        res = (n1.equals(n3))?"Igual":"Diferente";   // equals: verifica se o conteudo do objeto é igual ao outro
        System.out.println(res);
        

    }
    
}
