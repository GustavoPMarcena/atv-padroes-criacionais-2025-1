package br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.PersonagemAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.abs.elfo.ElfoMagoAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;

public class ElfoMagoFactory implements PersonagemFactory {
    private final PersonagemAbstractFactory fabrica = new ElfoMagoAbstractFactory();

    @Override
    public Personagem criar(String nome) {
        return new PersonagemBuilder()
                .setNome(nome)
                .setRaca("Elfo")
                .setClasse("Mago")
                .setForca(4)
                .setInteligencia(20)
                .setAgilidade(14)
                .setVida(70)
                .setMana(180)
                .setArma(fabrica.criarArma())
                .setArmadura(fabrica.criarArmadura())
                .setHabilidades(fabrica.criarHabilidades())
                .build();
    }
}
