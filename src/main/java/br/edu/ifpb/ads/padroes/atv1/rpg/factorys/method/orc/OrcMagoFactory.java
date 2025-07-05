package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.orc.OrcMagoAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;

public class OrcMagoFactory implements PersonagemFactory    {
    private final PersonagemAbstractFactory fabrica = new OrcMagoAbstractFactory();

    @Override
    public Personagem criar(String nome) {
        return new PersonagemBuilder()
                .setNome(nome)
                .setRaca("Orc")
                .setClasse("Mago")
                .setForca(10)
                .setInteligencia(14)
                .setAgilidade(6)
                .setVida(100)
                .setMana(120)
                .setArma(fabrica.criarArma())
                .setArmadura(fabrica.criarArmadura())
                .setHabilidades(fabrica.criarHabilidades())
                .build();
    }
}
