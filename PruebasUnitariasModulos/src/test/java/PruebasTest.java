import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebasTest{
    
  Articulos Inventario1 = new Articulos();
        
    public PruebasTest() {
    }
        @Test
        public void testArticulos1(){
            assertEquals("Ropa",Inventario1.Inventario(1));      
        }
        @Test
        public void testArticulos2(){
            assertEquals("Zapatos",Inventario1.Inventario(2));      
        }
        @Test
        public void testArticulos3(){
            assertEquals("Accesorios",Inventario1.Inventario(3));      
        }
        @Test
        public void testArticulos4(){
            assertEquals("Recuerdos",Inventario1.Inventario(4));      
        }
        @Test
        public void testArticulos5(){
            assertEquals("Sombreros",Inventario1.Inventario(5));      
        }
        @Test
        public void testArticulos6(){
            assertEquals("Accesorios de hogar",Inventario1.Inventario(6));      
        }
        @Test
        public void testArticulos7(){
            assertEquals("No existe este apartado",Inventario1.Inventario(7));      
        }
}