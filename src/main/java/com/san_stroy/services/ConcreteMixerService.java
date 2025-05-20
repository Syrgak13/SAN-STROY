package com.san_stroy.services;

import com.san_stroy.dto.transport_type_dto.ConcreteMixerDto;

import java.util.List;

public interface ConcreteMixerService extends TransportService{

    List<ConcreteMixerDto> findAllConcreteMixer();

    ConcreteMixerDto findConcreteMixerById(Long id);

    ConcreteMixerDto addConcreteMixer(ConcreteMixerDto concreteMixerDto);

    ConcreteMixerDto updateConcreteMixer(Long id, ConcreteMixerDto concreteMixerDto);

    ConcreteMixerDto deleteConcreteMixer(Long id);
}
