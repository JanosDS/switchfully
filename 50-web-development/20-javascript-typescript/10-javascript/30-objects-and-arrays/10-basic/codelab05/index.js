function printProperties(object) {
    console.log(JSON.stringify(object));
}


function printPropsInString(object) {
    let output = `This object has ${Object.keys(object).length} properties: `;
    for (let p in object) {
        output += `${p} has value ${object[p]} \n`;
    }
    return output;
}

let person = {
    name: "fred",
    age: 30,
    kids: 77
}

printProperties(person);

console.log(printPropsInString(person));

