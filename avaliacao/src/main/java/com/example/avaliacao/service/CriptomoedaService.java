package com.example.avaliacao.service;

import com.example.avaliacao.entity.Criptomoeda;
import com.example.avaliacao.repo.CriptomoedaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CriptomoedaService {

    @Autowired
    private CriptomoedaRepo criptomoedaRepo;

    public Criptomoeda salvar(Criptomoeda criptomoeda) {
        return criptomoedaRepo.save(criptomoeda);

    }

    public Optional<Criptomoeda> buscarCriptomoedaPorId(Long id) {
        return criptomoedaRepo.findById(id);


    }

    public List<Criptomoeda> buscarCriptomoedas() {
        return criptomoedaRepo.findAll();

    }

    public Criptomoeda editar(Criptomoeda criptomoeda) {

        return criptomoedaRepo.save(criptomoeda);


    }

    public void excluir(Long id) {
        criptomoedaRepo.deleteById(id);


    }
    public List<Criptomoeda> salvarListaDecriptomoedas(List<Criptomoeda> criptomoedas){
        return criptomoedaRepo.saveAll(criptomoedas);

    }


}








