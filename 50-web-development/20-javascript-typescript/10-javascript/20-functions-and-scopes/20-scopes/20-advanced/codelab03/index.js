function hoistVar() {
    for (var i = 0; i < 3; i++) {
        var h = 3; // becomes: 'h = 3'
    }
    console.log(h);
}

hoistVar();

// function hoistLet() {
//     for (let i = 0; i < 3; i++) {
//         let h = 3; // becomes: 'h = 3'
//     }
//     console.log(h);
// }
//
// hoistLet();

function hoistConst() {
    for (var i = 0; i < 3; i++) {
        const h = 3; // becomes: 'h = 3'
    }
    console.log(h);
}

hoistConst();