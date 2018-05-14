package sistema.modelos;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor implements Serializable{


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int registro;
	
	private String nome;
	private String curso;
	
	public int getRegistro() {
		return registro;
	}
	public void setMatricula(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + registro;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (registro != other.registro)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + registro + ", nome=" + nome + ", curso=" + curso + "]";
	}
	
	
	
	
	

}
