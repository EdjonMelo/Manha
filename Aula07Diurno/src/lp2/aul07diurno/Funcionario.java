/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aul07diurno;

/**
 *
 * @author Danilo Abreu
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(String nome){
        this.nome=nome;
    }

    public double getBonificacao(){
        return this.getSalario()*0.1;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
