
package com.mycompany.avtdbanco;


public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;
    
    public ContaBanco(String d, String t) {
        saldo = 0;
        status = false;
        abrirConta(d, t);
    }
    
    public void abrirConta(String d, String t){
        this.dono = d;
        this.tipo = t;
        this.numConta = 1;
        this.status = true;
        
        if(t == "CC"){
            this.saldo = 50;
            return;
        } 
        
        this.saldo = 150;
           
        
                        
        
        
    
    }
    public void fecharConta(){
        this.status = false;
        System.out.println("Conta encerrada com sucesso, obrigado por usar o nosso Basnco");
        
    }
    
    public void depositar(int v){
        this.saldo += v;
        System.out.println("Saldo acrescentado no valor de " + v);
        System.out.println("Seu saldo agora é de: " + this.saldo);
        return;
        
    }
    
    public void sacar(int v){
        if(this.saldo > v){
            this.saldo -= v;
            System.out.println("Saque no valor de " + v + " efetuado com sucesso");
            return;
        }
        System.out.println("Você não tem dinheiro suficiente");
        
    }
    public void pagarMensal(){
        if(this.tipo == "CC" && this.saldo >= 12){
            this.saldo -= 12;
            System.out.println("Sua fatura de conta corrente foi paga com sucesso, o seu saldo agora é de: " + this.saldo);
        } else {
            if(this.tipo == "CP" && this.saldo >= 20 ){
                this.saldo -= 20;
                System.out.println("Sua fatura de conta poupança foi paga com sucesso, o seu saldo agora é de: " + this.saldo);
            }
        }
        
    }
    
    public void setNumConta(int n){
        numConta = n;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipoConta(String c){
        tipo = c;
    }
    
    public String getTipoConta(){
        return this.tipo;
    }
    
    public void  setDono(String d){
        dono = d;
    }
    
    public String getDono(){
        return this.dono;
        
    }
    
    public void setSaldo(int s){
        saldo = s;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean b){
        status = b;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void status(){
        System.out.println("O número dessa conta é: " + this.numConta);
        System.out.println("O tipo dessa conta é: " + this.tipo);
        System.out.println("O dono dessa conta é: " + this.dono);
        System.out.println("O saldo dessa conta é: " + this.saldo);
        System.out.println("O status dessa conta é: " + this.status);
    }    
    
}
