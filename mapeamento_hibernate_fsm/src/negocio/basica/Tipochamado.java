package negocio.basica;
// Generated 24/09/2012 21:42:02 by Hibernate Tools 3.2.0.CR1


import java.util.HashSet;
import java.util.Set;

/**
 * Tipochamado generated by hbm2java
 */
public class Tipochamado  implements java.io.Serializable {


     private int id;
     private String nome;
     private Set chamados = new HashSet(0);

    public Tipochamado() {
    }

	
    public Tipochamado(int id) {
        this.id = id;
    }
    public Tipochamado(int id, String nome, Set chamados) {
       this.id = id;
       this.nome = nome;
       this.chamados = chamados;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getChamados() {
        return this.chamados;
    }
    
    public void setChamados(Set chamados) {
        this.chamados = chamados;
    }




}


