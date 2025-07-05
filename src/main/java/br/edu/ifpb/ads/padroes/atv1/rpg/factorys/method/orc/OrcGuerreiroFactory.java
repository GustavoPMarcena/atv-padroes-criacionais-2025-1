package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.orc.OrcGuerreiroAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;

public class OrcGuerreiroFactory implements PersonagemFactory {
    private final PersonagemAbstractFactory fabrica = new OrcGuerreiroAbstractFactory();

    @Override
    public Personagem criar(String nome) {
        return new PersonagemBuilder()
                .setNome(nome)
                .setRaca("Orc")
                .setClasse("Guerreiro")
                .setForca(20)
                .setInteligencia(6)
                .setAgilidade(8)
                .setVida(150)
                .setMana(20)
                .setArma(fabrica.criarArma())
                .setArmadura(fabrica.criarArmadura())
                .setHabilidades(fabrica.criarHabilidades())
                .build();
    }
}
