import {Person} from "./person";

class Teacher extends Person {
    private specialties: string[];

    constructor(id: string, name: string, specialties: string[]) {
        super(id, name);
        this.specialties = specialties;
    }

    public canTeach(topic: string): boolean{
        for (let i = 0; i < this.specialties.length; i++) {
            if(this.specialties[i] == topic){
                return true;
            }
        }
        return false;
    }
}

export {Teacher};