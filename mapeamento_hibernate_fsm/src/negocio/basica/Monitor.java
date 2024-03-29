package negocio.basica;
// Generated 24/09/2012 21:42:02 by Hibernate Tools 3.2.0.CR1


import java.util.Date;

/**
 * Monitor generated by hbm2java
 */
public class Monitor  implements java.io.Serializable {


     private int id;
     private Computador computador;
     private String marca;
     private String modelo;
     private String garantia;
     private Date dtcompra;
     private String tipo;
     private Integer tamanho;

    public Monitor() {
    }

	
    public Monitor(int id, Computador computador) {
        this.id = id;
        this.computador = computador;
    }
    public Monitor(int id, Computador computador, String marca, String modelo, String garantia, Date dtcompra, String tipo, Integer tamanho) {
       this.id = id;
       this.computador = computador;
       this.marca = marca;
       this.modelo = modelo;
       this.garantia = garantia;
       this.dtcompra = dtcompra;
       this.tipo = tipo;
       this.tamanho = tamanho;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Computador getComputador() {
        return this.computador;
    }
    
    public void setComputador(Computador computador) {
        this.computador = computador;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getGarantia() {
        return this.garantia;
    }
    
    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    public Date getDtcompra() {
        return this.dtcompra;
    }
    
    public void setDtcompra(Date dtcompra) {
        this.dtcompra = dtcompra;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Integer getTamanho() {
        return this.tamanho;
    }
    
    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }




}


