
package operadorternário;

public class OperadorTernário {
     
    public static void main(String[] args) {
        
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1>n2)?n1+n2:n1-n2;    // 0 -> se a opção for verdadeira;  1 -> se a opção for falsa
        System.out.println(r);
        
    }
    
}
