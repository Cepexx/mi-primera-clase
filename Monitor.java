public class Monitor{
    
    private String marca;
    private float precio;
    private boolean enVenta;
        
    public Monitor(String marcaMonitor, float precioMonitor){
        marca = marcaMonitor;
        precio = precioMonitor;
        enVenta = false;
    }
    
    public String showMarca(){
        return marca;
    }
    
    public float showPrecio(){
        return precio;
    }
    
    public void changeHealth(float nuevoPrecio){
        precio = nuevoPrecio;
    }
    
    public boolean estaEnVenta(){
        return enVenta;
    }

    public void ponerEnVenta(boolean estaEnVenta){
        enVenta = estaEnVenta;
    }
}