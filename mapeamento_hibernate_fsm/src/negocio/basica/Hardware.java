package negocio.basica;
// Generated 24/09/2012 21:42:02 by Hibernate Tools 3.2.0.CR1


import java.util.Date;

/**
 * Hardware generated by hbm2java
 */
public class Hardware  implements java.io.Serializable {


     private int id;
     private Computador computador;
     private String marca;
     private String modelo;
     private String garantia;
     private Date dtcompra;

    public Hardware() {
    }

	
    public Hardware(int id, Computador computador) {
        this.id = id;
        this.computador = computador;
    }
    public Hardware(int id, Computador computador, String marca, String modelo, String garantia, Date dtcompra) {
       this.id = id;
       this.computador = computador;
       this.marca = marca;
       this.modelo = modelo;
       this.garantia = garantia;
       this.dtcompra = dtcompra;
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




}

