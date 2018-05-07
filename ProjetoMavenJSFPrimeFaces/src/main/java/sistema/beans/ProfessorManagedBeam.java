package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.modelos.Professor;
import sistema.service.ProfessorService;

@ManagedBean
@SessionScoped
public class ProfessorManagedBeam {
	
	private Professor professor = new Professor();	
	private ProfessorService service = new ProfessorService();
	
	
	public void salvar()
	{
		service.salvar(professor);
		professor = new Professor();
		
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setAluno(Professor professor) {
		this.professor = professor;
	}

	public List<Professor> getProfessores() {
		return service.getProfessores();
	}

	
	
	

}
