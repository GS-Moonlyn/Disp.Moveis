
public class Cerbero extends Monstro implements Ataque, Defesa, Energia{
         
	
	 
	 public Cerbero(String nome) {
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
		 System.out.println(name() + ": Minha energia: " + ex);
	 }



	 public float atacar() {
			return 100;
		}
		
	 public float defender() {
			return 55;
		}



	 @Override
		public String name() {
			return getName();
		}



	@Override
	public float energia() {
		// TODO Auto-generated method stub
		return 1200;
	}


	
	
	 
}
