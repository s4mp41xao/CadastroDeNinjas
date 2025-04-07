package dev.myproject.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

        public NinjaModel map(NinjaDTO ninjaDTO) {

            NinjaModel ninjaModel = new NinjaModel();
            ninjaModel.setId(ninjaDTO.getId());
            ninjaModel.setNome(ninjaDTO.getNome());
            ninjaModel.setEmail(ninjaDTO.getEmail());
            ninjaModel.setIdade(ninjaDTO.getIdade());
            ninjaModel.setImgUrl(ninjaDTO.getImgUrl());
            ninjaModel.setRank(ninjaDTO.getRank());
            ninjaModel.setMissoes(ninjaDTO.getMissoes());

            return ninjaModel;
        }

        public NinjaDTO map(NinjaModel ninjaModel) {
            NinjaDTO ninjaDTO = new NinjaDTO();
            ninjaModel.setId(ninjaModel.getId());
            ninjaModel.setNome(ninjaModel.getNome());
            ninjaModel.setEmail(ninjaModel.getEmail());
            ninjaModel.setIdade(ninjaModel.getIdade());
            ninjaModel.setImgUrl(ninjaModel.getImgUrl());
            ninjaModel.setMissoes(ninjaModel.getMissoes());
            ninjaModel.setRank(ninjaModel.getRank());

            return ninjaDTO;
        }
}
