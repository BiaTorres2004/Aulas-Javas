public class Preparador {
/*Aqui a bebida vai ser recebida, é um metodo publico*/ 	
        public void prepararBebidas(Bebida bebida) {
        	
			System.out.println("Preparando a bebida " +  bebida.getNome());
			bebida.preparar();
			
			if(bebida.isAquecer());{
				System.out.println("Aquecendo a bebida " +  bebida.getNome());
}
			System.out.println("Bebida preparada com sucesso!!! \n");
}
        
        
        
        
        
        
        
        
        
                         }
