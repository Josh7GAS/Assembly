// let selectedColors = ['red', 'blue'];
// selectedColors[2]= 'green';
// console.log(selectedColors.length);


let names = ["jose", "ronaldo", "joao", "marcos", "arroz", "ronaldo", "arroz", "maria", "marcos", "joao"];
//let unique = [];
// let namesLen = names.namesLength;
// let _temp;

// names.sort();

// for (let i = 0; i < namesLen; i++) {
//     if (names[i] !== _temp) {
//         unique.push(names[i]);
//         _temp = names[i];
//     }
// }

console.log([...new Set(names)]);

//console.log(unique);