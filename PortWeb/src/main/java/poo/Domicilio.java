package poo;

public class Domicilio {
    
    //atributos
    private Integer id;
    private String calle;
    private String altura;
    private String pisoDepto;
    private String entreCalles;
    private String codigoPostal;
    private String localidad;
    private String provincia;
    private String pais;
    private String coordMAps;
     
    
    //constructores
    public Domicilio(Integer id, String calle, String altura, String pisoDepto, String entreCalles, String codigoPostal, String localidad, String provincia, String pais, String coordMAps) {
        this.id = id;
        this.calle = calle;
        this.altura = altura;
        this.pisoDepto = pisoDepto;
        this.entreCalles = entreCalles;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
        this.coordMAps = coordMAps;
    }
        
    
    //getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPisoDepto() {
        return pisoDepto;
    }

    public void setPisoDepto(String pisoDepto) {
        this.pisoDepto = pisoDepto;
    }

    public String getEntreCalles() {
        return entreCalles;
    }

    public void setEntreCalles(String entreCalles) {
        this.entreCalles = entreCalles;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCoordMAps() {
        return coordMAps;
    }

    public void setCoordMAps(String coordMAps) {
        this.coordMAps = coordMAps;
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
