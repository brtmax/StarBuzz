package max.headfirst.edu;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "Mocha";
    }

    public double cost() {
        switch(beverage.size) {

            case TALL:
                return beverage.cost() + .15;

            case VENTI:
                return beverage.cost() + .20;

            case GRANDE:
                return beverage.cost() + .25;

            default:
                return beverage.cost();
        }

    }
}
