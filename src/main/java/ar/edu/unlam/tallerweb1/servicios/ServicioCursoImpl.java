package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Curso;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicioCursoImpl implements ServicioCurso {

    @Autowired
    private RepositorioCurso repositorioCurso;

    @Override
    public List<Curso> todosLosCursos() {
        return repositorioCurso.cursos();
    }

    @Override
    public List<Curso> buscarCurso(String nombre) {
        return repositorioCurso.filtradoCurso(nombre);
    }
}
