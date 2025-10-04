public class BasePizza implements Pizza {
	@Override
	public String getDescription() {
		return "Base Pizza";
	}

	@Override
	public double getCost() {
		return 5.00; // Base pizza cost
	}
}
