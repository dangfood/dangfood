package com.campusdang.restauration.service;

import com.campusdang.restauration.model.Client;
import com.campusdang.restauration.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;
    
    public Client getClientById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.orElseThrow(() -> new RuntimeException("Client non trouvé avec l'id: " + id));
    }
    
    public Client getClientByEmail(String email) {
        Optional<Client> client = clientRepository.findByEmail(email);
        return client.orElseThrow(() -> new RuntimeException("Client non trouvé avec l'email: " + email));
    }
    
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }
    
    public boolean emailExiste(String email) {
        return clientRepository.existsByEmail(email);
    }
}