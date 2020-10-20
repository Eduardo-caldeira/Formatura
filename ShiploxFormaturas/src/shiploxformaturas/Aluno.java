/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shiploxformaturas;

/**
 *
 * @author nicol
 */
public class Aluno extends Pessoa{
    private String curso;
    private int mesa;
   
   
    public Aluno() {
}
     public Aluno(String nome, String telefone, String cpf, String curso, int mesa) {
         super(nome,telefone,cpf);
         this.curso = curso;
         this.mesa = mesa;
    
}

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the mesa
     */
    public int getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    /**
     * @return the orador
     */
   
   
    
}
