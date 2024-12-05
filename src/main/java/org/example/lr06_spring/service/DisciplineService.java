package org.example.lr06_spring.service;

import org.example.lr06_spring.entity.Discipline;

import java.util.List;

public interface DisciplineService {

    List<Discipline> getAllDisciplines();

    Discipline saveDiscipline(Discipline discipline);

    Discipline getDiscipline(int id);

    void deleteDiscipline(int id);
}
