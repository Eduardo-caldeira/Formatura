/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shiploxformaturas;

import java.util.Vector;

/**
 *
 * @author nicol
 */
public class Evento {
    private String tema;
    private String data;
    private String instituicao;
    private Vector<Aluno>listaAluno;
    private int id;
    
    public Evento(){
        listaAluno = new Vector<Aluno>();
    }

    public Evento(String tema, String data, String instituicao, int id,Vector<Aluno>listaAluno){
        this.tema = tema;
        this.data = data;
        this.instituicao = instituicao;
        this.id = id;
        this.listaAluno = listaAluno;
    }

   
    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the instituicao
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * @param instituicao the instituicao to set
     */
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the listaAluno
     */
    public Vector<Aluno> getListaAluno() {
        return listaAluno;
    }

    /**
     * @param listaAluno the listaAluno to set
     */
    public void setListaAluno(Vector<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }
   
}
