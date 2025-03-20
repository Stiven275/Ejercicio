import java.util.Stack;

import javax.swing.JOptionPane;

public class Metodos {
    public void LlenarPila() {
        Stack<Tienda> pila = new Stack<>();
        boolean continuar = true;
        String agregar = "";
        while (continuar) {
            Tienda t = new Tienda();
            JOptionPane.showInputDialog("\n** Selecciona la opcion **\n1. Registrar prenda\n2. Consultar prenda\n3. Modificar prenda\n4. Vender prenda\n5 Consultar Stock");
            t.setMarca(JOptionPane.showInputDialog("Ingresar Marca"));
            t.setReferencia(JOptionPane.showInputDialog("Ingresar Referencia"));
            t.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingresar precio")));
            t.setCantidad(JOptionPane.showInputDialog("Ingrese la cantidad"));
            pila.push(t);
            agregar = JOptionPane.showInputDialog("Desea agregar mas registros S/N");

            if (agregar.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
        MostrarPila(pila);
    
        
    }

public void MostrarPila(Stack<Tienda> pila) {
    for (Tienda t : pila) {
        System.out.println("Marca: " + t.getMarca());
        System.out.println("Referencia " + t.getReferencia());
        System.out.println("precio" + t.getPrecio());
        System.out.println();
    }
}


public void VenderPrenda(Stack<Tienda> pila) {
    String vender ="";
    vender = JOptionPane.showInputDialog("La prenda no existe");
}
}





            


