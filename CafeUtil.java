import java.util.ArrayList;

public class CafeUtil{
    int getStreakGoal(){
        int sum = 0;
        for(int i=0; i<=10; i++){
            sum += i;
        }
        return sum;
    }

    double getOrderTotal(double[] prices){
        double total = 0.0;
        for(int i=0; i<prices.length; i++){
            total += prices[i];
        }
        return total;
    }

    void displayMenu(ArrayList<String> menuItems){
        String name;
        for(int i=0; i<menuItems.size(); i++){
            name = menuItems.get(i);
            System.out.println(String.format("%d %s", i, name));
        }
    }
    
    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        int customerCount = customers.size();
        System.out.println(String.format("There are %d people in front of you.", customerCount));
        customers.add(userName);
        System.out.println(customers);
    }
}