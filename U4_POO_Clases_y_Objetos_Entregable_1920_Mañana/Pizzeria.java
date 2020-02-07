package POO.U4_POO_Clases_y_Objetos_Entregable_1920_Mañana;

import U4_T1.ejerciciospropuestosdellibropag237.segundoejercicio.Calendario;

import java.util.Calendar;

public class Pizzeria {

    Calendar c = Calendar.getInstance();

    String dia, mes, annio;



    private int numPedidos = 0;
    Pizza[] pedidos = new Pizza[5];
    /*Queremos saber la pizza y el momento del pedido*/
    private int capacidadPedidos;

    Pizzeria () {
        this.capacidadPedidos = 5;
    }

    Pizzeria (int capacidadPedidos) {
        this.capacidadPedidos = capacidadPedidos;
    }

    public void aumentarCapacidadPedidos() {
        Pizza[] pedidosNuevos = new Pizza[capacidadPedidos++];
        for (int i = 0; i < this.capacidadPedidos; i++) {
            pedidos[i] = pedidosNuevos[i];
        }
    }

    /*public String mostrarPedido() {

    }*/

    public boolean addPedido(Pizza pizza) {
        if (getNumPedidos() <= pedidos.length) {
            pedidos[getNumPedidos()] = pizza;

            dia = Integer.toString(c.get(Calendar.DATE));
            mes = Integer.toString(c.get(Calendar.MONTH));
            annio = Integer.toString(c.get(Calendar.YEAR));

            System.out.println(dia + "/" + mes +"/" + annio);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para añadir el pedido estrella
     */
    public void pedidoEstrella() {
        Pizza pizza = new Pizza();
        addPedido(pizza);
    }

    public void mostrarPedidos() {
        for (int i = 0; i < this.capacidadPedidos; i++) {
            System.out.println(this.pedidos);
        }
    }

    public int getNumPedidos() {
        return numPedidos;
    }
}
