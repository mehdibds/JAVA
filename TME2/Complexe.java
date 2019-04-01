public class Complexe{
	private double reelle;
	private double imag;
	
	public Complexe(double reelle,double imag) {
		this.reelle = reelle;
		this.imag = imag;
	}
	
	public Complexe() {
		this(Math.random() * 4 - 2, Math.random() * 4 - 2);
	}

	public String toString(){
		return String.format("(%.3f + %.3fi)", reelle, imag);
	}

	public Complexe addition(Complexe c){
		return new Complexe(reelle + c.reelle,imag + c.imag);
	}

	public Complexe multiplication(Complexe c){
		return new Complexe(reelle * c.reelle - imag * c.imag,reelle*c.imag + imag * c.reelle);
	}

	public boolean estReel(){
		return imag == 0;
	}
}
