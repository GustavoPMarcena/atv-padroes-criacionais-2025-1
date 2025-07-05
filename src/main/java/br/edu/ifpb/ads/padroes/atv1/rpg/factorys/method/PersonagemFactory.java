package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;

public interface PersonagemFactory {
    Personagem criar(String nome);
}
