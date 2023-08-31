package streamWork.comparator;

import streamWork.dto.Student;

import java.util.Comparator;

public class ComparatorAssessment implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        double assessment1 = o1.getAssessment();
        double assessment2 = o2.getAssessment();
        if(assessment1-assessment2<0){
            return 1;
        } else if (assessment1-assessment2>0) {
            return -1;
        }else {
            return 0;
        }
    }
}
