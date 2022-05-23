//*Enum: O enum serve para amazenar valores cosntantes(Fixos), ou seja valores que NÃO podem ser modificados.Ele funciona como um tipo de classe especial. 

public enum DiaDaSemana {
         DOMINGO(1), 
         SEGUNDA(2),
         TERCA(3), 
         QUARTA(4),
         QUINTA(5),
         SEXTA(6),
         SABADO(7);
	
	private int num; 
	
	private DiaDaSemana(int num) {
		this.num = num;
		
		
}
	
	public int getNum() {
		return num;
		
}
         
	
                       }
