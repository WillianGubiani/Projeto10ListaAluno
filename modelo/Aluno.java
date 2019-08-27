/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public class Aluno {
    private int idAluno;
    private String nome;
    private String celular;

    //CONSTRUTORES

    public Aluno(int idAluno, String nome, String celular){
        this.idAluno = idAluno;
        this.nome = nome;
        this.celular = celular;
    }

    Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//SETTERS E GETTERS

    public int getIdAluno(){
        return idAluno;
    }
    
    public void setIdAluno(int idAluno){
        this.idAluno = idAluno;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCelular(){
        return celular;
    }
    
    public void setCelular(String celular){
        this.celular = celular;
    }
}