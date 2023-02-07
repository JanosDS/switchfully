function firstLetter(word) {
    var _a;
    return (_a = word === null || word === void 0 ? void 0 : word.charAt(0)) !== null && _a !== void 0 ? _a : 'Nothing';
}
console.log(firstLetter('Bob'));
console.log(firstLetter());
