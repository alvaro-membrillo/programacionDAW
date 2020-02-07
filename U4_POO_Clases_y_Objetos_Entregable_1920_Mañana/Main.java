package POO.U4_POO_Clases_y_Objetos_Entregable_1920_Mañana;

public class Main {
    public static void main(String[] args) {

        Pizza p = new Pizza();

        Ingrediente base1 = new Ingrediente("Tomate", 200);
        Ingrediente base2 = new Ingrediente();
        Ingrediente i1 = new Ingrediente("peperoni",175);
        Ingrediente i2 = new Ingrediente("Carne", 225);

        System.out.println("Numero de ingredientes: "+p.getNumIngredientes());

        p.infoPizza();

    }
}
