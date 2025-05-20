package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.TransportDto;
import com.san_stroy.dto.transport_type_dto.ConcretePumpDto;
import com.san_stroy.services.ConcretePumpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConcretePumpServiceImpl implements ConcretePumpService {

    @Override
    public List<ConcretePumpDto> findAllConcretePumps() {
        return List.of();
    }

    @Override
    public ConcretePumpDto findConcretePumpById(Long id) {
        return null;
    }

    @Override
    public ConcretePumpDto addConcretePump(ConcretePumpDto concretePumpDto) {
        return null;
    }

    @Override
    public ConcretePumpDto updateConcretePump(Long id, ConcretePumpDto concretePumpDto) {
        return null;
    }

    @Override
    public ConcretePumpDto deleteConcretePump(Long id) {
        return null;
    }
}
