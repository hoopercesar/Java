import java.util.HashMap;
import java.util.Map;

public class Animals {

    private Map<String, String> mapaDeAnimales;

    public Animals(){
        this.mapaDeAnimales = new HashMap<>();
    }

    public Object muestraAnimal(){
        mapaDeAnimales.put("elefante", "tiene trompa");
        mapaDeAnimales.put("perro", "le gusta ladrar");
        mapaDeAnimales.put("gato", "le gusta maullar");
        mapaDeAnimales.put("vaca", "nos da la leche");
        return mapaDeAnimales.values();
    }




}
