
package bancogatuno;
public class BancoGatuno {
    private revisarCuentaGatuna cuentaGatuna1;
    private revisarCuentaGatuna cuentaGatuna2;
    public BancoGstuno(){
    cuentaGatuna1 = new revisarCuentaGatuna("Zeus",100);  
    cuentaGatuna2 = new revisarCuentaGatuna("Hades",200); 
    }
    
    public static void main(String[] args) {
    BancoGatuno bancoDeDiosesGatunos = new BancoGatuno();
    System.out.println(bancoDeDiosesGatunos.cuentaGatuna1.nombreGatuno);
    System.out.println(bancoDeDiosesGatunos.cuentaGatuna1.ahorrosGatunos);
    }
    
}
