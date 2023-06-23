import java.util.*;
public class TablaSimbolos{
    HashMap t;
    public TablaSimbolos(){
        t=new HashMap(); 
    }
    public Simbolo insertar (String nombre, Tipo var){ 
        Simbolo s = new Simbolo(nombre,var);
        if (t.containsKey(nombre)){
            System.out.println("La varible "+nombre+" ya fue establecida"); System.exit(0);}
            else{
        t.put(nombre,s);}
        return s;
    }
    public Simbolo buscar (String nombre){ 
        Simbolo s = (Simbolo)(t.get(nombre));
        if (s != null){
            return (Simbolo)(t.get(nombre));
        }else{System.out.println("No existe la varible "+nombre); System.exit(0); return s;}
    }
    public void cambiar (String nombre, Tipo var){ 
        if (t.containsKey(nombre)){
            t.remove(nombre);
            Simbolo v = new Simbolo(nombre,var);
            t.put(nombre,v);
            
        }else{
            System.out.println("No existe la varible "+nombre);
        }
    }
    
}

