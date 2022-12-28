package com.ltp.gradesubmission.service;

import java.util.List;

import com.ltp.gradesubmission.Constant;
import com.ltp.gradesubmission.Grade;
import com.ltp.gradesubmission.repository.GradeRepository;

public class GradeService {

    GradeRepository gradeRepository = new GradeRepository();

    public Grade getGrade(int index) {
        return gradeRepository.getGrade(index);
    }

    public void addGrade(Grade grade) {
        gradeRepository.addGrade(grade);
    }

    public void updateGrade(Grade grade, int index) {
        gradeRepository.updateGrade(grade, index);
    }

    public List<Grade> getGrades() {
        return gradeRepository.getGrades();
    }

    public int getGradeIndex(String id) {
        for (int i = 0; i < getGrades().size(); i++) {
            if (getGrades().get(i).getId().equals(id))
                return i;
        }
        return Constant.NOT_FOUND;
    }

    public Grade getGradeById(String id) {
        int index = getGradeIndex(id);
        return index == Constant.NOT_FOUND ? new Grade() : getGrade(index);
    }

    public void submitGrade(Grade grade) {
        int index = getGradeIndex(grade.getId());
        if (index == Constant.NOT_FOUND) {
            addGrade(grade);
            ;
        } else {
            updateGrade(grade, index);
        }
    }
}
