export class Person {

    public constructor(private firstName: string, private lastName?: string, private hobby = 'cycling') {

    }

    private getFullName(): string {
        return this.firstName + ' ' + this.lastName;
    }

    public printName(): void {
        console.log(this.getFullName());
    }
}

let bob: Person = new Person('bob', 'singing');
let billie: Person = new Person('billie', 'eilish');

