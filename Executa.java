public class Executa {
	public static void main(String[] args) {
		TV tv =  new TV();
		
		tv.aumentaVolume();
		tv.ligar();
		tv.aumentaCanal();
		tv.mudarVolume(90);
		if(tv.ligado == true) {
			System.out.println("TV Ligada!");
		} else {
			System.out.println("TV Desligada!");
		}
		System.out.println("Volume: " + tv.volume);
		System.out.println("Canal: " + tv.canal);
		
		Radio rd = new Radio();
		
		rd.mudarVolume(88);
		rd.aumentaVolume();
		rd.aumentaEstacao();
		rd.desligar();
		if(rd.ligado == true) {
			System.out.println("Rádio Ligado!");
		} else {
			System.out.println("Rádio Desligado!");
		}
		System.out.println("Volume: " + rd.volume);
		System.out.println("Estação: " + rd.estacao);
	}

}
