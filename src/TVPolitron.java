
public class TVPolitron implements Control {
	String[] channel={"RCTI","ANTV","SCTV","TRANSTV"};
	public void PindahChannel(int Channel){
		System.out.println("Pindah channel pada TV Politron pada ke"+this.channel[Channel]);
		
	}
	public void Perbesar(int Intercitas){
		System.out.println("Perbesar volume sebesar"+Intercitas);
	}
	public void Perkecil(int Intercitas){
		System.out.println("Perkecil volume sekecil"+Intercitas);
	}

}
