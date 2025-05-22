package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.transport_type_dto.ConcreteMixerDto;
import com.san_stroy.entities.transport_type.ConcreteMixer;
import com.san_stroy.mappers.transport_type_mappers.ConcreteMixerMapper;
import com.san_stroy.repositories.transport_type_repository.ConcreteMixerRepository;
import com.san_stroy.services.ConcreteMixerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ConcreteMixerServiceImpl implements ConcreteMixerService {

    private final ConcreteMixerRepository concreteMixerRepository;
    private final ConcreteMixerMapper concreteMixerMapper;

    @Override
    public List<ConcreteMixerDto> findAllConcreteMixers() {
        return concreteMixerRepository
                .findAll()
                .stream()
                .map(concreteMixerMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ConcreteMixerDto findConcreteMixerById(Long id) {
        ConcreteMixer concreteMixer = concreteMixerRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Concrete mixer with id: " + id + " not found."));
        return concreteMixerMapper.toDto(concreteMixer);
    }

    @Override
    public ConcreteMixerDto addConcreteMixer(ConcreteMixerDto concreteMixerDto) {
        ConcreteMixer newConcreteMixer = concreteMixerMapper.toEntity(concreteMixerDto);
        ConcreteMixer savedConcreteMixer = concreteMixerRepository.save(newConcreteMixer);
        return concreteMixerMapper.toDto(savedConcreteMixer);
    }

    @Override
    public ConcreteMixerDto updateConcreteMixer(Long id, ConcreteMixerDto concreteMixerDto) {
        ConcreteMixer existingConcreteMixer = concreteMixerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Concrete mixer with id: " + id + " not found."));
        concreteMixerMapper.updateConcreteMixerFromMapper(concreteMixerDto, existingConcreteMixer);
        ConcreteMixer updated = concreteMixerRepository.save(existingConcreteMixer);
        return concreteMixerMapper.toDto(updated);
    }

    @Override
    public ConcreteMixerDto deleteConcreteMixer(Long id) {
        ConcreteMixer deletedConcreteMixer = concreteMixerRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Concrete mixer with id: " + id + " not found."));

        concreteMixerRepository.delete(deletedConcreteMixer);
        return concreteMixerMapper.toDto(deletedConcreteMixer);
    }
}
