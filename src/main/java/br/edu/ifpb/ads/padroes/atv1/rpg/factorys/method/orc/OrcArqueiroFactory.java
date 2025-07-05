package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.orc.OrcArqueiroAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;

public class OrcArqueiroFactory implements PersonagemFactory {
    private final PersonagemAbstractFactory fabrica = new OrcArqueiroAbstractFactory();

    @Override
    public Personagem criar(String nome) {
        return new PersonagemBuilder()
                .setNome(nome)
                .setRaca("Orc")
                .setClasse("Arqueiro")
                .setForca(14)
                .setInteligencia(8)
                .setAgilidade(12)
                .setVida(120)
                .setMana(40)
                .setArma(fabrica.criarArma())
                .setArmadura(fabrica.criarArmadura())
                .setHabilidades(fabrica.criarHabilidades())
                .build();
    }
}
