package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Curso;

import java.util.List;

public interface ServicioCurso {

    List<Curso> todosLosCursos();

    List<Curso> buscarCurso(String nombre);

}
