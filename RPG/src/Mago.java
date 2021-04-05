
public class Mago extends Humanóide implements Ataque, Defesa, Energia, Experiencia{
         
	
	 
	 public Mago(String nome) {
		 super(nome);
	 }
	 
	 
	 
	 public void emitirSom() {
		 System.out.println(name() + ": uaa!!");
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
	 
	 public void experiencia(int xx) {
		 super.exp(xx);
		 System.out.println(name() + ": Minha experiencia é: " + xx);
	 }



	 @Override
		public float atacar() {
			return 10;
		}
	 
	 @Override
		public float defender() {
			return 20;
		}


		@Override
		public String name() {
			return getName();
		}



		@Override
		public float energia() {
			// TODO Auto-generated method stub
			return 123;
		}



		@Override
		public float exp() {
			// TODO Auto-generated method stub
			return 0;
		}



		
		 



	
	
	 
}
