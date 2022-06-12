/*O que são classes abstratas? São classes que não podem ser intanciada apenas herdada, ela funciona como uma espécie de classe especial não pode ter um objeto criado na sua instanciação*/

public abstract class Item {

	private int posX;
	private int posV;
	
	public void pegar() {
		}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosV() {
		return posV;
	}

	public void setPosV(int posV) {
		this.posV = posV;
	}
}
