package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.transport_type_dto.ExcavatorDto;
import com.san_stroy.entities.transport_type.Excavator;
import com.san_stroy.mappers.transport_type_mappers.ExcavatorMapper;
import com.san_stroy.repositories.transport_type_repository.ExcavatorRepository;
import com.san_stroy.services.ExcavatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExcavatorServiceImpl implements ExcavatorService {

    private final ExcavatorRepository excavatorRepository;
    private final ExcavatorMapper excavatorMapper;

    @Override
    public List<ExcavatorDto> findAllExcavators() {
        return excavatorRepository
                .findAll()
                .stream()
                .map(excavatorMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ExcavatorDto findExcavatorById(Long id) {
        Excavator excavator = excavatorRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Excavator with id: " + id + " not found."));
        return excavatorMapper.toDto(excavator);
    }

    @Override
    public ExcavatorDto addExcavator(ExcavatorDto excavatorDto) {
        Excavator newExcavator = excavatorMapper.toEntity(excavatorDto);
        Excavator savedExcavator = excavatorRepository.save(newExcavator);
        return excavatorMapper.toDto(savedExcavator);
    }

    @Override
    public ExcavatorDto updateExcavator(Long id, ExcavatorDto excavatorDto) {
        Excavator existingExcavator = excavatorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Excavator with id: " + id + " not found."));
        excavatorMapper.updateExcavatorFromMapper(excavatorDto, existingExcavator);
        Excavator updated = excavatorRepository.save(existingExcavator);
        return excavatorMapper.toDto(updated);
    }

    @Override
    public ExcavatorDto deleteExcavator(Long id) {
        Excavator deletedExcavator = excavatorRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Excavator with id: " + id + " not found."));

        excavatorRepository.delete(deletedExcavator);
        return excavatorMapper.toDto(deletedExcavator);
    }
}
