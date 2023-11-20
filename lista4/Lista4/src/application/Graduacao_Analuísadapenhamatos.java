package application;
import entities.Pessoas;

public class Graduacao_Analuísadapenhamatos extends Pessoas {
	 private String cursoGraduacao;

	   

	    @Override
	    public String toString() {
	        return super.toString() + ", Curso de Graduação: " + cursoGraduacao;
	    }

		public void setCursoGraduacao(String nextLine) {
			
		}
}
