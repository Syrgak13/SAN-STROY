package com.san_stroy.services;

import com.san_stroy.dto.transport_type_dto.BackhoeLoaderDto;

import java.util.List;

public interface BackhoeLoaderService {

    List<BackhoeLoaderDto> findAllBackhoeLoaders();

    BackhoeLoaderDto findBackhoeLoaderById(Long id);

    BackhoeLoaderDto addBackhoeLoader(BackhoeLoaderDto backhoeLoaderDto);

    BackhoeLoaderDto updateBackhoeLoader(BackhoeLoaderDto backhoeLoaderDto);

    BackhoeLoaderDto deleteBackhoeLoader(Long id);
}
