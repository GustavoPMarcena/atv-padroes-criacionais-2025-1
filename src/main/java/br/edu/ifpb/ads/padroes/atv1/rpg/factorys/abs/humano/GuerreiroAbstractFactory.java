package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;

public class GuerreiroAbstractFactory implements PersonagemAbstractFactory {

    @Override
    public Arma criarArma() {
       return new Arma("Espada de Ferro", 25, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Placas", 20, "Pesada");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Investida", "Bloqueio"};
    }
}
