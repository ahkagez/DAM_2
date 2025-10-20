abstract class Person {
    get name(): string {
        return this._name;
    }
    private _id: string;
    private _name: string;

    constructor(id: string, name: string) {
        this._id = id;
        this._name = name;
    }

    public rename(newName: string): void{
        if(this._name == null || this._name == "") throw Error("Nombre vacio");
        this._name = newName;
    }

    get id(): string {
        return this._id;
    }
}

export {Person};