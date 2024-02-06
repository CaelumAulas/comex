import InfosUser.Client;
import store.Order;

public class TestRequest {
    public static void main(String[] args) {
        Client client = new Client("RAFAEL","22233366655");
        Client client1 = new Client("ARMALDO","33399977754");
        Client client2= new Client("RAFAEL","66677895265");

        Order order = new Order(client,205.5,5);
        Order order2 = new Order(client1,738,8);
        Order order3 = new Order(client2,123,9);
        Order order4 = new Order(client2,123,9);
        Order order5 = new Order(client2,123,9);
        System.out.println(order.isCheaperThan(order3));
        System.out.println(order2.isMoreExpensiveThan(order));
        System.out.println(order);


    }
}
