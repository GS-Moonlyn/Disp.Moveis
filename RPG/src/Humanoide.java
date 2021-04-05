
public abstract class Humanoide extends Personagem{
	private String nome;
	 private int x, y;
	 
	 public Humanoide(String nome) {
		super(nome);
	 }
	 
	 public void setName(String nome) {
		 this.nome = nome;
	 }
	 
	 public String getName() {
		 return nome;		 
	 }
	 
	 public abstract void emitirSom(); 
	 
	 public void deslocar(int dx, int dy) {
		 this.x += dx;
		 this.y += dy;
		 
	 }
	 
	 public void energia(int ex) {
		 ex = 100 ;
	 }
	 
	 public void exp(int xx) {
		 xx = xx++ ;
	 }
	 
	 public void imprimirPosicao() {
		 System.out.println("Posicao - x: " + x + " y: " + y);
	 }
	 
	 public float calcularDistancia(Humanoide animal) {
		 float _x = (this.x - animal.x);
		 float _y = (this.y - animal.y);
		 
		 float res = (float) Math.sqrt(Math.pow(_x,  2) + Math.pow(_y, 2));
		 return res;
	 }
	 
	 public void setPosition(int x, int y) {
		 this.x = x;
		 this.y = y;
	 }

	
}
