package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Curso;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository("repositorioCurso")
public class RepositorioCursoImpl implements  RepositorioCurso{

    @Override
    public List<Curso> cursos() {
        Curso React = new Curso();
        React.setNombreCurso("Curso React Js");
        React.setNombreProfesor("Juan Pablo de la Torre");
        React.setCosto("11,99 US$");

        Curso Flutter = new Curso();
        Flutter.setNombreCurso("Curso Flutter");
        Flutter.setNombreProfesor("Fernando Herrera");
        Flutter.setCosto("12,99 US$");

        Curso SQL = new Curso();
        SQL.setNombreCurso("Curso SQL");
        SQL.setNombreProfesor("Pablo Tilotta");
        SQL.setCosto("Gratis");

        Curso Java = new Curso();
        Java.setNombreCurso("Universidad Java");
        Java.setNombreProfesor("Ing. Ubaldo Acosta");
        Java.setCosto("11,99 US$");

        Curso Node = new Curso();
        Node.setNombreCurso("Curso Node Js");
        Node.setNombreProfesor("Fernando Herrera");
        Node.setCosto("11,99 US$");

        Curso Python = new Curso();
        Python.setNombreCurso("Master en Python");
        Python.setNombreProfesor("Alvaro Chirou");
        Python.setCosto("Gratis");

        List<Curso> cursos = new LinkedList<>();

        cursos.add(React);
        cursos.add(Flutter);
        cursos.add(Java);
        cursos.add(Python);
        cursos.add(Node);
        cursos.add(SQL);

        return  cursos;
    }

    @Override
    public List<Curso> filtradoCurso(String nombre) {
        Curso React = new Curso();
        React.setNombreCurso("React");
        React.setNombreProfesor("Juan Pablo de la Torre");
        React.setCosto("11,99 US$");

        Curso Flutter = new Curso();
        Flutter.setNombreCurso("Flutter");
        Flutter.setNombreProfesor("Fernando Herrera");
        Flutter.setCosto("12,99 US$");

        Curso SQL = new Curso();
        SQL.setNombreCurso("SQL");
        SQL.setNombreProfesor("Pablo Tilotta");
        SQL.setCosto("Gratis");

        Curso Java = new Curso();
        Java.setNombreCurso("Java");
        Java.setNombreProfesor("Ing. Ubaldo Acosta");
        Java.setCosto("11,99 US$");

        Curso Node = new Curso();
        Node.setNombreCurso("Node");
        Node.setNombreProfesor("Fernando Herrera");
        Node.setCosto("11,99 US$");

        Curso Python = new Curso();
        Python.setNombreCurso("Python");
        Python.setNombreProfesor("Alvaro Chirou");
        Python.setCosto("Gratis");

        List<Curso> cursos = new LinkedList<>();

        cursos.add(React);
        cursos.add(Flutter);
        cursos.add(Java);
        cursos.add(Python);
        cursos.add(Node);
        cursos.add(SQL);

        List<Curso> listaFiltrada = new LinkedList<>();
        for(Curso cursoFiltrado : cursos){
            if(cursoFiltrado.getNombreCurso().equals(nombre)){
                listaFiltrada.add(cursoFiltrado);
            }
        }

        return  listaFiltrada;
    }
}
