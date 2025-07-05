package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.humano.PersonagemEspecialAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;

public class PersonagemEspecialFactory implements PersonagemFactory {
    private final PersonagemAbstractFactory factory = new PersonagemEspecialAbstractFactory();

    @Override
    public Personagem criar(String nome) {
        return new PersonagemBuilder()
                .setNome(nome + " o Lendário")
                .setRaca("Humano")
                .setClasse("Guerreiro")
                .setForca(18)
                .setInteligencia(10)
                .setAgilidade(12)
                .setVida(140)
                .setMana(40)
                .setArma(factory.criarArma())
                .setArmadura(factory.criarArmadura())
                .setHabilidades(factory.criarHabilidades())
                .build();
    }
}
