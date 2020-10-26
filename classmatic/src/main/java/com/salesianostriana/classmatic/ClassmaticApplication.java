package com.salesianostriana.classmatic;

import com.salesianostriana.classmatic.entidades.*;
import com.salesianostriana.classmatic.servicios.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ClassmaticApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassmaticApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(AlumnoServicio alumnoServicio, ProfesorServicio profesorServicio, PasswordEncoder passWordEncoder,
								  AsignaturaServicio asignaturaServicio, CursoServicio cursoServicio, TituloServicio tituloServicio,
								  HorarioServicio horarioServicio){
		return args -> {

			//Creacion alumnos de prueba
			Alumno a1 =new Alumno();
			a1.setNombre("Carlos");
			a1.setApellidos("Pérez Ruiz");
			a1.setEmail("caperu@gmail.com");
			a1.setPassdword(passWordEncoder.encode("1234"));
			a1.setFechaNacimiento(LocalDate/*Time*/.of(1995,3,13/*,3,15*/));
			a1.setAsignaturas(new ArrayList<Asignatura>());
			a1.setSituacionesExc(new ArrayList<SituacionExcepcional>());
			a1.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			//a1.setCurso(new Curso());
			alumnoServicio.save(a1);
			a1.setHabilitado(true);
			a1.setCodigoInvitacion(1);
			alumnoServicio.edit(a1);

			Alumno a2 =new Alumno();
			a2.setNombre("Laura");
			a2.setApellidos("Angulo Ruiz");
			a2.setEmail("maanru@gmail.com");
			a2.setPassdword(passWordEncoder.encode("1234"));
			a2.setFechaNacimiento(LocalDate/*Time*/.of(1995,3,13/*,3,15*/));
			a2.setAsignaturas(new ArrayList<Asignatura>());
			a2.setSituacionesExc(new ArrayList<SituacionExcepcional>());
			a2.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			//a2.setCurso(new Curso());
			a2.setHabilitado(true);
			a2.setCodigoInvitacion(2);
			alumnoServicio.save(a2);

			Alumno a3 =new Alumno();
			a3.setNombre("Rodrigo");
			a3.setApellidos("Lozano Martín");
			a3.setEmail("roloma@gmail.com");
			a3.setPassdword(passWordEncoder.encode("1234"));
			a3.setFechaNacimiento(LocalDate/*Time*/.of(1995,3,13/*,3,15*/));
			a3.setAsignaturas(new ArrayList<Asignatura>());
			a3.setSituacionesExc(new ArrayList<SituacionExcepcional>());
			a3.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			//a3.setCurso(new Curso());
			a3.setHabilitado(true);
			a3.setCodigoInvitacion(3);
			alumnoServicio.save(a3);

			Alumno a4 =new Alumno();
			a4.setNombre("Luis");
			a4.setApellidos("García Ailet");
			a4.setEmail("lagaai@gmail.com");
			a4.setPassdword(passWordEncoder.encode("1234"));
			a4.setFechaNacimiento(LocalDate/*Time*/.of(1995,3,13/*,3,15*/));
			a4.setAsignaturas(new ArrayList<Asignatura>());
			a4.setSituacionesExc(new ArrayList<SituacionExcepcional>());
			a4.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			//a3.setCurso(new Curso());
			a4.setHabilitado(true);
			a4.setCodigoInvitacion(4);
			alumnoServicio.save(a4);

			Alumno a5 =new Alumno();
			a5.setNombre("Arturo");
			a5.setApellidos("Valle Fernández");
			a5.setEmail("arvafe@gmail.com");
			a5.setPassdword(passWordEncoder.encode("1234"));
			a5.setFechaNacimiento(LocalDate/*Time*/.of(1995,3,13/*,3,15*/));
			a5.setAsignaturas(new ArrayList<Asignatura>());
			a5.setSituacionesExc(new ArrayList<SituacionExcepcional>());
			a5.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			//a3.setCurso(new Curso());
			a5.setHabilitado(true);
			a5.setCodigoInvitacion(5);
			alumnoServicio.save(a5);

			Alumno a6 =new Alumno();
			a6.setNombre("Antonio");
			a6.setApellidos("Jimñenez Diaz");
			a6.setEmail("anjidi@gmail.com");
			a6.setPassdword(passWordEncoder.encode("1234"));
			a6.setFechaNacimiento(LocalDate/*Time*/.of(1995,3,13/*,3,15*/));
			a6.setAsignaturas(new ArrayList<Asignatura>());
			a6.setSituacionesExc(new ArrayList<SituacionExcepcional>());
			a6.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			//a3.setCurso(new Curso());
			a6.setHabilitado(true);
			a6.setCodigoInvitacion(6);
			alumnoServicio.save(a6);

			Alumno a7 =new Alumno();
			a7.setNombre("María");
			a7.setApellidos("Hernández Álvarez");
			a7.setEmail("maheal@gmail.com");
			a7.setPassdword(passWordEncoder.encode("1234"));
			a7.setFechaNacimiento(LocalDate/*Time*/.of(1995,3,13/*,3,15*/));
			a7.setAsignaturas(new ArrayList<Asignatura>());
			a7.setSituacionesExc(new ArrayList<SituacionExcepcional>());
			a7.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			//a3.setCurso(new Curso());
			a7.setHabilitado(true);
			a7.setCodigoInvitacion(7);
			alumnoServicio.save(a7);

			Alumno a8 =new Alumno();
			a8.setNombre("Carmen");
			a8.setApellidos("Navarro Torres");
			a8.setEmail("canato@gmail.com");
			a8.setPassdword(passWordEncoder.encode("1234"));
			a8.setFechaNacimiento(LocalDate/*Time*/.of(1995,3,13/*,3,15*/));
			a8.setAsignaturas(new ArrayList<Asignatura>());
			a8.setSituacionesExc(new ArrayList<SituacionExcepcional>());
			a8.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			//a3.setCurso(new Curso());
			a8.setHabilitado(true);
			a8.setCodigoInvitacion(8);
			alumnoServicio.save(a8);




			//Creacion asignaturas de prueba

			Asignatura as1 = new Asignatura();
			as1.setHorarios(new ArrayList<Horario>());
			as1.setNombre("Sistema Informáticos");
			as1.setNHorasSemanales(8);
			as1.setAlumnos(new ArrayList<Alumno>());
			as1.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as1.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a1.addAsignatura(as1);
			a2.addAsignatura(as1);
			asignaturaServicio.save(as1);
			alumnoServicio.edit(a1);
			alumnoServicio.edit(a2);


			Asignatura as2 = new Asignatura();
			as2.setHorarios(new ArrayList<Horario>());
			as2.setNombre("Bases de Datos");
			as2.setNHorasSemanales(8);
			as2.setAlumnos(new ArrayList<Alumno>());
			as2.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as2.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a1.addAsignatura(as2);
			a2.addAsignatura(as2);
			asignaturaServicio.save(as2);
			alumnoServicio.edit(a1);
			alumnoServicio.edit(a2);

			Asignatura as3 = new Asignatura();
			as3.setHorarios(new ArrayList<Horario>());
			as3.setNombre("Programación");
			as3.setNHorasSemanales(8);
			as3.setAlumnos(new ArrayList<Alumno>());
			as3.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as3.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a1.addAsignatura(as3);
			a2.addAsignatura(as3);
			asignaturaServicio.save(as3);
			alumnoServicio.edit(a1);
			alumnoServicio.edit(a2);

			Asignatura as4 = new Asignatura();
			as4.setHorarios(new ArrayList<Horario>());
			as4.setNombre("Lenguajes de Marcas");
			as4.setNHorasSemanales(8);
			as4.setAlumnos(new ArrayList<Alumno>());
			as4.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as4.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a1.addAsignatura(as4);
			a2.addAsignatura(as4);
			asignaturaServicio.save(as4);
			alumnoServicio.edit(a1);
			alumnoServicio.edit(a2);

			Asignatura as13 = new Asignatura();
			as13.setHorarios(new ArrayList<Horario>());
			as13.setNombre("Entornos de Desarrollo");
			as13.setNHorasSemanales(8);
			as13.setAlumnos(new ArrayList<Alumno>());
			as13.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as13.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a1.addAsignatura(as13);
			a2.addAsignatura(as13);
			asignaturaServicio.save(as13);
			alumnoServicio.edit(a1);
			alumnoServicio.edit(a2);

			Asignatura as14 = new Asignatura();
			as14.setHorarios(new ArrayList<Horario>());
			as14.setNombre("Formacion y Orientacion Laboral");
			as14.setNHorasSemanales(8);
			as14.setAlumnos(new ArrayList<Alumno>());
			as14.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as14.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a1.addAsignatura(as14);
			a2.addAsignatura(as14);
			asignaturaServicio.save(as14);
			alumnoServicio.edit(a1);
			alumnoServicio.edit(a2);

			Asignatura as100 = new Asignatura();
			as100.setHorarios(new ArrayList<Horario>());
			as100.setNombre("Formacion y Orientacion Personal");
			as100.setNHorasSemanales(8);
			as100.setAlumnos(new ArrayList<Alumno>());
			as100.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as100.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a1.addAsignatura(as100);
			a2.addAsignatura(as100);
			asignaturaServicio.save(as100);
			alumnoServicio.edit(a1);
			alumnoServicio.edit(a2);

			Asignatura as5 = new Asignatura();
			as5.setHorarios(new ArrayList<Horario>());
			as5.setNombre("Diseño de Interfaces");
			as5.setNHorasSemanales(8);
			as5.setAlumnos(new ArrayList<Alumno>());
			as5.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as5.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a3.addAsignatura(as5);
			a4.addAsignatura(as5);
			asignaturaServicio.save(as5);
			alumnoServicio.edit(a3);
			alumnoServicio.edit(a4);

			Asignatura as6 = new Asignatura();
			as6.setHorarios(new ArrayList<Horario>());
			as6.setNombre("Programación Multimedia y Dispositivos Móviles");
			as6.setNHorasSemanales(8);
			as6.setAlumnos(new ArrayList<Alumno>());
			as6.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as6.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a3.addAsignatura(as6);
			a4.addAsignatura(as6);
			asignaturaServicio.save(as6);
			alumnoServicio.edit(a4);
			alumnoServicio.edit(a3);

			Asignatura as7 = new Asignatura();
			as7.setHorarios(new ArrayList<Horario>());
			as7.setNombre("Sistemas de Gestión Empresarial");
			as7.setNHorasSemanales(8);
			as7.setAlumnos(new ArrayList<Alumno>());
			as7.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as7.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a3.addAsignatura(as7);
			a4.addAsignatura(as7);
			asignaturaServicio.save(as7);
			alumnoServicio.edit(a3);
			alumnoServicio.edit(a4);

			Asignatura as8 = new Asignatura();
			as8.setHorarios(new ArrayList<Horario>());
			as8.setNombre("Empresa");
			as8.setNHorasSemanales(8);
			as8.setAlumnos(new ArrayList<Alumno>());
			as8.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as8.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a3.addAsignatura(as8);
			a4.addAsignatura(as8);
			asignaturaServicio.save(as8);
			alumnoServicio.edit(a3);
			alumnoServicio.edit(a4);

			Asignatura as15 = new Asignatura();
			as15.setHorarios(new ArrayList<Horario>());
			as15.setNombre("Acceso a Datos");
			as15.setNHorasSemanales(8);
			as15.setAlumnos(new ArrayList<Alumno>());
			as15.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as15.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a3.addAsignatura(as15);
			a4.addAsignatura(as15);
			asignaturaServicio.save(as15);
			alumnoServicio.edit(a3);
			alumnoServicio.edit(a4);

			Asignatura as16 = new Asignatura();
			as16.setHorarios(new ArrayList<Horario>());
			as16.setNombre("Programacion de Servicios y Procesos");
			as16.setNHorasSemanales(8);
			as16.setAlumnos(new ArrayList<Alumno>());
			as16.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as16.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a3.addAsignatura(as16);
			a4.addAsignatura(as16);
			asignaturaServicio.save(as16);
			alumnoServicio.edit(a3);
			alumnoServicio.edit(a4);

			Asignatura as17 = new Asignatura();
			as17.setHorarios(new ArrayList<Horario>());
			as17.setNombre("Ingles");
			as17.setNHorasSemanales(8);
			as17.setAlumnos(new ArrayList<Alumno>());
			as17.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as17.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a3.addAsignatura(as17);
			a4.addAsignatura(as17);
			asignaturaServicio.save(as17);
			alumnoServicio.edit(a3);
			alumnoServicio.edit(a4);

			Asignatura as18 = new Asignatura();
			as18.setHorarios(new ArrayList<Horario>());
			as18.setNombre("Formacion y Orientacion Personal");
			as18.setNHorasSemanales(8);
			as18.setAlumnos(new ArrayList<Alumno>());
			as18.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as18.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a3.addAsignatura(as18);
			a4.addAsignatura(as18);
			asignaturaServicio.save(as18);
			alumnoServicio.edit(a3);
			alumnoServicio.edit(a4);


			Asignatura as9 = new Asignatura();
			as9.setHorarios(new ArrayList<Horario>());
			as9.setNombre("Ofimática");
			as9.setNHorasSemanales(8);
			as9.setAlumnos(new ArrayList<Alumno>());
			as9.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as9.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a5.addAsignatura(as9);
			a6.addAsignatura(as9);
			asignaturaServicio.save(as9);
			alumnoServicio.edit(a5);
			alumnoServicio.edit(a6);

			Asignatura as10 = new Asignatura();
			as10.setHorarios(new ArrayList<Horario>());
			as10.setNombre("Comunicación y Atención al Cliente");
			as10.setNHorasSemanales(8);
			as10.setAlumnos(new ArrayList<Alumno>());
			as10.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as10.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a5.addAsignatura(as10);
			a6.addAsignatura(as10);
			asignaturaServicio.save(as10);
			alumnoServicio.edit(a5);
			alumnoServicio.edit(a6);

			Asignatura as11 = new Asignatura();
			as11.setHorarios(new ArrayList<Horario>());
			as11.setNombre("Gestión Financiera");
			as11.setNHorasSemanales(8);
			as11.setAlumnos(new ArrayList<Alumno>());
			as11.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as11.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a7.addAsignatura(as11);
			a8.addAsignatura(as11);
			asignaturaServicio.save(as11);
			alumnoServicio.edit(a7);
			alumnoServicio.edit(a8);

			Asignatura as12 = new Asignatura();
			as12.setHorarios(new ArrayList<Horario>());
			as12.setNombre("Gestión de Recursos Humanos");
			as12.setNHorasSemanales(8);
			as12.setAlumnos(new ArrayList<Alumno>());
			as12.setSituacionExc(new ArrayList<SituacionExcepcional>());
			as12.setSolicitudesAmp(new ArrayList<SolicitudAmpliacionMatricula>());
			a7.addAsignatura(as12);
			a8.addAsignatura(as12);
			asignaturaServicio.save(as12);
			alumnoServicio.edit(a7);
			alumnoServicio.edit(a8);


			//Horarios
			//-------------------------------SI
			//Lunes
			Horario hSi1=new Horario();
			hSi1.setHoras(new ArrayList<Integer>());
			hSi1.setDia(1);
			hSi1.getHoras().add(4);
			hSi1.addAsignatura(as1);
			horarioServicio.save(hSi1);
			asignaturaServicio.edit(as1);
			//Martes
			Horario hSi2=new Horario();
			hSi2.setHoras(new ArrayList<Integer>());
			hSi2.setDia(2);
			hSi2.getHoras().add(4);
			hSi2.getHoras().add(5);
			hSi2.addAsignatura(as1);
			horarioServicio.save(hSi2);
			asignaturaServicio.edit(as1);
			//Miercoles
			Horario hSi3=new Horario();
			hSi3.setHoras(new ArrayList<Integer>());
			hSi3.setDia(3);
			hSi3.getHoras().add(4);
			hSi3.addAsignatura(as1);
			horarioServicio.save(hSi3);
			asignaturaServicio.edit(as1);
			//Jueves
			Horario hSi4=new Horario();
			hSi4.setHoras(new ArrayList<Integer>());
			hSi4.setDia(4);
			hSi4.getHoras().add(5);
			hSi4.addAsignatura(as1);
			horarioServicio.save(hSi4);
			asignaturaServicio.edit(as1);

			//-----------------------------bases de datos --> as2
			//lunes
			Horario hBd1=new Horario();
			hBd1.setHoras(new ArrayList<Integer>());
			hBd1.setDia(1);
			hBd1.getHoras().add(1);
			hBd1.getHoras().add(2);
			hBd1.addAsignatura(as2);
			horarioServicio.save(hBd1);
			asignaturaServicio.edit(as2);
			//martes
			Horario hBd2=new Horario();
			hBd2.setHoras(new ArrayList<Integer>());
			hBd2.setDia(2);
			hBd2.getHoras().add(1);
			hBd2.addAsignatura(as2);
			horarioServicio.save(hBd2);
			asignaturaServicio.edit(as2);
			//miercoles
			Horario hBd3=new Horario();
			hBd3.setHoras(new ArrayList<Integer>());
			hBd3.setDia(3);
			hBd3.getHoras().add(5);
			hBd3.addAsignatura(as2);
			horarioServicio.save(hBd3);
			asignaturaServicio.edit(as2);
			//jueves
			Horario hBd4=new Horario();
			hBd4.setHoras(new ArrayList<Integer>());
			hBd4.setDia(4);
			hBd4.getHoras().add(6);
			hBd4.addAsignatura(as2);
			horarioServicio.save(hBd4);
			asignaturaServicio.edit(as2);
			//viernes
			Horario hBd5=new Horario();
			hBd5.setHoras(new ArrayList<Integer>());
			hBd5.setDia(5);
			hBd5.getHoras().add(2);
			hBd5.addAsignatura(as2);
			horarioServicio.save(hBd5);
			asignaturaServicio.edit(as2);

			//---------------------programacion --> as3
			//lunes
			Horario hP1=new Horario();
			hP1.setHoras(new ArrayList<Integer>());
			hP1.setDia(1);
			hP1.getHoras().add(6);
			hP1.addAsignatura(as3);
			horarioServicio.save(hP1);
			asignaturaServicio.edit(as3);
			//martes
			Horario hP2=new Horario();
			hP2.setHoras(new ArrayList<Integer>());
			hP2.setDia(2);
			hP2.getHoras().add(6);
			hP2.addAsignatura(as3);
			horarioServicio.save(hP2);
			asignaturaServicio.edit(as3);
			//miercoles
			Horario hP3=new Horario();
			hP3.setHoras(new ArrayList<Integer>());
			hP3.setDia(3);
			hP3.getHoras().add(2);
			hP3.getHoras().add(3);
			hP3.addAsignatura(as3);
			horarioServicio.save(hP3);
			asignaturaServicio.edit(as3);
			//jueves
			Horario hP4=new Horario();
			hP4.setHoras(new ArrayList<Integer>());
			hP4.setDia(4);
			hP4.getHoras().add(2);
			hP4.getHoras().add(3);
			hP4.addAsignatura(as3);
			horarioServicio.save(hP4);
			asignaturaServicio.edit(as3);
			//viernes
			Horario hP5=new Horario();
			hP5.setHoras(new ArrayList<Integer>());
			hP5.setDia(5);
			hP5.getHoras().add(4);
			hP5.getHoras().add(5);
			hP5.addAsignatura(as3);
			horarioServicio.save(hP5);
			asignaturaServicio.edit(as3);
			//-----------------------------------lenguaje marcas --> as4
			//lunes
			Horario hL1=new Horario();
			hL1.setHoras(new ArrayList<Integer>());
			hL1.setDia(1);
			hL1.getHoras().add(3);
			hL1.addAsignatura(as4);
			horarioServicio.save(hL1);
			asignaturaServicio.edit(as4);
			//martes
			Horario hL2=new Horario();
			hL2.setHoras(new ArrayList<Integer>());
			hL2.setDia(2);
			hL2.getHoras().add(2);
			hL2.addAsignatura(as4);
			horarioServicio.save(hL2);
			asignaturaServicio.edit(as4);
			//jueves
			Horario hL4=new Horario();
			hL4.setHoras(new ArrayList<Integer>());
			hL4.setDia(4);
			hL4.getHoras().add(1);
			hL4.addAsignatura(as4);
			horarioServicio.save(hL4);
			asignaturaServicio.edit(as4);
			//viernes
			Horario hL5=new Horario();
			hL5.setHoras(new ArrayList<Integer>());
			hL5.setDia(5);
			hL5.getHoras().add(6);
			hL5.addAsignatura(as4);
			horarioServicio.save(hL5);
			asignaturaServicio.edit(as4);
			//---------------------------------------Entornos desarrollo --> as13
			//lunes
			Horario hE1=new Horario();
			hE1.setHoras(new ArrayList<Integer>());
			hE1.setDia(1);
			hE1.getHoras().add(5);
			hE1.addAsignatura(as13);
			horarioServicio.save(hE1);
			asignaturaServicio.edit(as13);
			//miercoles
			Horario hE3=new Horario();
			hE3.setHoras(new ArrayList<Integer>());
			hE3.setDia(3);
			hE3.getHoras().add(1);
			hE3.addAsignatura(as13);
			horarioServicio.save(hE3);
			asignaturaServicio.edit(as13);
			//jueves
			Horario hE4=new Horario();
			hE4.setHoras(new ArrayList<Integer>());
			hE4.setDia(4);
			hE4.getHoras().add(4);
			hE4.addAsignatura(as13);
			horarioServicio.save(hE4);
			asignaturaServicio.edit(as13);
			//------------------------------------------fol --> as14
			//martes
			Horario hFL2=new Horario();
			hFL2.setHoras(new ArrayList<Integer>());
			hFL2.setDia(2);
			hFL2.getHoras().add(3);
			hFL2.addAsignatura(as14);
			horarioServicio.save(hFL2);
			asignaturaServicio.edit(as14);
			//miercoles
			Horario hFL3=new Horario();
			hFL3.setHoras(new ArrayList<Integer>());
			hFL3.setDia(3);
			hFL3.getHoras().add(6);
			hFL3.addAsignatura(as14);
			horarioServicio.save(hFL3);
			asignaturaServicio.edit(as14);
			//viernes
			Horario hFL5=new Horario();
			hFL5.setHoras(new ArrayList<Integer>());
			hFL5.setDia(5);
			hFL5.getHoras().add(3);
			hFL5.addAsignatura(as14);
			horarioServicio.save(hFL5);
			asignaturaServicio.edit(as14);
			//----------------------------------------------fop --> as100
			//viernes
			Horario hFP5=new Horario();
			hFP5.setHoras(new ArrayList<Integer>());
			hFP5.setDia(5);
			hFP5.getHoras().add(1);
			hFP5.addAsignatura(as100);
			horarioServicio.save(hFP5);
			asignaturaServicio.edit(as100);




			//Cursos

			Curso c1 = new Curso();
			c1.setNombre("1ºDAM");
			c1.setAlumnos(new ArrayList<Alumno>());
			c1.setAsignaturas(new ArrayList<Asignatura>());
			cursoServicio.save(c1);
			c1.addAsignatura(as1);
			c1.addAsignatura(as2);
			c1.addAsignatura(as3);
			c1.addAsignatura(as4);
			c1.addAsignatura(as13);
			c1.addAsignatura(as14);
			c1.addAsignatura(as15);
			c1.addAlumno(a1);
			c1.addAlumno(a2);
			cursoServicio.edit(c1);
			asignaturaServicio.edit(as1);
			asignaturaServicio.edit(as2);
			asignaturaServicio.edit(as3);
			asignaturaServicio.edit(as4);
			asignaturaServicio.edit(as13);
			asignaturaServicio.edit(as14);
			asignaturaServicio.edit(as15);
			alumnoServicio.edit(a1);
			alumnoServicio.edit(a2);


			Curso c2 = new Curso();
			c2.setNombre("2ºDAM");
			c2.setAlumnos(new ArrayList<Alumno>());
			c2.setAsignaturas(new ArrayList<Asignatura>());
			cursoServicio.save(c2);
			c2.addAsignatura(as5);
			c2.addAsignatura(as6);
			c2.addAsignatura(as7);
			c2.addAsignatura(as8);
			c2.addAlumno(a3);
			c2.addAlumno(a4);
			cursoServicio.edit(c2);
			asignaturaServicio.edit(as5);
			asignaturaServicio.edit(as6);
			asignaturaServicio.edit(as7);
			asignaturaServicio.edit(as8);
			alumnoServicio.edit(a3);
			alumnoServicio.edit(a4);

			Curso c3 = new Curso();
			c3.setNombre("1ºAyD");
			c3.setAlumnos(new ArrayList<Alumno>());
			c3.setAsignaturas(new ArrayList<Asignatura>());
			cursoServicio.save(c3);
			c3.addAsignatura(as9);
			c3.addAsignatura(as10);
			c3.addAlumno(a5);
			c3.addAlumno(a6);
			cursoServicio.edit(c3);
			asignaturaServicio.edit(as9);
			asignaturaServicio.edit(as10);
			alumnoServicio.edit(a5);
			alumnoServicio.edit(a6);

			Curso c4 = new Curso();
			c4.setNombre("2ºAyD");
			c4.setAlumnos(new ArrayList<Alumno>());
			c4.setAsignaturas(new ArrayList<Asignatura>());
			cursoServicio.save(c4);
			c4.addAsignatura(as11);
			c4.addAsignatura(as12);
			c4.addAlumno(a7);
			c4.addAlumno(a8);
			cursoServicio.edit(c4);
			asignaturaServicio.edit(as11);
			asignaturaServicio.edit(as12);
			alumnoServicio.edit(a7);
			alumnoServicio.edit(a8);


			//Titulos

			Titulo t1 = new Titulo();
			t1.setNombre("DAM");
			t1.setNivelAcademico("GS");
			t1.setCursos(new ArrayList<Curso>());
			t1.addCurso(c1);
			t1.addCurso(c2);
			tituloServicio.save(t1);
			cursoServicio.edit(c1);
			cursoServicio.edit(c2);

			Titulo t2 = new Titulo();
			t2.setNombre("AyF");
			t2.setNivelAcademico("GS");
			t2.setCursos(new ArrayList<Curso>());
			t2.addCurso(c3);
			t2.addCurso(c4);
			tituloServicio.save(t2);
			cursoServicio.edit(c3);
			cursoServicio.edit(c4);




			/*Profesor p1 = Profesor.builder()
					.nombre("Alfonso")
					.apellidos("Ramos Roldán")
					.email("alraro@gmail.com")
					.passdword(passWordEncoder.encode("1234"))
					.fechaNacimiento(LocalDateTime.of(1987,8,23,17,0))
					.esJefe(false)
					.build();*/
			Profesor p1=new Profesor();
			p1.setNombre("Alfonso");
			p1.setApellidos("Ramos Roldán");
			p1.setEmail("alraro@gmail.com");
			p1.setFechaNacimiento(LocalDate/*Time*/.of(1987,8,23/*,17,0*/));
			p1.setPassdword(passWordEncoder.encode("1234"));
			p1.setEsJefe(false);
			p1.setHabilitado(true);
			p1.setCodigoInvitacion(11);
			profesorServicio.save(p1);

			Profesor p3=new Profesor();
			p3.setNombre("Raul");
			p3.setApellidos("Roldán Etena");
			p3.setEmail("raroet@gmail.com");
			p3.setFechaNacimiento(LocalDate/*Time*/.of(1987,8,23/*,17,0*/));
			p3.setPassdword(passWordEncoder.encode("1234"));
			p3.setEsJefe(false);
			p3.setHabilitado(true);
			p3.setCodigoInvitacion(13);
			profesorServicio.save(p3);

			Profesor p4=new Profesor();
			p4.setNombre("Lucas");
			p4.setApellidos("Martín Romero");
			p4.setEmail("lumaro@gmail.com");
			p4.setFechaNacimiento(LocalDate/*Time*/.of(1987,8,23/*,17,0*/));
			p4.setPassdword(passWordEncoder.encode("1234"));
			p4.setEsJefe(false);
			p4.setHabilitado(true);
			p4.setCodigoInvitacion(14);
			profesorServicio.save(p4);


			Profesor p2=new Profesor();
			p2.setNombre("Jose");
			p2.setApellidos("Lago Vidal");
			p2.setEmail("admin");
			p2.setFechaNacimiento(LocalDate/*Time*/.of(1983,2,8/*,20,30*/));
			p2.setPassdword(passWordEncoder.encode("admin"));
			p2.setEsJefe(true);
			p2.setHabilitado(true);
			p2.setCodigoInvitacion(12);
			profesorServicio.save(p2);

			Profesor p5=new Profesor();
			p5.setNombre("Jesús");
			p5.setApellidos("Lopera Antúnez");
			p5.setEmail("jeloan@gmail.com");
			p5.setFechaNacimiento(LocalDate/*Time*/.of(1983,2,8/*,20,30*/));
			p5.setPassdword(passWordEncoder.encode("admin"));
			p5.setEsJefe(true);
			p5.setHabilitado(true);
			p5.setCodigoInvitacion(15);
			profesorServicio.save(p5);





		};

	}

}
