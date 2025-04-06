package dev.myproject.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // list all ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }
}
