package operaciones_movil.com.examencelulares;


public class Celulares {
    private String marca;
    private String capacidad;
    private String color;
    private String so;
    private String precio;

    public Celulares(String marca, String capacidad, String color, String so, String precio) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.color = color;
        this.so = so;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.guardar(this);
    }
    }


