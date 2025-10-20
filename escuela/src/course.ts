import {Teacher} from "./teacher";
import {Student} from "./student";

class Course {
    private id: string;
    private name: string;
    private topic: string;
    private teacher: Teacher;
    private students: Student[];
    notas = new Map<Student, number[]>;


    constructor(id: string, name: string, topic: string, teacher: Teacher, student: Student[]) {
        this.id = id;
        this.name = name;
        this.topic = topic;
        this.teacher = teacher;
        this.students = student;
    }

    public assignTeacher(teacher: Teacher){
        if( teacher.canTeach(this.topic) ){
            this.teacher = teacher;
        } else {
            throw("Este profesor no puede impartir esta clase");
        }
    }

    public enroll(student: Student){
        this.students.push(student);
        this.notas.set(this.students[this.students.indexOf(student)], [])
    }

    public unenroll(studentId: string){
        for (let i = 0; i < this.students.length; i++) {
            if(this.students[i].id == studentId ){
                this.students.splice(i, 1);
            }
        }
    }

    public addGrade(studentId: string, grade: number){
        if(grade < 0 || grade > 10) throw new Error("Error, la nota debe de ser entre 0 - 10");

        for (let i = 0; i < this.students.length; i++) {
            if(this.students[i].id == studentId ){
                let aNotas: number[]|undefined = this.notas.get(this.students[i]);
                if(aNotas != undefined) {
                    aNotas.push(grade);
                    this.notas.set(this.students[i], aNotas);
                } else {
                    console.log("Notas no encontradas para "  + studentId);
                }
            }
        }
    }

    public avarageOf(studentId: string): number{
        let media: number = 0;

        for (let i = 0; i < this.students.length; i++) {
            if(this.students[i].id == studentId ){
                let aNotas: number[]|undefined = this.notas.get(this.students[i]);

                if(aNotas != undefined) {
                    console.log(aNotas);
                    for (let j = 0; j < aNotas.length; j++) {
                        console.log(aNotas[i]);
                        media += aNotas[i];
                    }
                    console.log(media);

                    return media / aNotas.length;
                }
            }
        }
        return 0;
    }

    public courseAverage(): number{
        let num: number = 0;

        for (let i = 0; i < this.students.length; i++) {
            num += this.avarageOf(this.students[i].id)
        }
        num = num / this.students.length

        return num;
    }

    public roster(){
        console.log("Curso " + this.name + "[" + this.topic + "]")
        console.log("Profesor: " + this.teacher.name)
        console.log("Alumnos: " + this.students.length)
        console.log("-------------------------------------------------")

        for (let i = 0; i < this.students.length; i++) {
            console.log("· " + this.students[i].name + " (nivel " + this.students[i].gradeLevel + ") " + " media: " + this.avarageOf(this.students[i].id))
        }

        console.log("\nMedia del curso: " + this.courseAverage())
    }
}

export {Course};