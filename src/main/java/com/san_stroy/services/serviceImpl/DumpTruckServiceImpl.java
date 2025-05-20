package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.TransportDto;
import com.san_stroy.dto.transport_type_dto.DumpTruckDto;
import com.san_stroy.services.DumpTruckService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DumpTruckServiceImpl implements DumpTruckService {

    @Override
    public List<DumpTruckDto> findDumpTrucks() {
        return List.of();
    }

    @Override
    public DumpTruckDto findDumpTruckById(Long id) {
        return null;
    }

    @Override
    public DumpTruckDto addDumpTruck(DumpTruckDto dumpTruckDto) {
        return null;
    }

    @Override
    public DumpTruckDto updateDumpTruck(Long id, DumpTruckDto dumpTruckDto) {
        return null;
    }

    @Override
    public DumpTruckDto deleteDumpTruck(Long id) {
        return null;
    }
}
