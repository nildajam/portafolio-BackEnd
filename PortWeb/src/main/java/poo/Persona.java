package poo;

import java.util.List;
import java.util.Date;

public class Persona {
    
    //atributos
    private Integer id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String email;
    private String telefono;
    //private Blob fotoPerfil;
    private Date fechaNac;
    private String acercaDe;
    private Usuario usuario;
    private List<Domicilio> Domicilio;
    private List<ExperienciaLaboral> ExperienciaLaboral;
    private List<Educacion> Educacion;
    private List<Proyecto> Proyecto;
    private List<Tecnologia> Tecnologia;


    //constructores
    public Persona(Integer id, String nombre, String apellido, String profesion, String email, String telefono, Date fechaNac, String acercaDe, Usuario usuario, List<Domicilio> Domicilio, List<ExperienciaLaboral> ExperienciaLaboral, List<Educacion> Educacion, List<Proyecto> Proyecto, List<Tecnologia> Tecnologia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.email = email;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.acercaDe = acercaDe;
        this.usuario = usuario;
        this.Domicilio = Domicilio;
        this.ExperienciaLaboral = ExperienciaLaboral;
        this.Educacion = Educacion;
        this.Proyecto = Proyecto;
        this.Tecnologia = Tecnologia;
    }    

    
    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Domicilio> getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(List<Domicilio> Domicilio) {
        this.Domicilio = Domicilio;
    }

    public List<ExperienciaLaboral> getExperienciaLaboral() {
        return ExperienciaLaboral;
    }

    public void setExperienciaLaboral(List<ExperienciaLaboral> ExperienciaLaboral) {
        this.ExperienciaLaboral = ExperienciaLaboral;
    }

    public List<Educacion> getEducacion() {
        return Educacion;
    }

    public void setEducacion(List<Educacion> Educacion) {
        this.Educacion = Educacion;
    }

    public List<Proyecto> getProyecto() {
        return Proyecto;
    }

    public void setProyecto(List<Proyecto> Proyecto) {
        this.Proyecto = Proyecto;
    }

    public List<Tecnologia> getTecnologia() {
        return Tecnologia;
    }

    public void setTecnologia(List<Tecnologia> Tecnologia) {
        this.Tecnologia = Tecnologia;
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