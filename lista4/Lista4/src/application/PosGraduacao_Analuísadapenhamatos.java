package application;

import entities.Pessoas;

public class PosGraduacao_Analuísadapenhamatos extends Pessoas {
	private String cursoPosgraduacao;

    

    public String getCursoPosgraduacao() {
        return cursoPosgraduacao;
    }

    public void setCursoPosgraduacao(String cursoPosgraduacao) {
        this.cursoPosgraduacao = cursoPosgraduacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Curso de Pós-Graduação: " + cursoPosgraduacao;
    }

}
