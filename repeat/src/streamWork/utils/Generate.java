package streamWork.utils;

import streamWork.Supplier.SupplierStudents;
import streamWork.dto.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generate {
    public List<Student> generate(){
        return (List<Student>) Stream.generate(new SupplierStudents())
                .limit(10_000).collect(Collectors.toUnmodifiableList());
    }
}
