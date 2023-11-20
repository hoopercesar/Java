public class InteresCompuesto {

    private float monto;

    private Integer tiempo;

    public InteresCompuesto(){}

    public String mostrar() {
        return "InteresCompuesto{" +
                "monto=" + monto +
                ", tiempo=" + tiempo +
                '}';
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }
}
