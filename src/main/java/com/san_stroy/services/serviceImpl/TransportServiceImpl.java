package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.TransportDto;
import com.san_stroy.entities.Transport;
import com.san_stroy.mappers.TransportMapper;
import com.san_stroy.repositories.TransportRepository;
import com.san_stroy.services.TransportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TransportServiceImpl implements TransportService {

    private final TransportRepository transportRepository;
    private final TransportMapper transportMapper;

    public List<TransportDto> getAllTransports() {
        return transportRepository
                .findAll()
                .stream()
                .map(transportMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TransportDto getTransportById(Long id) {
        Transport transport = transportRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No transport found with id: " + id));
        return transportMapper.toDto(transport);
    }

    @Override
    public TransportDto addTransport(TransportDto transportDto) {
        Transport newTransport = transportMapper.toEntity(transportDto);
        Transport savedTransport = transportRepository.save(newTransport);
        return transportMapper.toDto(savedTransport);
    }

    @Override
    public TransportDto updateTransport(Long id, TransportDto transportDto) {
        Transport existingTransport = transportRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transport not found"));

        transportMapper.updateTransportFromMapper(transportDto, existingTransport);

        Transport updatedTransport = transportRepository.save(existingTransport);
        return transportMapper.toDto(updatedTransport);
    }

    @Override
    public TransportDto deleteTransport(Long id) {
        Transport deletedTransport = transportRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Transport not found"));

        transportRepository.delete(deletedTransport);
        return transportMapper.toDto(deletedTransport);
    }
}
