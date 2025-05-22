package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.transport_type_dto.ConcretePumpDto;
import com.san_stroy.entities.transport_type.ConcretePump;
import com.san_stroy.mappers.transport_type_mappers.ConcretePumpMapper;
import com.san_stroy.repositories.transport_type_repository.ConcretePumpRepository;
import com.san_stroy.services.ConcretePumpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ConcretePumpServiceImpl implements ConcretePumpService {

    private final ConcretePumpMapper concretePumpMapper;
    private final ConcretePumpRepository concretePumpRepository;


    @Override
    public List<ConcretePumpDto> findAllConcretePumps() {
        return concretePumpRepository
                .findAll()
                .stream()
                .map(concretePumpMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ConcretePumpDto findConcretePumpById(Long id) {
        ConcretePump concretePump = concretePumpRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Concrete pump with id: " + id + " not found."));
        return concretePumpMapper.toDto(concretePump);
    }

    @Override
    public ConcretePumpDto addConcretePump(ConcretePumpDto concretePumpDto) {
        ConcretePump newConcretePump = concretePumpMapper.toEntity(concretePumpDto);
        ConcretePump savedConcretePump = concretePumpRepository.save(newConcretePump);
        return concretePumpMapper.toDto(savedConcretePump);
    }

    @Override
    public ConcretePumpDto updateConcretePump(Long id, ConcretePumpDto concretePumpDto) {
        ConcretePump existingConcretePump = concretePumpRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Concrete pump with id: " + id + " not found."));
        concretePumpMapper.updateConcretePumpFromMapper(concretePumpDto, existingConcretePump);
        ConcretePump updated = concretePumpRepository.save(existingConcretePump);
        return concretePumpMapper.toDto(updated);
    }

    @Override
    public ConcretePumpDto deleteConcretePump(Long id) {
        ConcretePump deletedConcretePump = concretePumpRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Concrete pump with id: " + id + " not found."));

        concretePumpRepository.delete(deletedConcretePump);
        return concretePumpMapper.toDto(deletedConcretePump);
    }
}
