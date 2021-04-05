
public class Engia extends Monstro implements Ataque, Defesa, Energia{
         
	
	 
	 public Engia(String nome) {
		 super(nome);
	 }
	 
	 
	 
	 public void emitirSom() {
		 System.out.println(name() + ": Au au!!");
	 }
	 
	 public void deslocar(int dx, int dy) {
		 super.deslocar(dx,  dy);
		 System.out.println(name() + ": Eu andei um total em x de " + dx +
				 " e y " + dy);
	 }
	 
	 public void energia(int ex) {
		 super.energia(ex);
		 System.out.println(name() + ": Minha energia é: " + ex);
	 }



	
	
	public float atacar() {
		return 100;
	}
	
	public float defender() {
		return 40;
	}



	@Override
	public String name() {
		return getName();
	}



	@Override
	public float energia() {
		// TODO Auto-generated method stub
		return 044;
	}


	
	
	 
}
