package com.backend.portifolios.Portifolio.services;

import com.backend.portifolios.Portifolio.models.Solucao;
import com.backend.portifolios.Portifolio.repositories.SolucaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolucaoService {

    @Autowired
    private SolucaoRepository solucaoRepository;

    public Solucao save(Solucao solucao) {
        return solucaoRepository.save(solucao);
    }
}
