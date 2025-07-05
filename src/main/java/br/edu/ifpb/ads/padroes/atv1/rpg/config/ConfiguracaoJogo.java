package br.edu.ifpb.ads.padroes.atv1.rpg.config;

public class ConfiguracaoJogo {

    private static ConfiguracaoJogo configuracaoJogo;
    private int nivelDificuldade;

    public ConfiguracaoJogo() {
        this.nivelDificuldade = 1;
    }

    public static ConfiguracaoJogo getInstance() {
        if (configuracaoJogo == null) configuracaoJogo = new ConfiguracaoJogo();
        return configuracaoJogo;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivel) {
        this.nivelDificuldade = nivel;
    }

}

