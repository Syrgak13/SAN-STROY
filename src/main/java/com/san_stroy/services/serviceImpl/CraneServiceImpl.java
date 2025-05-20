package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.TransportDto;
import com.san_stroy.dto.transport_type_dto.CraneDto;
import com.san_stroy.mappers.transport_type_mappers.CraneMapper;
import com.san_stroy.repositories.transport_type_repository.CraneRepository;
import com.san_stroy.services.CraneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CraneServiceImpl implements CraneService {

    private final CraneMapper craneMapper;
    private final CraneRepository craneRepository;


    @Override
    public List<CraneDto> findAllCrane() {
        return List.of();
    }

    @Override
    public CraneDto findCraneById(Long id) {
        return null;
    }

    @Override
    public CraneDto addCrane(CraneDto craneDto) {
        return null;
    }

    @Override
    public CraneDto updateCrane(Long id, CraneDto craneDto) {
        return null;
    }

    @Override
    public CraneDto deleteCrane(Long id) {
        return null;
    }

    @Override
    public List<TransportDto> getAllTransports() {
        return List.of();
    }

    @Override
    public TransportDto getTransportById(Long id) {
        return null;
    }

    @Override
    public TransportDto addTransport(TransportDto transportDto) {
        return null;
    }

    @Override
    public TransportDto updateTransport(Long id, TransportDto transportDto) {
        return null;
    }

    @Override
    public TransportDto deleteTransport(Long id) {
        return null;
    }
}
