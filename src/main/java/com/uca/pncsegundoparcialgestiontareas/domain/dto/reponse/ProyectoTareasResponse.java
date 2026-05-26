package com.uca.pncsegundoparcialgestiontareas.domain.dto.reponse;

import com.uca.pncsegundoparcialgestiontareas.domain.Enums.ProyectoTareasPriority;
import com.uca.pncsegundoparcialgestiontareas.domain.Enums.ProyectoTareasStatus;
import com.uca.pncsegundoparcialgestiontareas.domain.entities.ProyectoTareas;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProyectoTareasResponse {

    private Long id;

    private String title;

    private String description;

    private ProyectoTareasStatus status;

    private ProyectoTareasPriority priority;

    private Integer estimatedHours;

    private Integer loggedHours;

    private LocalDate dueDate;

    private String assignedTo;

    private Boolean active;
}
