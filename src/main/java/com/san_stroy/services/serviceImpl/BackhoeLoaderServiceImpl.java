package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.transport_type_dto.BackhoeLoaderDto;
import com.san_stroy.entities.transport_type.BackhoeLoader;
import com.san_stroy.mappers.transport_type_mappers.BackhoeLoaderMapper;
import com.san_stroy.repositories.transport_type_repository.BackhoeLoaderRepository;
import com.san_stroy.services.BackhoeLoaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BackhoeLoaderServiceImpl implements BackhoeLoaderService {

    private final BackhoeLoaderRepository backhoeLoaderRepository;
    private final BackhoeLoaderMapper backhoeLoaderMapper;


    @Override
    public List<BackhoeLoaderDto> findAllBackhoeLoaders() {
        return backhoeLoaderRepository
                .findAll()
                .stream()
                .map(backhoeLoaderMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public BackhoeLoaderDto findBackhoeLoaderById(Long id) {
        BackhoeLoader backhoeLoader = backhoeLoaderRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Backhoe loader with id: " + id + " not found."));
        return backhoeLoaderMapper.toDto(backhoeLoader);
    }

    @Override
    public BackhoeLoaderDto addBackhoeLoader(BackhoeLoaderDto backhoeLoaderDto) {
        BackhoeLoader newBackhoeLoader = backhoeLoaderMapper.toEntity(backhoeLoaderDto);
        BackhoeLoader savedBackhoeLoader = backhoeLoaderRepository.save(newBackhoeLoader);
        return backhoeLoaderMapper.toDto(savedBackhoeLoader);
    }

    @Override
    public BackhoeLoaderDto updateBackhoeLoader(Long id, BackhoeLoaderDto backhoeLoaderDto) {
        BackhoeLoader existingBackhoeLoader = backhoeLoaderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Backhoe loader with id: " + id + " not found."));
        backhoeLoaderMapper.updateBackhoeLoaderFromMapper(backhoeLoaderDto, existingBackhoeLoader);
        BackhoeLoader updated = backhoeLoaderRepository.save(existingBackhoeLoader);
        return backhoeLoaderMapper.toDto(updated);
    }

    @Override
    public BackhoeLoaderDto deleteBackhoeLoader(Long id) {
        BackhoeLoader deletedBackhoeLoader = backhoeLoaderRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Backhoe loader with id: " + id + " not found."));

        backhoeLoaderRepository.delete(deletedBackhoeLoader);
        return backhoeLoaderMapper.toDto(deletedBackhoeLoader);
    }
}
