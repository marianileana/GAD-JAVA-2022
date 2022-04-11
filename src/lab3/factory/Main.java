package lab3.factory;

public class Main {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaSorte();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("Cheese");
        Pizza nyPepperoni = nyPizzaStore.orderPizza("Pepperoni");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza ChicagoPizza = chicagoPizzaStore.orderPizza("Cheese");



    }
}
