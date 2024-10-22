/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model;

/**
 *
 */
public class PessoaJuridica extends Pessoa {
    //Atributos
    private String CNPJ;
    
    //Métodos
    public PessoaJuridica(String Id, String Nome, String logradouro,String cidade, String estado, String telefone, String email) {
        super(Id, Nome, logradouro, cidade, estado, telefone, email);        
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

}