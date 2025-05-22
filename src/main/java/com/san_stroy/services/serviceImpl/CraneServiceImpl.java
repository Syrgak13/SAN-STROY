package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.transport_type_dto.CraneDto;
import com.san_stroy.entities.transport_type.Crane;
import com.san_stroy.mappers.transport_type_mappers.CraneMapper;
import com.san_stroy.repositories.transport_type_repository.CraneRepository;
import com.san_stroy.services.CraneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CraneServiceImpl implements CraneService {

    private final CraneMapper craneMapper;
    private final CraneRepository craneRepository;


    @Override
    public List<CraneDto> findAllCranes() {
        return craneRepository
                .findAll()
                .stream()
                .map(craneMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CraneDto findCraneById(Long id) {
        Crane crane = craneRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Crane with id: " + id + " not found."));
        return craneMapper.toDto(crane);
    }

    @Override
    public CraneDto addCrane(CraneDto craneDto) {
        Crane newCrane = craneMapper.toEntity(craneDto);
        Crane savedCrane = craneRepository.save(newCrane);
        return craneMapper.toDto(savedCrane);
    }

    @Override
    public CraneDto updateCrane(Long id, CraneDto craneDto) {
        Crane existingCrane = craneRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Crane with id: " + id + " not found."));
        craneMapper.updateCraneFromMapper(craneDto, existingCrane);
        Crane updated = craneRepository.save(existingCrane);
        return craneMapper.toDto(updated);
    }

    @Override
    public CraneDto deleteCrane(Long id) {
        Crane deletedCrane = craneRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Crane with id: " + id + " not found."));

        craneRepository.delete(deletedCrane);
        return craneMapper.toDto(deletedCrane);
    }

}
