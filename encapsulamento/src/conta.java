
import javax.swing.JOptionPane;

/*
 * Classe para demonstrar o principio de encapsulamento
 * @author Giovanni Serafim
 * criado em: 17/10/2024
 */


public class conta {
    private String cliente;
    private float saldo;
    private int senha;
    private boolean bloqueado;
    int tentativas;
    
    
    //construtor
    public conta(String cliente, float saldo, int senha) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.bloqueado = false; //mesmo que seja um valor fixo, o certo é declarar no construtor.
    }
    
    public void exibirDados(){
        System.out.println("nome do cliente: " + cliente);
        System.out.println("saldo do cliente: " + saldo);
        System.out.println("status: " + (isBloqueado()?"bloqueado":"ativada"));
        linha();
    }
    
    //método publico de valisação para chamar o setSaldo e alterar o saldo
    public void realizarSaque (){
        int pwd = 0; //variavel para salvar a senha digitada
        pwd = Integer.parseInt(JOptionPane.showInputDialog("senha: "));
        
        //verifica se a senha está certa
        if (!verificarSenha(pwd)){ //o "!" é negação, então ele vai rodar se o verificar senha retornar False
            if(!isBloqueado())
               realizarSaque();
        }
        
        else{//se a senha estiver certa...
            float vlrSaque = 0;
            vlrSaque = Float.parseFloat(JOptionPane.showInputDialog("valor a sacar: "));
            if(getSaldo()<vlrSaque){//verifica se ele tem saldo pra esse saque
                JOptionPane.showMessageDialog(null, "saldo insulficiente");
                linha();}
            else{
            setSaldo(getSaldo()-vlrSaque);
            System.out.println("saldo alterado");
            linha();}
        }
    }
    
    public void realizarDeposito(){
       float depo;
       JOptionPane.showInputDialog("para quem é esse depósito?");
       depo = Float.parseFloat(JOptionPane.showInputDialog("qual valor?"));
       setSaldo(getSaldo()+depo);
    }
    
    public void verificarSaldo(){
        int pwd = Integer.parseInt(JOptionPane.showInputDialog("informe sua senha: "));
        if(!verificarSenha(pwd)){
            if (!isBloqueado())
                verificarSaldo();
        }
        else{
            JOptionPane.showMessageDialog(null, "seu saldo atual é de: " + getSaldo());
        } 
    }//fim do método
    
    public void trocarSenha(){
        int pwd = Integer.parseInt(JOptionPane.showInputDialog("informe sua senha: "));
        if(!verificarSenha(pwd)){
            if (!isBloqueado())
                trocarSenha();
        }
        else{
            pwd = Integer.parseInt(JOptionPane.showInputDialog("informe sua nova senha: "));
            setSenha(pwd);
        } 

    }
    
    //método para verificar tentativas de senha
    private boolean verificarSenha(int pwd){
        
        
    if(pwd == getSenha())
        return true;
    else
        if(tentativas>=2){
            tentativas++;
            JOptionPane.showMessageDialog(null, "bloqueado");
            setBloqueado(true);}
            
        else
            tentativas++;
            JOptionPane.showMessageDialog(null, "senha incorreta. você tem " + (3 - tentativas) + " tentativas restantes");
    return(false);
            
    }
     // "return pwd == getSenha();" seria uma forma simples de checar se um valor é true ou false.
     // nesse caso não foi usado pois uma verificação de tentativas foi acrescentada.
    
    void linha(){
        System.out.println("_________________________________________________");
    }

    
    
    
    
    
    
    
    
    
    
    //método assesor (get e set):
    // se faz um get e um set pra cada atributo, pois deve ser mudado um e resgatado um dado por vez.
    //botar os get e set no fim do código, pois eles não serão alterados.
    
    //get e set cliente:
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    //get e set saldo:
    private float getSaldo(){
        return this.saldo;
    }
    
    private void setSaldo(float saldo){       
        this.saldo = saldo;   
    }
        
    //get e set senha:
    private int getSenha(){
        return this.senha;
    }
    
    private void setSenha(int senha){       
        this.senha = senha;   
    }
 
    //get e set bloqueado:
    public boolean isBloqueado(){ //get de boolean se faz com o 'is'
        return this.bloqueado;
    }
    
    public void setBloqueado(boolean bloqueado){
        this.bloqueado = bloqueado;
    }
      
}//fim da classe
