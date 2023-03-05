package com.konstantin.mvc.Service;



import com.konstantin.mvc.entity.Client;

import java.util.List;

public interface ClientService {

     List<Client> getAllClients();

     Client getClientById(int id);

     void saveClient(Client client);

     void deleteClient(int id);

}
