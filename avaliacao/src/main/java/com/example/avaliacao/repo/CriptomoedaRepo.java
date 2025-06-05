package com.example.avaliacao.repo;


import com.example.avaliacao.entity.Criptomoeda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriptomoedaRepo extends JpaRepository<Criptomoeda, Long> {


}
