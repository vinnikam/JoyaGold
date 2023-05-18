package co.vinni.joyagold.controller;

import co.vinni.joyagold.dto.TipoProductoDto;
import co.vinni.joyagold.services.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipoproductos")
@CrossOrigin(origins = "${spring.webmvc.cors.allowed-origins}",
        methods = {RequestMethod.GET})
public class TipoProductoController {
    @Autowired
    private TipoProductoService tipoProductoService;

    @GetMapping("/{codigo}")
    public ResponseEntity<TipoProductoDto> getById(@PathVariable("codigo") Long codigo) {
        return ResponseEntity.ok(tipoProductoService.getByIDDto(codigo));
    }
    @GetMapping("/")
    public ResponseEntity<List<TipoProductoDto>> getAll() {
        return ResponseEntity.ok(tipoProductoService.getAll());
    }

}
