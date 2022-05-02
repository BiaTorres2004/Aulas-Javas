import java.util.Objects;

public class Cliente {
	
		private String nome; 
		private int cpf;
		private int NumConta; 

		
		plubic Cliente() {
			
}

		@Override
		public int hashCode() {
			return Objects.hash(NumConta, cpf, nome);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			return NumConta == other.NumConta && cpf == other.cpf && Objects.equals(nome, other.nome);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

		public int getNumConta() {
			return NumConta;
		}

		public void setNumConta(int numConta) {
			this.NumConta = numConta;
		}
		
		
	
		
                    }
