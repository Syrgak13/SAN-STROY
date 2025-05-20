package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.TransportDto;
import com.san_stroy.dto.transport_type_dto.ExcavatorDto;
import com.san_stroy.services.ExcavatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExcavatorServiceImpl implements ExcavatorService {
    @Override
    public List<ExcavatorDto> findAllExcavator() {
        return List.of();
    }

    @Override
    public ExcavatorDto findExcavatorById(Long id) {
        return null;
    }

    @Override
    public ExcavatorDto addExcavator(ExcavatorDto excavatorDto) {
        return null;
    }

    @Override
    public ExcavatorDto updateExcavator(Long id, ExcavatorDto excavatorDto) {
        return null;
    }

    @Override
    public ExcavatorDto deleteExcavator(Long id) {
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
