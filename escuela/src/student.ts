import {Person} from "./person";

class Student extends Person {
    private _gradeLevel: number;

    constructor(id: string, name: string, gradeLevel: number) {
        super(id, name);
        this._gradeLevel = gradeLevel;
    }

    get gradeLevel(): number {
        return this._gradeLevel;
    }

    public setGradeLevel(value: number) {
        this._gradeLevel = value;
    }
}

export {Student};