
public class Main {

	public static void main(String[] args) {
			
	Cliente cliente1 = new Cliente(); 
		
           cliente1.setNome("Beatriz");
           cliente1.setCpf(123456);
           cliente1.setNumConta(555555);
           
           System.out.println(cliente1.getNome());
           System.out.println(cliente1.getCpf());
           System.out.println(cliente1.getNumConta());
           
           System.out.println(cliente1);
           
           Cliente cliente2 = new Cliente();
           
          cliente2.setNome("Pedro");
          cliente2.setCpf(561230);
          cliente2.setNumConta(444444);
          
          System.out.println(cliente2);
          
     if(cliente1 == cliente2) {
    	 System.out.println("Os objetos são iguais");
}
     else {
    	 System.out.println("Os objetos são diferentes");
}		
     if(cliente1.equals(cliente2)) {
    	 System.out.println("Os objetos são iguais");    
}
     else {
    	 System.out.println("Os objetos são diferentes"); 
}
                                              }
		
		

                  }
