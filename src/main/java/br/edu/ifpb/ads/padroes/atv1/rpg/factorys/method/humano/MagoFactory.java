package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.humano.MagoAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.*;

public class MagoFactory implements PersonagemFactory {
    private final PersonagemAbstractFactory fabrica = new MagoAbstractFactory();

    @Override
    public Personagem criar(String nome) {
        return new PersonagemBuilder()
                .setNome(nome)
                .setRaca("Humano")
                .setClasse("Mago")
                .setForca(6)
                .setInteligencia(18)
                .setAgilidade(8)
                .setVida(80)
                .setMana(150)
                .setArma(fabrica.criarArma())
                .setArmadura(fabrica.criarArmadura())
                .setHabilidades(fabrica.criarHabilidades())
                .build();
    }
}
