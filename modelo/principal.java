/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Willian
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //INSTANCIAR 10 OBJETOS DA CLASS ALUNO USANDO O
        //CONSTRUTOR CHEIO
        Aluno aluno01 = new Aluno(001, "Willian-1", "1111-11111");
        Aluno aluno02 = new Aluno(002, "Willian-2", "2222-22222");
        Aluno aluno03 = new Aluno(003, "Willian-3", "3333-33333");
        Aluno aluno04 = new Aluno(004, "Willian-4", "4444-44444");
        Aluno aluno05 = new Aluno(005, "Willian-5", "5555-55555");
        Aluno aluno06 = new Aluno(006, "Willian-6", "6666-66666");
        Aluno aluno07 = new Aluno(007, "Willian-7", "7777-77777");
        Aluno aluno08 = new Aluno(9, "Willian-8", "8888-88888");
        Aluno aluno09 = new Aluno(9, "Willian-9", "9999-99999");
        Aluno aluno10 = new Aluno(10, "Willian-10", "1010-101010");
        
        //OBJETO 'listaAlunos' pertence a 'Classe ArrayList'
        //Instanciando uma lista vazia que só receberá objetos da
        //Classe aluno
        // Classe TIPADA ArrayList<T>
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        
        //ADICIONANDO 10 OBEJTOS DA CLASSE Aluno
        //na lista instanciado usando método add()
        listaAluno.add(aluno01);
        listaAluno.add(aluno02);
        listaAluno.add(aluno03);
        listaAluno.add(aluno04);
        listaAluno.add(aluno05);
        listaAluno.add(aluno06);
        listaAluno.add(aluno07);
        listaAluno.add(aluno08);
        listaAluno.add(aluno09);
        listaAluno.add(aluno10);
        
        //listaAluno.add("Aluno11");
        
        //NOVOS OBJETOS DEFININDO FORA DO FOR
        //TEREMOS A REFERENCIA A UM UNICO OBJETO (GLOBAL)
        //NESSE CASO TEREMOS  DE COLOCOAR O OBJETO DENTRO DO LADO FOR
        // *** NÃO POSSO DECLARAR FORA DO LAÇO***
        
        for (int i = 11; i<= 15; i++){
            Aluno objAluno = new Aluno(i, "aluno"+i, "9999-"+i+i);
            objAluno.setIdAluno(i);
            objAluno.setNome("Nome aluno");
            objAluno.setCelular("9999-9999"); 
            listaAluno.add(objAluno);
        }
        //LEITURA DOS OBJETOS ADICIONADOS DENTRO DA LISTA
        //USANDO O LAÇO FOR
        //METÓDO size() RETORNA O TAMANHO DA LISTA
        //METÓDO GET(INDEX) RETORNA O ELEMENTO DA POSICÃO INDEX;
        
        //* NÃO 'DEVO' DECLARAR FORA DO LAÇO
        
        for(int j = 0; j < listaAluno.size(); j++){
            Aluno objAluno = listaAluno.get(j);
            if (objAluno.getIdAluno() == 11){
                System.out.println("Encontrei o " + objAluno.getNome());
            }
                    System.out.println("ID: " + 
                    objAluno.getIdAluno() + " - " + 
                    "Aluno: " + objAluno.getNome() + " - " +
                    "Celular: " + objAluno.getCelular());
        }
    }
    
}
