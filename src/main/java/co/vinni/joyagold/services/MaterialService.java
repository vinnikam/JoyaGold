package co.vinni.joyagold.services;

import co.vinni.joyagold.dto.MaterialDto;
import co.vinni.joyagold.entities.Material;
import co.vinni.joyagold.repositories.MaterialRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository materialRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public MaterialDto getByIDDto(Long codigo) {
        Material material = materialRepository.getReferenceById(codigo);
        return  this.modelMapper.map(material, MaterialDto.class);
    }
    @Transactional(readOnly = true)
    public List<MaterialDto> getAll() {
        List<Material> materialList = materialRepository.findAll();
        TypeToken<List<MaterialDto>> typeToken = new TypeToken<>() {};
        return  modelMapper.map(materialList, typeToken.getType());
    }
}
