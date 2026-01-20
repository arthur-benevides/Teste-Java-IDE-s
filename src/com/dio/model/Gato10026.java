package com.dio.model;

import java.util.Objects;

public class Gato10026 {
		
			private String nome;
			private String cor;
			private Integer idade;
			
			public Gato10026() {}

			public Gato10026(String nome, String cor, Integer idade) {
				super();
				this.nome = nome;
				this.cor = cor;
				this.idade = idade;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getCor() {
				return cor;
			}

			public void setCor(String cor) {
				this.cor = cor;
			}

			public Integer getIdade() {
				return idade;
			}

			public void setIdade(Integer idade) {
				this.idade = idade;
			}

			@Override
			public int hashCode() {
				return Objects.hash(cor, idade, nome);
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Gato10026 other = (Gato10026) obj;
				return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade)
						&& Objects.equals(nome, other.nome);
			}

			@Override
			public String toString() {
				return "Gato10026 [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
			}
			

			
			
			/*lic Gato(String nome, String cor, Integer idade) {
				this.nome= nome;
				this.cor = cor;
				this.idade = idade;
			}*/
			
			

		
	

}
