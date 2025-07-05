package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public interface PersonagemAbstractFactory {
    Arma criarArma();
    Armadura criarArmadura();
    String[] criarHabilidades();
}
