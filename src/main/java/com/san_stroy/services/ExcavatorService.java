package com.san_stroy.services;


import com.san_stroy.dto.transport_type_dto.ExcavatorDto;

import java.util.List;

public interface ExcavatorService{

    List<ExcavatorDto> findAllExcavators();

    ExcavatorDto findExcavatorById(Long id);

    ExcavatorDto addExcavator(ExcavatorDto excavatorDto);

    ExcavatorDto updateExcavator(Long id, ExcavatorDto excavatorDto);

    ExcavatorDto deleteExcavator(Long id);
}
