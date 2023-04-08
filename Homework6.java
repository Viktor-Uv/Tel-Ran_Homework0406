public class Homework6 {
    public static void main(String[] args) {
        // Create 2 Pizzas
        Pizza pizzaStandard = new Pizza();
        Pizza pizzaLarge = new Pizza(28);

        // Display calories difference
        System.out.print("Calorie Difference: ");
        System.out.println(pizzaLarge.getCalories() - pizzaStandard.getCalories());
    }
}
