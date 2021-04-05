
public class Templario extends Humanoide implements Ataque, Defesa, Energia, Experiencia{
         
	
	 
	 public Templario(String nome) {
		 super(nome);
	 }
	 
	 
	 
	 public void emitirSom() {
		 System.out.println(":Au au!!");
	 }
	 
	 
	 public void deslocar(int dx, int dy) {
		 super.deslocar(dx,  dy);
		 System.out.println(name() + ": Eu andei um total em x de " + dx +
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
		return 50;
	}



	@Override
	public String name() {
		return getName();
	}



	@Override
	public float energia() {
		// TODO Auto-generated method stub
		return 410;
	}



	@Override
	public float exp() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	 
}
