package max.headfirst.edu;

/**
 * This is a project to demonstrate the Decorator Design Pattern from the
 * HeadFirst Design patterns book
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * This is our abstract decorator
     * @return
     */
    public abstract String getDescription();
}