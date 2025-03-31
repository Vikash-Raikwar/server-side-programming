 // Using a for loop
let usersFor = [];
for (let i = 1; i <= 5; i++) {
    usersFor.push(`Server ${i}`);
}
console.log("Users generated with for loop:", usersFor);



// Using a while loop
let usersWhile = [];
let i = 1;
while (i <= 5) {
    usersWhile.push(`Side ${i}`);
    i++;
}
console.log("Users generated with while loop:", usersWhile);



// Using a do-while loop
let usersDoWhile = [];
i = 1;
do {
    usersDoWhile.push(`Progames${i}`);
    i++;
} while (i <= 5);
console.log("Users generated with do-while loop:", usersDoWhile);
