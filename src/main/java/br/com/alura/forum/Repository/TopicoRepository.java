package br.com.alura.forum.Repository;

import br.com.alura.forum.modelo.Topico;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findByCursoNome(String nomeCurso);
}
