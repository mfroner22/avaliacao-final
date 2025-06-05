package com.example.avaliacao.controler;


import com.example.avaliacao.entity.Criptomoeda;
import com.example.avaliacao.service.CriptomoedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/criptomoeda")
public class CriptomoedaControler {
    @Autowired
    private CriptomoedaService criptomoedaService;

    @GetMapping("{id}")
    public Criptomoeda buscarCriptomoedaPorId(@PathVariable long id) {
        System.out.println("Entrei");
        return criptomoedaService.buscarCriptomoedaPorId(id).get();

    }
    @PutMapping("{id}")

    public String atualizar(@PathVariable long id, @RequestBody Criptomoeda criptomoeda) {
        Optional<Criptomoeda> criptomoedaAtual = criptomoedaService.buscarCriptomoedaPorId(id);
        if (criptomoedaAtual.isEmpty()) {
            return "Criptomoeda com " + id + "não encontrado";
        }
        criptomoeda.setId(criptomoedaAtual.get().getId());
        criptomoedaService.editar(criptomoeda);
        return "Produto com id" + id + "atualizado com sucesso";
    }
    @GetMapping("/lista")
    public List<Criptomoeda> ListarCriptomoeda() {

        return criptomoedaService.buscarCriptomoedas();
    }
    @PostMapping
    public Criptomoeda salvarCriptomoeda(@RequestBody Criptomoeda criptomoeda) {

        return criptomoedaService.salvar(criptomoeda);

    }

    @DeleteMapping("{id}")
    public String excluir(@PathVariable Long id) {
        criptomoedaService.excluir(id);
        return "Criptomoeda com " + id + " excluido com sucesso";
    }

    @PostMapping("/lista")
    public List<Criptomoeda> listarCriptomoedas(@RequestBody List<Criptomoeda> criptomoedas){
        return criptomoedaService.salvarListaDecriptomoedas(criptomoedas);
    }


}


