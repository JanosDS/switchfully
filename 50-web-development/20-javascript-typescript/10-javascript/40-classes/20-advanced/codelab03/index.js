function Person(name) {
    this.name = name;
}

const slim = new Person("Slim Shady");

Person.prototype.talk = function () {
    console.log(`Will the real ${this.name} please stand up`)
};

slim.talk();

const fred = new Person("Fred");
fred.talk();

const person = Object.create(slim);
person.name = "new name";
person.talk();
slim.talk();