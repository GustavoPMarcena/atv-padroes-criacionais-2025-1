package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;

public class OrcArqueiroAbstractFactory implements PersonagemAbstractFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Arco de Osso", 24, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Couro de Besta", 16, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Brutal", "Intimidação"};
    }
}
