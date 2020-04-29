package com.kcs.students.app.controller;


import com.kcs.students.app.dto.Student;
import com.kcs.students.app.dto.StudentAddress;
import com.kcs.students.app.service.StudentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students/addresses")
public class StudentAddressController {

    @Autowired
    private StudentAddressService studentAddressService;

    @GetMapping
    public List<StudentAddress> getStudentsAddresses(){
        return studentAddressService.getStudentsAddresses();

    }

    @GetMapping("/{studentId}/address")
        public List<StudentAddress> getStudentAddress(@PathVariable("studentId")int studentId) {
            return studentAddressService.getStudentAddress(studentId);
        }

    @PostMapping("/{studentId}/student/save")
    public List<StudentAddress> createStudentAddress(@RequestBody StudentAddress studentAddress,@PathVariable("studentId")int studentId){
        studentAddress.setStudentId(studentId);
        return studentAddressService.createStudentAddress(studentAddress);
    }

    @DeleteMapping("/{studentId}/student/{addressId}/delete")
    public void deleteStudentAddress(@PathVariable("studentId")int studentId,@PathVariable("addressId")int addressId){
        studentAddressService.deleteStudentAddress(studentId, addressId);
    }
}
