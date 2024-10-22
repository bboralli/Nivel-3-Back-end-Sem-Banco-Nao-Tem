/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model;

/**
 *
 */
public class PessoaFisica extends Pessoa {
    //Atributos
    private String CPF;
    
    //Métodos
    public PessoaFisica(String Id, String Nome, String logradouro,String cidade, String estado, String telefone, String email) {
        super(Id, Nome, logradouro, cidade, estado, telefone, email);        
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}

