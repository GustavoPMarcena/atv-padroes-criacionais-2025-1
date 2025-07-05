package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;

public class ElfoArqueiroAbstractFactory implements PersonagemAbstractFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Arco Longo Élfico", 28, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro Élfico", 14, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Múltiplo", "Camuflagem"};
    }
}
