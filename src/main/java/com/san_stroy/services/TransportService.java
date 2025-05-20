package com.san_stroy.services;

import com.san_stroy.dto.TransportDto;

import java.util.List;

public interface TransportService {

    List<TransportDto> getAllTransports();

    TransportDto getTransportById(Long id);

    TransportDto addTransport(TransportDto transportDto);

    TransportDto updateTransport(Long id, TransportDto transportDto);

    TransportDto deleteTransport(Long id);


}
