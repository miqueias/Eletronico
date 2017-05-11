
public class TV extends Eletronico implements IEletronico {
	int canal;
	
	
	TV() {
		
	}
	
	void aumentaCanal() {
		canal++;
	}
	
	void diminuiCanal() {
		canal--;
	}

	@Override
	public void mudarVolume(int novoVolume) {
		// TODO Auto-generated method stub
		
	}
	
	
}
