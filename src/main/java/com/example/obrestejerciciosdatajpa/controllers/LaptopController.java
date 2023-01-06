package com.example.obrestejerciciosdatajpa.controllers;

import com.example.obrestejerciciosdatajpa.entities.Laptop;
import com.example.obrestejerciciosdatajpa.repositories.LaptopResponsitory;
import jakarta.websocket.server.PathParam;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    private LaptopResponsitory laptopResponsitory;
    private Logger log;

    public LaptopController(LaptopResponsitory laptopResponsitory) {
       this.laptopResponsitory = laptopResponsitory;
    }

    /**
     * METODO BUSCAR LAPTOP
     * @return
     */
    @GetMapping("/api/laptop")
    public List<Laptop> findAll() {
        return laptopResponsitory.findAll();
    }

    /**
     * METODO BUSCAR LAPTOP POR ID
     * @param id
     * @return
     */
    @GetMapping("/api/laptop/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {
        Optional<Laptop> bookOptional = laptopResponsitory.findById(id);

        return bookOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * METODO CREAR LAPTOP
     * @param laptop
     * @return
     */
    @PostMapping("/api/laptop")
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopResponsitory.save(laptop);
    }

    /**
     * METODO PARA ACTUALIZAR UNA LAPTOP
     * @param laptop
     * @return
     */
    @PutMapping("/api/laptop")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop) {
        if (laptop.getId() ==  null) {
            log.warn("Trying to update a non existent Laptop");
            return ResponseEntity.badRequest().build();
        }
        if (!laptopResponsitory.existsById(laptop.getId())) {
            log.warn("Trying to update a non existent Laptop");
        }
        Laptop result = laptopResponsitory.save(laptop);
        return ResponseEntity.ok(result);
    }

    /**
     * METODO PARA ELIMINAR UNA LAPTOP
     * @param id
     * @return
     */
    @DeleteMapping("/api/laptop/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id) {
        if (!laptopResponsitory.existsById(id)) {
            log.warn("Trying to delete a non existent Laptop");
            return ResponseEntity.notFound().build();
        }
        laptopResponsitory.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * METODO PARA ELIMINAR ALL
     * @return
     */
    @DeleteMapping("/api/laptop")
    public ResponseEntity<Laptop> deleteAll() {
        laptopResponsitory.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
