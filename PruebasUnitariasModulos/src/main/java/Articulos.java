public class Articulos {

    public static String Inventario(int articulo){
      String cadena = "";
       
        switch (articulo){
            
            case 1 : cadena = "Ropa";
                break;
            case 2 : cadena = "Zapatos";
                break;
            case 3 : cadena = "Accesorios";
                break;
            case 4 : cadena = "Recuerdos";
                break;
            case 5 : cadena = "Sombreros";
                break;
            case 6 : cadena = "Accesorios de hogar";
                break;
            default: cadena = "No existe este apartado";
        }
        return cadena;
    }
}
