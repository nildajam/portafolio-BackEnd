package poo;

import java.util.Date;

public class ExperienciaLaboral {
    
    //atributos
    private Integer id;
    private String cargo;
    private String empresa;
    private String jornada;
    private Boolean esTrabajoActual;
    private Date fechaInicio;
    private Date fechaFin;    
    private String ubicacion;

    
    //constructores
    public ExperienciaLaboral(Integer id, String cargo, String empresa, String jornada, Boolean esTrabajoActual, Date fechaInicio, Date fechaFin, String ubicacion) {
        this.id = id;
        this.cargo = cargo;
        this.empresa = empresa;
        this.jornada = jornada;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ubicacion = ubicacion;
    }

    
    //getters y setters    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Boolean getEsTrabajoActual() {
        return esTrabajoActual;
    }

    public void setEsTrabajoActual(Boolean esTrabajoActual) {
        this.esTrabajoActual = esTrabajoActual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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
