
public class Interfaz {
	
	public double controlador = 80;
    private static final double saltos = 0.5;
    private static final double min = 80;
    private static final double max = 108;
   
    public void up (){
        if(controlador+saltos>max)
            controlador = min;
        else controlador += saltos;
       
    }
    public void down (){
         if (controlador-saltos<max)
            controlador = max;
         else controlador -= saltos;
    }
    public double display (){
     return controlador;  
    }
}
