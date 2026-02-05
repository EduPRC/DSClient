package com.devsuperior.dsclient.controllers;

import com.devsuperior.dsclient.dto.ClientDTO;
import com.devsuperior.dsclient.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<ClientDTO> dto = clientService.findAll(pageable);
        return dto;
    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO dto) {
        return clientService.insert(dto);
    }

    @PutMapping(value = "/{id}")
    public ClientDTO update(@PathVariable Long id, @RequestBody ClientDTO dto) {
        return clientService.update(id, dto);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        clientService.delete(id);
    }

}
