public class Mozzarella extends ToppingDecorator {
	public Mozzarella(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Mozzarella";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 1.00;
	}
}