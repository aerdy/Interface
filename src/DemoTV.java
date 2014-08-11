
public class DemoTV {
	public static void main(String[] args) {
		TVPolitron tvp=new TVPolitron();
		TVSamsung tvs=new TVSamsung();
		DemoChannel dc=new DemoChannel();
		
		dc.KirimPerintahKeTV(tvp);
		dc.KirimPerintahKeTV(tvs);
	}
}
