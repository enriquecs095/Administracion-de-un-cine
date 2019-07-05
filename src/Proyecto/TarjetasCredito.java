package Proyecto;

public class TarjetasCredito {

String NombreCompleto;
String TarjetaCredito;
String VencimientoTarjeta;
String CodigoSeguridad;
String TipoTarjeta;
int DineroDisponible;
    
public TarjetasCredito(String nombre, String tarjeta, String vencimiento, String codigo, String tipo, int dineroDisponible){
this.NombreCompleto=nombre;
this.TarjetaCredito=tarjeta;
this.VencimientoTarjeta=vencimiento;
this.CodigoSeguridad=codigo;
this.TipoTarjeta=tipo;
this.DineroDisponible=dineroDisponible;
}

    public int getDineroDisponible() {
        return DineroDisponible;
    }

    public void setDineroDisponible(int DineroDisponible) {
        this.DineroDisponible = DineroDisponible;
    }


    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getTarjetaCredito() {
        return TarjetaCredito;
    }

    public void setTarjetaCredito(String TarjetaCredito) {
        this.TarjetaCredito = TarjetaCredito;
    }

    public String getVencimientoTarjeta() {
        return VencimientoTarjeta;
    }

    public void setVencimientoTarjeta(String VencimientoTarjeta) {
        this.VencimientoTarjeta = VencimientoTarjeta;
    }

    public String getCodigoSeguridad() {
        return CodigoSeguridad;
    }

    public void setCodigoSeguridad(String CodigoSeguridad) {
        this.CodigoSeguridad = CodigoSeguridad;
    }

    public String getTipoTarjeta() {
        return TipoTarjeta;
    }

    public void setTipoTarjeta(String TipoTarjeta) {
        this.TipoTarjeta = TipoTarjeta;
    }
}
