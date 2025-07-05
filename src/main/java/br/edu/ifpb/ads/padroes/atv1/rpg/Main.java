package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.PersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.elfo.ElfoArqueiroFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.elfo.ElfoGuerreiroFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.elfo.ElfoMagoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.humano.ArqueiroFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.humano.GuerreiroFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.humano.MagoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.humano.PersonagemEspecialFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.orc.OrcArqueiroFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.orc.OrcGuerreiroFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorys.method.orc.OrcMagoFactory;

public class Main {
    public static void main(String[] args) {
        // Testes, muitos testes
        PersonagemFactory guerreiroHumano = new GuerreiroFactory();
        Personagem adam = guerreiroHumano.criar("Adam");
        System.out.println(adam);

        PersonagemFactory magoHumano = new MagoFactory();
        Personagem merlin = magoHumano.criar("Merlin");
        System.out.println(merlin);

        PersonagemFactory arqueiroHumano = new ArqueiroFactory();
        Personagem robin = arqueiroHumano.criar("Robin");
        System.out.println(robin);

        // Elfo
        PersonagemFactory guerreiroElfo = new ElfoGuerreiroFactory();
        Personagem legolas = guerreiroElfo.criar("Legolas");
        System.out.println(legolas);

        PersonagemFactory magoElfo = new ElfoMagoFactory();
        Personagem elrond = magoElfo.criar("Elrond");
        System.out.println(elrond);

        PersonagemFactory arqueiroElfo = new ElfoArqueiroFactory();
        Personagem tauriel = arqueiroElfo.criar("Tauriel");
        System.out.println(tauriel);

        // Orc
        PersonagemFactory guerreiroOrc = new OrcGuerreiroFactory();
        Personagem grok = guerreiroOrc.criar("Grok");
        System.out.println(grok);

        PersonagemFactory magoOrc = new OrcMagoFactory();
        Personagem zurg = magoOrc.criar("Zurg");
        System.out.println(zurg);

        PersonagemFactory arqueiroOrc = new OrcArqueiroFactory();
        Personagem thrall = arqueiroOrc.criar("Thrall");
        System.out.println(thrall);

        // Especial
        PersonagemFactory especial = new PersonagemEspecialFactory();
        Personagem reiArthur = especial.criar("Arthur");
        System.out.println(reiArthur);
    }
}
