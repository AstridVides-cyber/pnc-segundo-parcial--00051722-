package com.uca.pncsegundoparcialgestiontareas.domain.dto.request;

import com.uca.pncsegundoparcialgestiontareas.domain.Enums.ProyectoTareasPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Min;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateProyectoTareas {

    @NotBlank(message = "El título no puede estar vacío.")
    private String title;

    private String description;

    @NotNull(message = "La prioridad es requerida.")
    private ProyectoTareasPriority priority;

    @NotNull(message = "Las horas estimadas son requeridas.")
    @Min(value = 1, message = "Las horas estimadas deben ser al menos 1.")
    private Integer estimatedHours;

    @Min(value = 0, message = "Las horas registradas no pueden ser negativas.")
    private Integer loggedHours;

    @NotNull(message = "La fecha de vencimiento es requerida.")
    private LocalDate dueDate;

    @NotBlank(message = "El responsable es requerido.")
    private String assignedTo;
}
