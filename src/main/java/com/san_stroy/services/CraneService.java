package com.san_stroy.services;


import com.san_stroy.dto.transport_type_dto.CraneDto;

import java.util.List;

public interface CraneService{

    List<CraneDto> findAllCranes();

    CraneDto findCraneById(Long id);

    CraneDto addCrane(CraneDto craneDto);

    CraneDto updateCrane(Long id, CraneDto craneDto);

    CraneDto deleteCrane(Long id);
}
