package pl.s2devs.person.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.s2devs.person.client.model.Client;
import pl.s2devs.person.client.repository.ClientRepository;
import pl.s2devs.person.client.service.ClientService;
import pl.s2devs.shared.response.RegistrationResponse;

import java.util.List;

/**
 * Created by rafal on 14.11.17.
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    private ClientRepository clientRepository = clientService.getClientRepository();

    @GetMapping("/get/all")
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(clientRepository.findAll());
    }

    @GetMapping("/get/by/email")
    public ResponseEntity<Client> getClientByEmail(@RequestParam String email) {
        return ResponseEntity.ok(clientRepository.findByEmail(email));
    }

    @PostMapping("/new")
    public ResponseEntity<RegistrationResponse> registerNewClient(@RequestBody Client client) {
        return ResponseEntity.ok(new RegistrationResponse(
                client,
                clientService.registerNewClient(client)
        ));
    }
}
