package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.TransportDto;
import com.san_stroy.dto.transport_type_dto.ConcreteMixerDto;
import com.san_stroy.services.ConcreteMixerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConcreteMixerServiceImpl implements ConcreteMixerService {
    @Override
    public List<ConcreteMixerDto> findAllConcreteMixer() {
        return List.of();
    }

    @Override
    public ConcreteMixerDto findConcreteMixerById(Long id) {
        return null;
    }

    @Override
    public ConcreteMixerDto addConcreteMixer(ConcreteMixerDto concreteMixerDto) {
        return null;
    }

    @Override
    public ConcreteMixerDto updateConcreteMixer(Long id, ConcreteMixerDto concreteMixerDto) {
        return null;
    }

    @Override
    public ConcreteMixerDto deleteConcreteMixer(Long id) {
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
