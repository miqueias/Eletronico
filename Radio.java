
public class Radio extends Eletronico implements IEletronico {
	
	int estacao;
	final int MAX_VOLUME = 50;
	
	Radio() {
		
	}
	
	
	
	void aumentaVolume() {
		if(volume < MAX_VOLUME) {
			volume = volume + 2;
		}
	}
	
	void aumentaEstacao() {
		estacao++;
	}
	
	void diminuiEstacao() {
		estacao--;
	}



	@Override
	public void mudarVolume(int novoVolume) {
		// TODO Auto-generated method stub
		
	}
	
	
}
