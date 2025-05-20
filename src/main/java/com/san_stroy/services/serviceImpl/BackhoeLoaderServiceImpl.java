package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.TransportDto;
import com.san_stroy.dto.transport_type_dto.BackhoeLoaderDto;
import com.san_stroy.mappers.transport_type_mappers.BackhoeLoaderMapper;
import com.san_stroy.repositories.transport_type_repository.BackhoeLoaderRepository;
import com.san_stroy.services.BackhoeLoaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BackhoeLoaderServiceImpl implements BackhoeLoaderService {

    private final BackhoeLoaderRepository backhoeLoaderRepository;
    private final BackhoeLoaderMapper backhoeLoaderMapper;

    @Override
    public List<BackhoeLoaderDto> findAllBackhoeLoaders() {
        return List.of();
    }

    @Override
    public BackhoeLoaderDto findBackhoeLoaderById(Long id) {
        return null;
    }

    @Override
    public BackhoeLoaderDto addBackhoeLoader(BackhoeLoaderDto backhoeLoaderDto) {
        return null;
    }

    @Override
    public BackhoeLoaderDto updateBackhoeLoader(BackhoeLoaderDto backhoeLoaderDto) {
        return null;
    }

    @Override
    public BackhoeLoaderDto deleteBackhoeLoader(Long id) {
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
