package poo;

public class Tecnologia {    
    //atributos
    private Integer id;
    private String nombre;
    private Integer porConocimiento;

    
    //constructores  
    public Tecnologia(Integer id, String nombre, Integer porConocimiento) {
        this.id = id;
        this.nombre = nombre;
        this.porConocimiento = porConocimiento;
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

    public Integer getPorConocimiento() {
        return porConocimiento;
    }

    public void setPorConocimiento(Integer porConocimiento) {
        this.porConocimiento = porConocimiento;
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