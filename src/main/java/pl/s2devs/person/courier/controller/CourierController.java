package pl.s2devs.person.courier.controller;

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
@RequestMapping("/courier")
public class CourierController {

    @Autowired
    private ClientService courierService;

    private ClientRepository courierRepository = courierService.getClientRepository();

    @GetMapping("/get/all")
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(courierRepository.findAll());
    }

    @GetMapping("/get/by/email")
    public ResponseEntity<Client> getClientByEmail(@RequestParam String email) {
        return ResponseEntity.ok(courierRepository.findByEmail(email));
    }

    @PostMapping("/new")
    public ResponseEntity<RegistrationResponse> registerNewClient(@RequestBody Client client) {
        return ResponseEntity.ok(new RegistrationResponse(
                client,
                courierService.registerNewClient(client)
        ));
    }

}
