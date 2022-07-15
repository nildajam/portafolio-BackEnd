package poo;

public class Usuario {
    
    //atributos
    private Integer id;
    private String email;
    private String contraseña;
    private Integer idPersona;
    
    
    //constructores
    public Usuario(Integer id, String email, String contraseña, Integer idPersona) {
        this.id = id;
        this.email = email;
        this.contraseña = contraseña;
        this.idPersona = idPersona;
    }
    
    
    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Integer getIdPErsona() {
        return idPersona;
    }

    public void setIdPErsona(Integer idPErsona) {
        this.idPersona = idPErsona;
    }
    
        
    //métodos
    public void crear () {
    }

    public void editar () {
    }
    
    public void eliminar () {
    }    
    
    
}
