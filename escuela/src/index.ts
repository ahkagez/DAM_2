import {Student} from "./student";
import {Teacher} from "./teacher";
import {Course} from "./course";


let profesor1: Teacher = new Teacher("1", "Jordi", ["Java"]);
let profesor2: Teacher = new Teacher("2", "Marc", ["TypeScript"]);

let estudiante1: Student = new Student("1", "Albert", 0);
let estudiante2: Student = new Student("2", "Sebastian", 0);
let estudiante3: Student = new Student("3", "Aina", 0);

let curso: Course = new Course("1", "Programacion Multimedia", "TypeScript", profesor2, [])

curso.enroll(estudiante1);
curso.enroll(estudiante2);
curso.enroll(estudiante3);

curso.addGrade(estudiante1.id, 3);
curso.addGrade(estudiante1.id, 7);
curso.addGrade(estudiante2.id, 3);
curso.addGrade(estudiante2.id, 3);
curso.addGrade(estudiante3.id, 1);
curso.addGrade(estudiante3.id, 9);


curso.roster();
// console.log( curso.courseAverage() )
// curso.assignTeacher(profesor1);