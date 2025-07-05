package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.elfo.ElfoArqueiroAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;

public class ElfoArqueiroFactory implements PersonagemFactory {
    private final PersonagemAbstractFactory fabrica = new ElfoArqueiroAbstractFactory();

    @Override
    public Personagem criar(String nome) {
        return new PersonagemBuilder()
                .setNome(nome)
                .setRaca("Elfo")
                .setClasse("Arqueiro")
                .setForca(8)
                .setInteligencia(16)
                .setAgilidade(20)
                .setVida(90)
                .setMana(100)
                .setArma(fabrica.criarArma())
                .setArmadura(fabrica.criarArmadura())
                .setHabilidades(fabrica.criarHabilidades())
                .build();
    }
}
