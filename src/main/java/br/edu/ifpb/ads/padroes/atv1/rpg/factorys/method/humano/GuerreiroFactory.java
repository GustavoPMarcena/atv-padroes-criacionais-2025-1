package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.humano.GuerreiroAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;

public class GuerreiroFactory implements PersonagemFactory {

    PersonagemAbstractFactory guerreiroFactory = new GuerreiroAbstractFactory();

    @Override
    public Personagem criar(String nome) {
        return new PersonagemBuilder()
                .setNome(nome)
                .setRaca("Humano")
                .setClasse("Guerreiro")
                .setForca(15)
                .setInteligencia(8)
                .setAgilidade(10)
                .setVida(120)
                .setMana(30)
                .setArma(guerreiroFactory.criarArma())
                .setArmadura(guerreiroFactory.criarArmadura())
                .setHabilidades(guerreiroFactory.criarHabilidades())
                .build();
    }
}
