public class PizzaOrder {
	public static void main(String[] args) {
		Pizza myPizza = new BasePizza();
		myPizza = new Mozzarella(myPizza);
		myPizza = new ExtraCheese(myPizza);
		myPizza = new Onion(myPizza);
		myPizza = new Garlic(myPizza);
		myPizza = new OliveOil(myPizza);
		myPizza = new ExtraVeggie(myPizza);

		System.out.println("Order: " + myPizza.getDescription());
		System.out.printf("Total cost: $%.2f\n", myPizza.getCost());

		//Order: Base Pizza, Mozzarella, Extra Cheese, Onion, Extra Veggie
		//Total cost: $10.75
	}
}
