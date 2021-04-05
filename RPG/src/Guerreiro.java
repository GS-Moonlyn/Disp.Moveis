
public class Guerreiro extends Humanoide implements Ataque, Defesa, Energia, Experiencia{
         
	
	 
	 public Guerreiro(String nome) {
		 super(nome);
	 }
	 
	 
	 
	 public void emitirSom() {
		 System.out.println(name() + ": Bora cacar alguem");
	 }
	 
	 public void emitirSom2() {
		 System.out.println(name() + ": Vai ser tu mesmo!!");
	 }
	 
	 public void emitirSom3() {
		 System.out.println(name() + ": Hmm, vou para la!!");
	 }


	 public void emitirSom4() {
		 System.out.println(name() + ": Quem sera o proximo?!");
	 }
	 
	 public void emitirSom5() {
		 System.out.println(name() + ": Achei a vitima!");
	 }
	 
	 public void deslocar(int dx, int dy) {
		 super.deslocar(dx,  dy);
		 System.out.println(name()+ ": Eu andei um total em x de " + dx +
				 " e y " + dy);
	 }
	 
	 public void energia(int ex) {
		 super.energia(ex);
		 System.out.println(name() + ": Minha energia: " + ex);
	 }
	 
	 public void experiencia(int xx) {
		 super.exp(xx);
		 System.out.println(name() + ": Minha experiencia: " + xx);
	 }



	
	
	public float atacar() {
		return 100;
	}
	
	
	public float defender() {
		return 25;
	}



	@Override
	public String name() {
		return getName();
	}



	@Override
	public float energia() {
		// TODO Auto-generated method stub
		return 0122;
	}



	@Override
	public float exp() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	 
}
