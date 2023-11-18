public class Cuenta {

    private String titular;
    private float cantidad;


    public Cuenta(){

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad){
        this.cantidad = cantidad;
    }


    public String mostrar() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }


}
