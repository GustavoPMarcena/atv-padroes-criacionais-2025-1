package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;

public class ElfoMagoAbstractFactory implements PersonagemAbstractFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Cajado da Natureza", 18, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Mantos Élficos", 10, "Leve");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Magia da Natureza", "Teleporte"};
    }
}
