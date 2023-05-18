package co.vinni.joyagold.services;

import co.vinni.joyagold.dto.TipoProductoDto;
import co.vinni.joyagold.entities.TipoProducto;
import co.vinni.joyagold.repositories.TipoProductoRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoProductoService {
    @Autowired
    private TipoProductoRepository tipoProductoRepository;

    @Autowired
    private ModelMapper  modelMapper;

    @Transactional(readOnly = true)
    public TipoProductoDto getByIDDto(Long codigo) {
        TipoProducto tipoProducto = tipoProductoRepository.getReferenceById(codigo);
        return  modelMapper.map(tipoProducto, TipoProductoDto.class);
    }
    @Transactional(readOnly = true)
    public List<TipoProductoDto> getAll() {
        List<TipoProducto> tipoProductoList = tipoProductoRepository.findAll();
        TypeToken<List<TipoProductoDto>> typeToken = new TypeToken<>() {};
        return  modelMapper.map(tipoProductoList, typeToken.getType());
    }
}
