package org.example.lr06_spring.dao;

import org.example.lr06_spring.entity.Discipline;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplineDAO {

    List<Discipline> getAllDisciplines();

    Discipline getDiscipline(int id);

    void deleteDiscipline(int id);

    Discipline saveDiscipline(Discipline discipline);
}
