import java.util.ArrayList;

public class CafeUtil {
    public String getStreakGoal() {
        int goal = 0;
        for (int i = 1; i <= 10; i++) {
            goal += i;
        }
        return String.valueOf(goal);
    }

    public double getOrderTotal(double[] lineItems) {
        double total = 0;
        for (int i = 0; i < lineItems.length; i++) {
            total += lineItems[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu) {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + ". " + menu.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Enter Your Name: ");
        String name = System.console().readLine();
        System.out.println("Hello " + name + "!" + " There is " + customers.size() + " customers ahead of you.");
        customers.add(name);
    }


}