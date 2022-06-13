
public class Aplicação {

	public static void main(String[] args) {
		
/*Construtor que procura o veiculo*/ 
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Honda");
		veiculo.setModelo("City");
		veiculo.setAno(2013);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		Carro carro = new Carro();
		
		carro.setMarca("Honda");
		carro.setModelo("Fit");
		carro.setAno(2014);
/*Verifica se ele tem quarto portas*/ 
		carro.setQuatroPortas(true); 
        System.out.println();
        carro.imprimir();
        carro.buzinar();
        
        Caminhao caminhao = new Caminhao();
        
        caminhao.setMarca("SCANIA");
        caminhao.setModelo("XJT76");
        caminhao.setAno(2014);
        
        veiculo.imprimir();
		veiculo.buzinar();
		
        Moto moto = new Moto();
        
        moto.setMarca("Honda");
        moto.setModelo("600RR");
        moto.setAno(2020);
        
        

        
        

		
      
        
        
	
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	                                    }

                       }
