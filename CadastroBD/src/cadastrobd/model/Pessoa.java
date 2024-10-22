/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model;

/**
 *
 */
public class Pessoa {
    
    //Atributos
    private String Id, Nome, logradouro, cidade, estado, telefone, email;
    
    public Pessoa(){
        
    }
    //construtor
    public Pessoa(String Id, String Nome, String logradouro,String cidade, String estado, String telefone, String email){
        this.Id = Id;
        this.Nome = Nome;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }
    
    void listar(){
        System.out.println("\nId: " + this.Id);
        System.out.println("\nNome: " + this.Nome); 
        System.out.println("\nNome: " + this.logradouro); 
        System.out.println("\nNome: " + this.cidade); 
        System.out.println("\nNome: " + this.estado); 
        System.out.println("\nNome: " + this.telefone); 
        System.out.println("\nNome: " + this.email); 
    }

}
