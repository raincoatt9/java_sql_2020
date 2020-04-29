package com.kcs.students.app.service;

import com.kcs.students.app.dto.Student;
import com.kcs.students.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        PreparedStatement preparedStatement = studentRepository.getPreparedStatement("SELECT * from students");
        if(preparedStatement != null){
            try {
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    students.add(new Student(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("surname"),
                            resultSet.getString("email"),
                            resultSet.getString("phone")));
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

        return students;

    }

    public Student getStudent(int id){

       PreparedStatement preparedStatement = studentRepository.getPreparedStatement("SELECT * FROM students where id = ?");
                if(preparedStatement == null){
                    return null;
                }
                try {
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){
                        return new Student(resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getString("surname"),
                                resultSet.getString("email"),
                                resultSet.getString("phone"));
                    }
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
                return null;
    }

    public Student createStudent(Student student){
       PreparedStatement preparedStatement = studentRepository.getPreparedStatement("insert into students(name,surname,phone,email)values(?,?,?,?)");
        if(preparedStatement ==null){
            return null;
        }
        try{
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getSurname());
            preparedStatement.setString(3,student.getPhone());
            preparedStatement.setString(4,student.getEmail());

            preparedStatement.execute();
            return getStudents().stream()
                    .filter(s -> s.equals(student))
                    .findFirst()
                    .orElse(null);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void deleteStudent(int id) {
        PreparedStatement preparedStatement = studentRepository.getPreparedStatement("delete from students where id=?");
        if(preparedStatement == null){
            return ;
        }
        try{
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        }


    public Student updateStudent(Student student) {
        PreparedStatement preparedStatement = studentRepository.getPreparedStatement("update students set name=?,surname=?,phone=?,email=? where id=?");
        if(preparedStatement == null){
            return null;
        }
        try{
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getSurname());
            preparedStatement.setString(3,student.getPhone());
            preparedStatement.setString(4,student.getEmail());
            preparedStatement.setInt(5,student.getId());
            preparedStatement.execute();

            return student;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
