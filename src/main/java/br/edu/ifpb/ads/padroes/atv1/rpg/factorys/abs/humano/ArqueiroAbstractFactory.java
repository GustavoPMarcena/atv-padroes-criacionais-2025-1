package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;

public class ArqueiroAbstractFactory implements PersonagemAbstractFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Certeiro", "Chuva de Flechas"};
    }
}
