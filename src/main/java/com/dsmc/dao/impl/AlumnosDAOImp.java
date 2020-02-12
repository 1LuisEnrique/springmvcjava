package com.dsmc.dao.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dsmc.dao.AlumnosDAO;
import com.dsmc.entity.Alumnos;
import com.dsmc.persona.Persona;
import com.dsmc.persona.rowmap.AlumnoRowMap;
import com.dsmc.persona.rowmap.PersonaRowMap;

@Repository
public class AlumnosDAOImp implements AlumnosDAO {
	
	@Autowired                                                 //instruccion para inyectar en todos lados
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void save(Alumnos alumnos) {
		// TODO Auto-generated method stub
		String sSql = "INSERT INTO ALUMNO(NOMBRE,AP_PATERNO,AP_MATERNO,EDAD,CARRERA,PASATIEMPO ) VALUES (?,?,?,?,?,?)";
		Object[] obj = new Object[6];
		obj[0] = alumnos.getNombre();
		obj[1] = alumnos.getApPaterno();
		obj[2] = alumnos.getApMaterno();
		obj[3] = alumnos.getEdad();
		obj[4] = alumnos.getCarrera();
		obj[5] = alumnos.getPasatiempo();
		

		this.jdbcTemplate.update(sSql, obj);
	}

	public void delete(Integer id) {
		String sSql = "DELETE FROM ALUMNO WHERE ID = ?";
		Object[] obj = new Object[1];
		obj[0]=id;
		this.jdbcTemplate.update(sSql,obj);
	}

	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	public void findById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void modify(String nombreAnterior, String nombreNuevo) {
		// TODO Auto-generated method stub
		
	}


	public void modify(Alumnos alumnos,Integer id) {
		// TODO Auto-generated method stub
		String sSql = "UPDATE ALUMNO "
				+ "set nombre=?,ap_paterno=?,ap_materno=?,edad=?,carrera=?,pasatiempo=?"
				+ "WHERE ID=?";
		Object [] obj = new Object[]{id};
		Alumnos alumno = new Alumnos();
		alumno.getNombre();
		alumno.getApPaterno();
		alumno.getApMaterno();
		alumno.getEdad();
		alumno.getCarrera();
		alumno.getPasatiempo();
		
		this.jdbcTemplate.update(sSql,id);
		
	}
	public List<Alumnos> getList() {
		String sql = "SELECT id, " + "       nombre," + "       ap_Paterno," + "       ap_Materno," + "       edad,"
				+ "       carrera," + "		pasatiempo" + " FROM alumno";
		List<Alumnos> listAlumno = jdbcTemplate.query(sql, new AlumnoRowMap());
		System.out.println(listAlumno);
		return listAlumno;
	}


	public void modify(Alumnos alumnos) {
		// TODO Auto-generated method stub
		
	}


            
}
