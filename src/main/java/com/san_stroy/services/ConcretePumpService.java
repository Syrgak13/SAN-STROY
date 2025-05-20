package com.san_stroy.services;

import com.san_stroy.dto.transport_type_dto.ConcretePumpDto;

import java.util.List;

public interface ConcretePumpService{

    List<ConcretePumpDto> findAllConcretePumps();

    ConcretePumpDto findConcretePumpById(Long id);

    ConcretePumpDto addConcretePump(ConcretePumpDto concretePumpDto);

    ConcretePumpDto updateConcretePump(Long id, ConcretePumpDto concretePumpDto);

    ConcretePumpDto deleteConcretePump(Long id);
}
