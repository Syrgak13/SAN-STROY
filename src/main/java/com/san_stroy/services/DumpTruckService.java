package com.san_stroy.services;

import com.san_stroy.dto.transport_type_dto.DumpTruckDto;

import java.util.List;

public interface DumpTruckService extends TransportService{

    List<DumpTruckDto> findDumpTruck();

    DumpTruckDto findDumpTruckById(Long id);

    DumpTruckDto addDumpTruck(DumpTruckDto dumpTruckDto);

    DumpTruckDto updateDumpTruck(Long id, DumpTruckDto dumpTruckDto);

    DumpTruckDto deleteDumpTruck(Long id);
}
