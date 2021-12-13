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

    public boolean showEnVenta(){
        return enVenta;
    }
    
    public void subirPrecio(float nuevoPrecio){
        precio = precio + nuevoPrecio;
    }

    public void ponerEnVenta(){
        if(enVenta){
            enVenta = false;
        }else{
            enVenta= true;
        }
    }
    
    public void imprimeDetalles(){
        System.out.println("Marca: " + marca + " | Precio: " + precio + " | Está en venta: " + enVenta);
    }
}