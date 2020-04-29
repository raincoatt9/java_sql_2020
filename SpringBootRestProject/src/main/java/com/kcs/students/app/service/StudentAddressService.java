package com.kcs.students.app.service;


import com.kcs.students.app.dto.StudentAddress;
import com.kcs.students.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentAddressService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentAddress> getStudentsAddresses() {
        String sql = "Select * from student_address";

        return getStudentAddress(sql,null);
    }

    public List<StudentAddress> getStudentAddress(int studentId) {
        String sql ="Select * from student_address where student_id = ?";

        return getStudentAddress(sql,null);
    }
    private List<StudentAddress> getStudentAddress(String sql,Integer studentId){
        List<StudentAddress> studentAddress = new ArrayList<>();

        PreparedStatement preparedStatement = studentRepository.getPreparedStatement(sql);
        if(preparedStatement != null){
            try {
                if(studentId != null){
                    preparedStatement.setInt(1, studentId);
                }
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    studentAddress.add(new StudentAddress(resultSet.getInt("id"),
                            resultSet.getInt("student_Id"),
                            resultSet.getString("country"),
                            resultSet.getString("city"),
                            resultSet.getString("street"),
                            resultSet.getString("post_code")));
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return studentAddress;
    }

    public List<StudentAddress> createStudentAddress(StudentAddress studentAddress) {
        PreparedStatement preparedStatement = studentRepository.getPreparedStatement("insert into student_address(student_id,country,city,street,post_code)values(?,?,?,?,?)");
        if(preparedStatement !=null){
        }
        try{
            assert preparedStatement != null;
                preparedStatement.setInt(1, studentAddress.getStudentId());
                preparedStatement.setString(2, studentAddress.getCountry());
                preparedStatement.setString(3, studentAddress.getCity());
                preparedStatement.setString(4, studentAddress.getStreet());
                preparedStatement.setString(5, studentAddress.getPostCode());

                preparedStatement.execute();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return getStudentAddress("select * from student_address where student_id = ?",studentAddress.getStudentId());
    }

    public void deleteStudentAddress(int studentId, int addressId) {

        PreparedStatement preparedStatement = studentRepository.getPreparedStatement("delete from student_address where student_id=? and id=?");
        if(preparedStatement == null){
            return ;
        }
        try{
            preparedStatement.setInt(1,studentId);
            preparedStatement.setInt(2,addressId);
            preparedStatement.execute();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
