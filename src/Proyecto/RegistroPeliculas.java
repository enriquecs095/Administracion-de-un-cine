package Proyecto;

public class RegistroPeliculas{

    private String Codigo;
    private String Nombre;
    private String Horario1;
    private String Horario2;   
    private String Horario3;
    private String Salon;
    private String Edad;
    private String Sinopsis;
    private String Duracion;
    private String Formato;
    private String Genero;
    private String Idioma;
    private String PrecioAdultos;
    private String PrecioNiños;
    private String PrecioAncianos;
    private String Fecha;
    private String URL;
    
    public RegistroPeliculas(){
    }

    public RegistroPeliculas(String codigo, String nombre, String horario1, String horario2, String horario3, String salon, String edad, String sinopsis, String duracion, String formato, String genero, String idioma, String precioAdultos, String precioNiños, String precioAncianos, String fecha, String url) {
        this.Codigo=codigo;
        this.Nombre=nombre;
        this.Horario1=horario1;
        this.Horario2=horario2;
        this.Horario3=horario3;
        this.Salon=salon;
        this.Edad=edad;
        this.Sinopsis=sinopsis;
        this.Duracion=duracion;
        this.Formato=formato;
        this.Genero=genero;
        this.Idioma=idioma;
        this.PrecioAdultos=precioAdultos;
        this.PrecioNiños=precioNiños;
        this.PrecioAncianos=precioAncianos;
        this.Fecha=fecha;
        this.URL=url;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getHorario1() {
        return Horario1;
    }

    public void setHorario1(String Horario1) {
        this.Horario1 = Horario1;
    }

    public String getHorario2() {
        return Horario2;
    }

    public void setHorario2(String Horario2) {
        this.Horario2 = Horario2;
    }

    public String getHorario3() {
        return Horario3;
    }

    public void setHorario3(String Horario3) {
        this.Horario3 = Horario3;
    }

    public String getSalon() {
        return Salon;
    }

    public void setSalon(String Salon) {
        this.Salon = Salon;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getPrecioAdultos() {
        return PrecioAdultos;
    }

    public void setPrecioAdultos(String PrecioAdultos) {
        this.PrecioAdultos = PrecioAdultos;
    }

    public String getPrecioNiños() {
        return PrecioNiños;
    }

    public void setPrecioNiños(String PrecioNiños) {
        this.PrecioNiños = PrecioNiños;
    }

    public String getPrecioAncianos() {
        return PrecioAncianos;
    }

    public void setPrecioAncianos(String PrecioAncianos) {
        this.PrecioAncianos = PrecioAncianos;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }



}
