package max.headfirst.edu;

public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "Whip";
    }

    public double cost() {
        return .10;
    }
}
