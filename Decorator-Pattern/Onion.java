public class Onion extends ToppingDecorator {
	public Onion(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Onion";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 0.50;
	}
}