package poo;

import java.time.Year;

public class Educacion {
    
    //atributos
    private Integer id;
    private String institucionEducativa;
    private String titulo;  
    private Year fechaInicio;
    private Year fechaFin;

    
    //constructores    
    public Educacion(Integer id, String institucionEducativa, String titulo, Year fechaInicio, Year fechaFin) {
        this.id = id;
        this.institucionEducativa = institucionEducativa;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    
    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstitucionEducativa() {
        return institucionEducativa;
    }

    public void setInstitucionEducativa(String institucionEducativa) {
        this.institucionEducativa = institucionEducativa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Year getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Year fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Year getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Year fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    //métodos
    public void mostrar () {
    }

    public void editar () {
    }
    
    public void agregar () {
    }
    
    public void eliminar () {
    }
    
     
}