package co.vinni.joyagold.controller;

import co.vinni.joyagold.dto.ProductoDto;
import co.vinni.joyagold.services.ProductoService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "${spring.webmvc.cors.allowed-origins}",
        methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/{codigo}")
    public ResponseEntity<ProductoDto> getById(@PathVariable("codigo") Long codigo) {
        return ResponseEntity.ok(productoService.getByIDDto(codigo));
    }
    @GetMapping("/")
    public ResponseEntity<List<ProductoDto>> getAll() {
        return ResponseEntity.ok(productoService.getAll());
    }
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ProductoDto> save(@RequestBody ProductoDto entityDto) {
        entityDto = productoService.create(entityDto);
        return ResponseEntity.created(URI.create("")).body(entityDto);
    }


    @PutMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ProductoDto> update(@RequestBody ProductoDto entityDto) {
        entityDto = productoService.update(entityDto);
        return ResponseEntity.created(URI.create("")).body(entityDto);
    }


    @DeleteMapping("/{codigo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<ProductoDto> delete(@PathVariable(value = "codigo") long codigo) {
        productoService.deleteById(codigo);
        return ResponseEntity.noContent().build();
    }
}
