package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Client;
import org.springframework.stereotype.Service;

/**
 * Interface que define o padão <b>Strategy</b> no domínio de cliente. Com
 * isso se necessário, podemos ter multlipas implementações dessa mesma
 * interface.
 *
 * @author Fellipe M Dino
 */

public interface ClientService {
    Iterable<Client> searchAll();

    Client searchById(Long id);
    void insert(Client client);
    void update(Long id, Client client);
    void delete(Long id);
}
