import java.util.Scanner;
import com.customer.laboratorna2.Customer;
public class Main {
    static Scanner s = new Scanner(System.in);
    static public void main(String args[]) {
        Customer customers[] = enteringInfo();
        printfArray(customers);
        searchingByName(customers);
        searchingByRangeOfNumbersOfCards(customers);
        showBankrupts(customers);
    }
    static public void showBankrupts(Customer[] array){
        System.out.println("They don't have money: ");
        for (Customer customer : array) {
            if (customer.getAmountOfMoney() < 0)
                System.out.println(customer);
        }
    }
    static public void searchingByRangeOfNumbersOfCards(Customer[] array){
        Scanner s = new Scanner(System.in);
        int min, max;
        System.out.print("Please, enter the minimum of range: ");
        min = Integer.parseInt(s.nextLine());
        System.out.print("Please, enter the maximum of range: ");
        max = Integer.parseInt(s.nextLine());
        System.out.println("The customers who have certain number of card:");
        for(int i = 0; i < array.length; i++){
            if(array[i].getNumberOfCard() <= max && array[i].getNumberOfCard() >= min)
                System.out.println(array[i]);
        }
    }
    static public void searchingByName(Customer[] array){
        Scanner s = new Scanner(System.in);
        System.out.print("Please, enter the name for searching: ");
        String name = s.nextLine();
        for(int i = 0; i < array.length; i++){
            if(array[i].getFirstName().equalsIgnoreCase(name))
                System.out.println(array[i]);
        }
    }
    static public void printfArray(Customer[] array){
        System.out.println("The customers: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    static public Customer[] enteringInfo() {
        Scanner s = new Scanner(System.in);
        int id, NumberOfCard, AmountOfClients = 0, i;
        double AmountOfMoney;
        String LastName, FirstName, MiddleName, Address;
        boolean isExcept = false;
        System.out.print("Please, enter the amount of customers: ");
        try {
            AmountOfClients = Integer.parseInt(s.nextLine());
        }catch(Exception error){
            System.out.println("The entered data if wrong!");
        }
        Customer[] array = new Customer[AmountOfClients];
        for(i = 0; i < AmountOfClients; i++){
            System.out.println("The person №"+(i+1));
            System.out.print("Please, enter the last name: ");
            LastName = s.nextLine();
            System.out.print("Please, enter the first name: ");
            FirstName = s.nextLine();
            System.out.print("Please, enter the middle name: ");
            MiddleName = s.nextLine();
            System.out.print("Please, enter the id: ");
            id = Integer.parseInt(s.nextLine());
            System.out.print("Please, enter the number of card: ");
            NumberOfCard = Integer.parseInt(s.nextLine());
            System.out.print("Please, enter the amount of money: ");
            AmountOfMoney = Double.parseDouble(s.nextLine());
            System.out.print("Please, enter the address: ");
            Address = s.nextLine();
            array[i] = new Customer(id,LastName,FirstName,MiddleName,Address,NumberOfCard,AmountOfMoney);
        }
        return array;
    }
}
