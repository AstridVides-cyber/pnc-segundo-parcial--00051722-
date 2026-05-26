package com.uca.pncsegundoparcialgestiontareas.domain.dto.request;

import com.uca.pncsegundoparcialgestiontareas.domain.Enums.ProyectoTareasPriority;
import com.uca.pncsegundoparcialgestiontareas.domain.Enums.ProyectoTareasStatus;
import com.uca.pncsegundoparcialgestiontareas.domain.entities.ProyectoTareas;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProyectoTareas {

    private String title;

    private String description;

    private ProyectoTareasStatus status;

    private ProyectoTareasPriority priority;

    @Min(value = 1, message = "Las horas estimadas deben ser al menos 1.")
    private Integer estimatedHours;

    @Min(value = 0, message = "Las horas registradas no pueden ser negativas.")
    private Integer loggedHours;

    private LocalDate dueDate;

    private String assignedTo;
}