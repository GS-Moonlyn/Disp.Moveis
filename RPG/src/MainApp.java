
public class MainApp {

	public static void main(String[] args) {
		
		
		
		Mago a1 = new Mago("Mago");
		a1.setPosition(10,20); 
		
		Guerreiro b1 = new Guerreiro("Guerreiro");
		b1.setPosition(30, 10);
		
		Templario c1 = new Templario("Templario");
		c1.setPosition(70, 20);
		
		Ladino d1 = new Ladino("Ladino");
		d1.setPosition(60, 60);
		
		Engia e1 = new Engia("Engia");
		e1.setPosition(30, 70);
		
		Cerbero f1 = new Cerbero("Cerbero");
		f1.setPosition(50, 20);
		
	
		a1.emitirSom();
		
		b1.energia(100);
		b1.experiencia(0);
		
		
		
		b1.emitirSom();
		
		//a1.deslocar(30, 10);
		
		ataque1(a1, b1, c1, d1, e1, f1);
		
		defesa1(a1, b1, c1, d1, e1, f1);
		
		ataque2(a1, b1, c1, d1, e1, f1);
		
		defesa2(a1, b1, c1, d1, e1, f1);
		
		ataque3(a1, b1, c1, d1, e1, f1);
		
		b1.experiencia(1);
		
		
		System.out.println("Distancia B1 ate C1: "
			+ b1.calcularDistancia(c1));
		
		b1.emitirSom3();
		
		b1.deslocar(-17, 22);
		
		ataque4(a1, b1, c1, d1, e1, f1);
		
		defesa3(a1, b1, c1, d1, e1, f1);
		
		ataque5(a1, b1, c1, d1, e1, f1);
		
		
		defesa4(a1, b1, c1, d1, e1, f1);
		
		ataque6(a1, b1, c1, d1, e1, f1);
		b1.experiencia(2);
		
		
		b1.emitirSom4();
		
		System.out.println("Distancia B1 ate D1: "
						+b1.calcularDistancia(d1));
		
		System.out.println("Distancia B1 ate A1: "
						+b1.calcularDistancia(a1));

		b1.emitirSom5();
		b1.deslocar(30, 10);
		
		ataque7(a1, b1, c1, d1, e1, f1);
		
		defesa5(a1, b1, c1, d1, e1, f1);
		
		ataque8(a1, b1, c1, d1, e1, f1);
		
		defesa6(a1, b1, c1, d1, e1, f1);
		
		ataque9(a1, b1, c1, d1, e1, f1);
		b1.experiencia(4);
		
		
		ataque10(a1, b1, c1, d1, e1, f1);
		
		System.out.println("Vencedor: " + b1.getName()
				);
		b1.experiencia(6);
		
		
	}


	public static void ataque1(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(b1.name() + " com " + b1.atacar() + " de ataque "
				+ "atacou " + d1.name() + " com uma espadada");

		
		}
    
	
	
    public static void defesa1(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(d1.name() + " defendeu " + d1.defender() + " por cento"
				+ " do ataque do: " + b1.name());
		
		
		
		
	}
    
    public static void ataque2(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(d1.name() + " com " + d1.atacar() + " de ataque "
				+ "atacou " + b1.name() + " com uma facada");
		
	}
    
    public static void defesa2(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(b1.name() + " defendeu " + b1.defender() + " por cento"
				+ " do ataque do: " + d1.name());
		
	}
    
    
    public static void ataque3(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(b1.name() + " com " + b1.atacar() + " de ataque "
				+ "atacou " + d1.name() + " com uma facada");
		
		System.out.println(d1.name() + " Morreu");
		
	}
    
    public static void ataque4(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(b1.name() + " com " + b1.atacar() + " de ataque "
				+ "atacou " + c1.name() + " com uma espadada");
		
	}
    
    public static void defesa3(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(c1.name() + " defendeu " + c1.defender() + " por cento"
				+ " do ataque do: " + b1.name());
	}
    
    public static void ataque5(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(c1.name() + " com " + c1.atacar() + " de ataque "
				+ "atacou " + b1.name() + " com uma apunhalada");
		
	}
    
    public static void defesa4(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(b1.name() + " defendeu " + b1.defender() + " por cento"
				+ " do ataque do: " + c1.name());
	}
    
    public static void ataque6(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(b1.name() + " com " + b1.atacar() + " de ataque "
				+ "atacou " + c1.name() + " com uma espadada");
		
		System.out.println(c1.name() + " Morreu");
	}
    
    
    public static void ataque7(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
 		
		System.out.println(b1.name() + " com " + b1.atacar() + " de ataque "
				+ "atacou " + a1.name() + " com uma espadada");
		
		
	}
    
    public static void defesa5(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(a1.name() + " defendeu " + a1.defender() + " por cento"
				+ " do ataque do: " + b1.name());
	}
    
    public static void ataque8(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
 		
		System.out.println(a1.name() + " com " + a1.atacar() + " de ataque "
				+ "atacou " + b1.name() + " com uma magia");
	}
    
    public static void defesa6(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(b1.name() + " defendeu " + b1.defender() + " por cento"
				+ " do ataque do: " + a1.name());
	}
    
    public static void ataque9(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(b1.name() + " com " + b1.atacar() + " de ataque "
				+ "atacou " + a1.name() + " com uma espadada");
		
		System.out.println(a1.name() + " Morreu");
	}
    
    public static void ataque10(Mago a1, Guerreiro b1, Templario c1, Ladino d1, Engia e1, Cerbero f1) {
		
		System.out.println(b1.name() + " com " + b1.atacar() + " de ataque "
				+ "atacou " + e1.name() + " e " + f1.name() + " com uma espadada em cada");
		
		System.out.println(e1.name() + " e " + f1.name() +  " Morreram");
	}

}
