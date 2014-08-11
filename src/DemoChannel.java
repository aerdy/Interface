
public class DemoChannel {
	int aksi;
	int tombol;
	public void KirimPerintahKeTV(Control tv){
		switch(aksi){
		case 1:
			tv.PindahChannel(tombol);
			break;
		case 2:
			tv.Perbesar(tombol);
			break;
		case 3:
			tv.Perkecil(tombol);
			break;
		}
	}
}
