package org.example.OutraParte.src.Customers;

import org.example.OutraParte.src.DataBase.FactoryConnection;

import java.util.List;

public class ClientService {
    private FactoryConnection con;
    private Client client;
    public ClientService(Client client){
        this.con = new FactoryConnection();
        this.client = client;

    }
    public void save(){
        ClientDAO dao =new ClientDAO(con.recoveringConnection());
        dao.saveClient(this.client);

    }
    public List<Client> clientList(){
        ClientDAO dao = new ClientDAO(con.recoveringConnection());
      return  dao.listClient();

    }
    public void updateClient(String name,String cpf){
        ClientDAO dao = new ClientDAO(con.recoveringConnection());
        dao.update(name,cpf);
    }
    public void deleteClient(String id){
        ClientDAO dao = new ClientDAO(con.recoveringConnection());
        dao.deleteClient(id);
    }

    }
