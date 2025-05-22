package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.transport_type_dto.DumpTruckDto;
import com.san_stroy.entities.transport_type.DumpTruck;
import com.san_stroy.mappers.transport_type_mappers.DumpTruckMapper;
import com.san_stroy.repositories.transport_type_repository.DumpTruckRepository;
import com.san_stroy.services.DumpTruckService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DumpTruckServiceImpl implements DumpTruckService {

    private final DumpTruckRepository dumpTruckRepository;
    private final DumpTruckMapper dumpTruckMapper;

    @Override
    public List<DumpTruckDto> findDumpTrucks() {
        return dumpTruckRepository
                .findAll()
                .stream()
                .map(dumpTruckMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public DumpTruckDto findDumpTruckById(Long id) {
        DumpTruck dumpTruck = dumpTruckRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Dump truck with id: " + id + " not found."));
        return dumpTruckMapper.toDto(dumpTruck);
    }

    @Override
    public DumpTruckDto addDumpTruck(DumpTruckDto dumpTruckDto) {
        DumpTruck newDumpTruck = dumpTruckMapper.toEntity(dumpTruckDto);
        DumpTruck savedDumpTruck = dumpTruckRepository.save(newDumpTruck);
        return dumpTruckMapper.toDto(savedDumpTruck);
    }

    @Override
    public DumpTruckDto updateDumpTruck(Long id, DumpTruckDto dumpTruckDto) {
        DumpTruck existingDumpTruck = dumpTruckRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dump truck with id: " + id + " not found."));
        dumpTruckMapper.updateDumpTruckFromMapper(dumpTruckDto, existingDumpTruck);
        DumpTruck updated = dumpTruckRepository.save(existingDumpTruck);
        return dumpTruckMapper.toDto(updated);
    }

    @Override
    public DumpTruckDto deleteDumpTruck(Long id) {
        DumpTruck deletedDumpTruck = dumpTruckRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Dump truck with id: " + id + " not found."));

        dumpTruckRepository.delete(deletedDumpTruck);
        return dumpTruckMapper.toDto(deletedDumpTruck);
    }
}
