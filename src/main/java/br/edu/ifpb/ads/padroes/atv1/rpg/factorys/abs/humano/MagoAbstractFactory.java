package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;

public class MagoAbstractFactory implements PersonagemAbstractFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Cajado Mágico", 15, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Mágicas", 8, "Leve");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Bola de Fogo", "Cura"};
    }
}
