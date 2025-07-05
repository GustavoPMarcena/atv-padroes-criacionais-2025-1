package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;

public class OrcGuerreiroAbstractFactory implements PersonagemAbstractFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Machado de Guerra", 30, "Machado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura Brutal", 25, "Pesada");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Fúria", "Pancada Devastadora"};
    }
}
