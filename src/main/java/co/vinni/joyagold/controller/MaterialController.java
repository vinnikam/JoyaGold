package co.vinni.joyagold.controller;

import co.vinni.joyagold.dto.MaterialDto;
import co.vinni.joyagold.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materiales")
@CrossOrigin(origins = "${spring.webmvc.cors.allowed-origins}",
        methods = {RequestMethod.GET})
public class MaterialController {
    @Autowired
    private MaterialService materialService;

    @GetMapping("/{codigo}")
    public ResponseEntity<MaterialDto> getById(@PathVariable("codigo") Long codigo) {
        return ResponseEntity.ok(materialService.getByIDDto(codigo));
    }
    @GetMapping("/")
    public ResponseEntity<List<MaterialDto>> getAll() {
        return ResponseEntity.ok(materialService.getAll());
    }

}
