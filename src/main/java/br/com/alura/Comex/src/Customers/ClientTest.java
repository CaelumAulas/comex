package org.example.OutraParte.src.Customers;

public class ClientTest {
    public static void main(String[] args) {
        Client  client = new Client("RAFAEK","12803894056");
        ClientService clientService = new ClientService(client);
        clientService.updateClient("JANAINA","12863894056");
        clientService.deleteClient("12803894056");

        for(Client mostra: clientService.clientList()){
            System.out.println(mostra);

        }
    }


}
