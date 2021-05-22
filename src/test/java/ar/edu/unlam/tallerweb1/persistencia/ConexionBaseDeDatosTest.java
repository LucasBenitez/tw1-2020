package ar.edu.unlam.tallerweb1.persistencia;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Curso;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.*;

// Clase que prueba la conexion a la base de datos. Hereda de SpringTest por lo que corre dentro del contexto
// de spring
public class ConexionBaseDeDatosTest extends SpringTest{

    @Test
    @Transactional @Rollback
    public void pruebaConexion(){
        assertThat(session().isConnected()).isTrue();
    }

    @Test
    @Transactional @Rollback
    public void crearUsuario(){
        Usuario usuario = new Usuario();
        usuario.setEmail("seba@gmail.com");
        usuario.setPassword("1234");
        usuario.setRol("ADMIN");
        session().save(usuario);
        assertThat(usuario.getId()).isNotNull();
    }
    @Test
    @Transactional @Rollback
    public void testUsuario(){
        Usuario usuario = new Usuario();
        usuario.setEmail("babula@gmail.com");
        usuario.setPassword("1122");
        session().save(usuario);
        session().save(usuario);
        assertThat(usuario.getId()).isNotNull();
    }

    @Test
    @Transactional @Rollback
    public void crearCurso(){
        Curso curso = new Curso();
        curso.setNombreProfesor("Juan Pablo de la Torre");
        curso.setNombreCurso("React JS");
        curso.setCosto("Gratis");
        session().save(curso);
        assertThat(curso.getId()).isNotNull();
    }
}


