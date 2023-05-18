package co.vinni.joyagold.services;

import co.vinni.joyagold.dto.ProductoDto;
import co.vinni.joyagold.entities.Producto;
import co.vinni.joyagold.repositories.ProductoRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public ProductoDto getByIDDto(Long codigo) {
        Producto producto = productoRepository.getReferenceById(codigo);
        return  modelMapper.map(producto, ProductoDto.class);
    }
    @Transactional(readOnly = true)
    public List<ProductoDto> getAll() {
        List<Producto> productosList = productoRepository.findAll();
        TypeToken<List<ProductoDto>> typeToken = new TypeToken<>() {};
        return  modelMapper.map(productosList, typeToken.getType());
    }
    @Transactional
    public ProductoDto create(ProductoDto productoDto) {
        Producto producto = modelMapper.map(productoDto, Producto.class);
        producto =  productoRepository.save(producto);
        return  modelMapper.map(producto, ProductoDto.class);

    }
    @Transactional
    public ProductoDto update(ProductoDto productoDto) {
        if (productoRepository.existsById(productoDto.getCodigo()))
            return create(productoDto);
        return productoDto;
    }

    @Transactional
    public void deleteById(long id) {
        if (id > 0) {
            this.productoRepository.deleteById(id);
        }
    }
}
