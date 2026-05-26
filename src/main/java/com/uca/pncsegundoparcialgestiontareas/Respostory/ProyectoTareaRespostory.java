package com.uca.pncsegundoparcialgestiontareas.Respostory;

import com.uca.pncsegundoparcialgestiontareas.domain.entities.ProyectoTareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoTareaRespostory extends JpaRepository<ProyectoTareas, Long> {

}
