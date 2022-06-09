
public enum Sexo {
	
	MASCULINO(1), FEMININO(2);
	
	


	public int getNum() {
		return num;
	}





	public void setNum(int num) {
		this.num = num;
	}

	private int num;

	
	private Sexo(int num) {
		this.num = num;
	}
	
	
	
}
