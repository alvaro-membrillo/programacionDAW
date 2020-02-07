package POO.U4_POO_Clases_y_Objetos_Entregable_1920_Mañana;

public class Pizza {

    private Size size;
    Ingrediente listaIngrediente[] = new Ingrediente[3];
    private int numIngredientes;

    public Pizza() {
        this.size = Size.FAMILIAR;
        Ingrediente i1 = new Ingrediente();
        Ingrediente i2 = new Ingrediente("Jamon", 232);
        addIngrediente(i1);
        addIngrediente(i2);
        numIngredientes = 2;
    }

    public Size getSize() {
        return size;
    }

    public int getNumIngredientes() {
        return numIngredientes;
    }

    public boolean comprobarIngredientes() {
        if (getNumIngredientes() <= 3) {
            return true;
        } else
            return false;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        if (comprobarIngredientes()) {
            this.listaIngrediente[getNumIngredientes()] = ingrediente;
            numIngredientes++;
        }

    }

    public Ingrediente[] getListaIngrediente() {
        return listaIngrediente;
    }


    public void infoPizza() {
        System.out.println("Tamaño: "+getSize());

        for (int i = 0; i < this.listaIngrediente.length; i++) {
            if (listaIngrediente[i]!=null) {
                System.out.print("El ingrediente "+this.listaIngrediente[i].getNombre());
                System.out.println(" tiene "+this.listaIngrediente[i].getCalorias()
                +" calorias");
            }

        }
    }

}
