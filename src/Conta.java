public class Conta {
    private double saldo; //atributo
    private int agencia;
    private static int total;//static e da classe/ conta nao e mais de cada objeto
    private int numero;
    private Cliente titular; //= new Cliente()com o new toda conta ja tem um cliente não se preocuparia com o null porque criou uma conta criou um cliente
    
    //gett pega acessa ,sett modifica altera void altera e nao devolve nada
    
    public Conta(int agencia, int numero){//construtor/ new e 0
        Conta.total++;
       // System.out.println("o tota de conta é" + Conta.total);
        this.agencia = agencia;
        this.numero = numero;

    }
    public void deposita(double valor){// metodo void e falar que nao devolve mensagem so recebe e pronto
        this.saldo += valor;
    }
    
    public boolean saca(double valor /*parametros argumentos*/){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
            
        }else{
            return false;
        }
    }
    
    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } 
        return false;
        
        
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero(){
       
        return this.numero;
    }
    
    public void setNumero(int numero){
        if (numero <= 0 ) {
            System.out.println("nao pode valor <= 0 ");
            return;
            
        }
        this.numero = numero;
    }
    public int getAgencia() {
        return agencia;
    }
    
    public void setAgencia(int agencia) {
        if (agencia <= 0 ) {
            System.out.println("nao pode valor manor igual a 0");
            return;
            
        }
        this.agencia = agencia;
    }
    public Cliente getTitular() {
        return titular;
    }
    
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}// metodo siginifica comportamento
