﻿# Práctica Calificada - Ingeniería de Software I - 2017-I #

## Requisitos ##

### Fork y clonación del proyecto ###
* Crear un _fork_ de este repositorio hacia una cuenta personal.
* Clonar el repositorio del cual hizo _fork_ en su computador.
* Enviar un email al profesor indicando la URL del repositorio personal.
* Solo se calificará los cambios enviados hasta el final de la práctica (subir sus cambios al repositorio personal).

### Importar el proyecto desde Eclipse ###

* Ir al menu File -> Import ...
* En el diálogo de Importación: seleccionar Maven -> Existing Maven Projects...
* Seleccionar la carpeta donde se clonó este proyecto

### Ejecutar el proyecto ###

* Para poder ejecutar el proyecto se necesita tener instalado STS, Eclipse, IntelliJ IDEA, etc. con Oracle Java 8 o superior.

* El proyecto también puede ser ejecutado desde Eclipse o STS, haciendo click derecho sobre el proyecto -> Run As... -> Java Application

## Descripción del Problema ##

En los Sistemas de Información Académica se cuenta al menos con las siguientes entidades del modelo del dominio:

* Alumno
* Matrícula, y
* Curso

### Alumno ###
Un alumno es una persona que se identifica con nombres, apellido paterno, apellido materno y DNI que puede matricularse en determinados cursos,
siempre que cumpla con los prerequisitos exigidos por 
el reglamento de la institución. Una de estas reglas es por ejemplo:

* Un alumno nuevo solo puede matricularse en 20 créditos por semestre.
* Un alumno con uno a dos cursos desaprobados en el semestre anterior, solo puede llevar 16 créditos. Y está obligado a llevar los cursos desaprobados hasta aprobarlos.

### Curso ###
Un curso tiene un código unico, nombre, créditos y una lista de prerequisitos, 

### Matrícula ###
La matrícula representa la relación entre un alumno y un curso, durante un semestre (ejemplo: 2015-II), además de permitir registrar
la nota con la que el alumno aprueba o desaprueba dicho curso.

## Funcionalidades a Implementar ##
* DONE Hacer el mapeo correspondiente a Entidades JPA.
* DONE Mapear las relaciones OneToMany, OneToOne, ManyToOne y ManyToMany según corresponda.
* DONE Validar que las tablas y sus relaciones se crearon correctamente en la base de datos.
* Solo query y service /Permitir matricular un alumno en un determinado curso, siempre que cumpla con los prerequisitos.
* Solo query  /Permitir subir la nota de un alumno (require estar matriculado previamente en dicho curso).
*DONE query/service/controller* Listar todos los cursos.
*DONE query/service/controller*Buscar un determinado curso dado su código.
*DONE query/service/controller* Buscar un determinado curso dado una parte de su nombre.
*DONE query/service/controller* Buscar un alumno por su apellido paterno.
*DONE query/service/controller* Listar los alumnos matriculados en un deteminado curso y semestre con sus respectivas notas.
* Listar la jerarquía de cursos en forma de árbol de acuerdo a los prerequisitos.
