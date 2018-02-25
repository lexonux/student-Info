package com.bijay.studentinfo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bijay.studentinfo.dto.StudentDto;
import com.bijay.studentinfo.util.DbUtil;

public class StudentDaoImpl implements StudentDao {
	PreparedStatement ps=null;

	@Override
	public int saveStudentInfo(StudentDto studentDto) {
		// TODO Auto-generated method stub
		int saved=0;
		String sql="insert into student_details(student_name,college_name,email,gender,subject,departments,roll,dob)values(?,?,?,?,?,?,?,?)";
		try {
			ps=DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, studentDto.getStudentName());
			ps.setString(2, studentDto.getCollegeName());
			ps.setString(3, studentDto.getEmail());
			ps.setString(4, studentDto.getGender());
			ps.setString(5, studentDto.getSubject());
			ps.setString(6, studentDto.getDepartment());
			ps.setInt(7, studentDto.getRoll());
			ps.setDate(8, new java.sql.Date(studentDto.getDob().getTime()));
			saved=ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return saved;
	}

}
