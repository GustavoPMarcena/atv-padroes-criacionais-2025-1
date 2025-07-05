package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.elfo.ElfoGuerreiroAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;

public class ElfoGuerreiroFactory implements PersonagemFactory {
    private final PersonagemAbstractFactory fabrica = new ElfoGuerreiroAbstractFactory();

    @Override
    public Personagem criar(String nome) {
        return new PersonagemBuilder()
                .setNome(nome)
                .setRaca("Elfo")
                .setClasse("Guerreiro")
                .setForca(12)
                .setInteligencia(14)
                .setAgilidade(16)
                .setVida(100)
                .setMana(60)
                .setArma(fabrica.criarArma())
                .setArmadura(fabrica.criarArmadura())
                .setHabilidades(fabrica.criarHabilidades())
                .build();
    }
}
