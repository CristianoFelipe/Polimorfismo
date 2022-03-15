package br.com.generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro ch = new Cachorro();
		Cavalo cv = new Cavalo();
		Preguica pg = new Preguica();
		
		ch.setNome("Bob");
		ch.setSom("Late");
		ch.setCorre("Sim");
		ch.setIdade(7);
		
		System.out.println("Nome: " + ch.getNome());
		System.out.println("Som: " + ch.getSom());
		System.out.println("Corre: " + ch.getCorre());
		System.out.println("Idade: " + ch.getIdade());
		
		System.out.println();
		

		cv.setNome("Thor");
		cv.setSom("Relinchar");
		cv.setCorre("Sim");
		cv.setIdade(8);
		
		System.out.println("Nome: " + cv.getNome());
		System.out.println("Som: " + cv.getSom());
		System.out.println("Corre: " + cv.getCorre());
		System.out.println("Idade: " + cv.getIdade());

		System.out.println();
		
		pg.setNome("Soneca");
		pg.setSom("Sim");
		pg.setCorre("Nao");
		pg.setIdade(15);
		
		System.out.println("Nome: " + pg.getNome());
		System.out.println("Som: " + pg.getSom());
		System.out.println("Corre: " + pg.getCorre());
		System.out.println("Idade: " + pg.getIdade());


	}

}
