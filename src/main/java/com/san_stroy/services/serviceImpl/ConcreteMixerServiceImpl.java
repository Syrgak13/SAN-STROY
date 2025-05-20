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
    public List<ConcreteMixerDto> findAllConcreteMixers() {
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
}
