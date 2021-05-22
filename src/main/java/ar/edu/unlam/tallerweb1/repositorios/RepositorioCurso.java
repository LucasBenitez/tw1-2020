package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Curso;

import java.util.List;

public interface RepositorioCurso {

    //Curso consultarCurso (Curso curso);

    List<Curso> cursos();

    List<Curso> filtradoCurso(String nombre);
}
