package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.humano.ArqueiroAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;

public class ArqueiroFactory implements PersonagemFactory {
    private final PersonagemAbstractFactory fabrica = new ArqueiroAbstractFactory();

    @Override
    public Personagem criar(String nome) {
        return new PersonagemBuilder()
                .setNome(nome)
                .setRaca("Humano")
                .setClasse("Arqueiro")
                .setForca(10)
                .setInteligencia(12)
                .setAgilidade(16)
                .setVida(100)
                .setMana(70)
                .setArma(fabrica.criarArma())
                .setArmadura(fabrica.criarArmadura())
                .setHabilidades(fabrica.criarHabilidades())
                .build();
    }
}
