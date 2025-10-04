public class ExtraVeggie extends ToppingDecorator {
	public ExtraVeggie(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Extra Veggie";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 1.20;
	}
}