package com.konstantin.mvc.Service;

import com.konstantin.mvc.entity.Client;
import com.konstantin.mvc.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    public ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(int id) {
        return null;
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }
}
