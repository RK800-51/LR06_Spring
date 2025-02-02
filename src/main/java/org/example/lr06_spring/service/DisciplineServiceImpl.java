package org.example.lr06_spring.service;

import org.example.lr06_spring.dao.DisciplineDAO;
import org.example.lr06_spring.entity.Discipline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplineServiceImpl implements DisciplineService {

    @Autowired
    private DisciplineDAO disciplineDAO;

    @Override
    public List<Discipline> getAllDisciplines() {
        return disciplineDAO.getAllDisciplines();
    }

    @Override
    public Discipline saveDiscipline(Discipline discipline) {
        return disciplineDAO.saveDiscipline(discipline);
    }

    @Override
    public Discipline getDiscipline(int id) {
        return disciplineDAO.getDiscipline(id);
    }

    @Override
    public void deleteDiscipline(int id) {
        disciplineDAO.deleteDiscipline(id);
    }
}
