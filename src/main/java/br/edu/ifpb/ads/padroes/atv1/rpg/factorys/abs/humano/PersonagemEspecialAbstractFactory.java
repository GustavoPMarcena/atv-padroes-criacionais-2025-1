package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;

public class PersonagemEspecialAbstractFactory implements PersonagemAbstractFactory {

    @Override
    public Arma criarArma() {
        return new Arma("Excalibur", 35, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura do Rei", 30, "Pesada");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Investida", "Bloqueio", "Liderança"};
    }
}
