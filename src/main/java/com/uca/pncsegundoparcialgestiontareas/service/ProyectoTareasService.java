package com.uca.pncsegundoparcialgestiontareas.service;


import com.uca.pncsegundoparcialgestiontareas.domain.Enums.ProyectoTareasPriority;
import com.uca.pncsegundoparcialgestiontareas.domain.dto.reponse.GeneralReponse;
import com.uca.pncsegundoparcialgestiontareas.domain.dto.request.CreateProyectoTareas;
import com.uca.pncsegundoparcialgestiontareas.domain.dto.request.UpdateProyectoTareas;

public interface TaskService {

    GeneralReponse createTask(CreateProyectoTareas request);

    GeneralReponse getAllTasks(UpdateProyectoTareasStatus status, ProyectoTareasPriority priority);

    GeneralReponse getTaskById(Long id);

    GeneralReponse updateTask(Long id, UpdateProyectoTareas request);

    GeneralReponse deleteTask(Long id);
}
