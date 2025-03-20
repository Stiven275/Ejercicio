public class Tienda {
    private String marca;
    private String referencia;
    private Double precio;
    private String cantidad;

    
    public Tienda() {
    }
    public Tienda(String marca, String referencia, Double precio, String cantidad) {
        this.marca = marca;
        this.referencia = referencia;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

   
}
