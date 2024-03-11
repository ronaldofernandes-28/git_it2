/*Code Structure of JS Program*/
console.log("My first Javascript File");
console.log("Welcome to the session");
console.log(1 + 2);

// This is a Javascript program
/*Hey
i am learning*/
let x = 10;
console.log(x);
x = 20;
console.log(x);
x = "ten";
console.log(x);
let y,
  z,
  a = 30,
  b = 40,
  c = 20;
console.log(y);
y = 50;
console.log(x);

// 1. Case Sensitive
let year = 2020;
let Year = 2021;

// 2. Case Sensitive(Aa - Zz), numbers(0-9), underscore(_), Dollar($)
let name = "Ronaldo";
let first_name = "Ronaldo";
let amt$ = 29.5;
let num1 = 10;

// 3. Cannot start with a number
// 4. No reserved words
// 5.no blank space inbetween
// 6. under 10-15 characters
// 7. variable names should always exist on the left hand
// 8. naming convention
// 9. Relatable names for readablity
// 10. snake casing or camel casing

// let const var
let age;
age = 10;

const pi = 3.14;
// const year; not allowed

var MyName = "Ronaldo";
MyName = "Mafron";
// Number (64 bit)
let num = 10;
console.log(typeof num);

// String
const firstName = "Ronaldo's book";
const lastName = "Fernandes";
const nickName = `Romeo`;

console.log(typeof firstName);
console.log(typeof lastName);
console.log(typeof nickName);

// Boolean
let bool = false;
console.log(typeof bool);

// undefined
let e;
console.log(typeof e);
console.log(a);

// null
let f = null;
console.log(typeof f);
console.log(f);

//Symbol (ES6 / 2015)
// BitInt (ES2020)
let num3 = 10n;
console.log(typeof num3);

// Interesting facts about Data Ty_pgs
console.log(Number.MAX_VALUE);
console.log(Number.MIN_VALUE);
console.log(Number.MAX_VALUE * 10);
let num4 = Infinity;
console.log(num4);
console.log(12 / 0);
console.log(188 / Infinity);

let num5 = 10;
let str5 = "Javascript is wondeful!";
let str6 = "It is dynamically typed";
let bigNum5 = 10n;
let bool5 = true;

console.log(num5.__proto__);
console.log(str5.__proto__);
console.log(bigNum5.__proto__);
console.log(bool5.__proto__);

console.log(str5.charAt(7));
console.log(str5.concat(str6));
console.log(str5.length);
console.log(str5.indexOf("i", 8));

// 1. Assign operator(=)
let p = 10;
let q = p;
let r = (p = 20);
console.log(p);
console.log(q);
console.log(r);

// 2. Arithmatic operator(=, -, *, /, %)
console.log(10 + 2);
console.log(10 - 2);
console.log(10 * 2);
console.log(10 / 2);
console.log(11 % 2);

// 3. More Arithmatic operator(++, --, +, -, **)
let i = -10;
i++;
i++;
console.log(i++);
console.log(++i);
console.log(i ** 3);

// 4. Augumented Assisngment Operator(+=, -=, *=, /=)
i += 3;
console.log(i);

// 1. Comparison operator (==, !=, <, <=, >, >=, ===, !==)
console.log(5 == 6);
console.log(5 != 5);
console.log(5 <= 5);
console.log("5" === 5);
console.log("6" === 6);
let birthYear = 18;
let rightToVote = birthYear >= 18;
console.log(rightToVote);

// 5. Logical Operator(&&, ||, !)
let grade = 65;
let scholarship = 80;
let eligible = grade > 60 && scholarship > 70;
console.log(eligible);

let m1 = 55;
let m2 = 55;
let m3 = 45;
let enligibily = m1 > 60 || m2 > 60 || m3 > 60;
console.log(enligibily);

console.log(!rightToVote);
console.log(3 && 1);
console.log(3 && 1 && 4 && 7 && 0 && 6 && 5 && null);
console.log(0 || null || "string" || undefined || false || NaN);
let avg = (m1 + m2 + m3) / 3;
console.log(avg);

console.log(5 + 5);
let sum = "5" + 5;
console.log(typeof sum);
let fullName = "Mafron" + " " + "Fernandes";
console.log(fullName);
let sub = "55" - 10;
console.log(sub);
console.log("4" * 2);

// Convert to String
console.log(String(100));
console.log(String(true));
console.log(String(null));
console.log(String(undefined));
console.log((123).toString());
// console.log(null.toString());
console.log(Number("25"));
console.log(Number("Value"));
console.log(Number(true));
let h = "123";
console.log(+h);
let num8 = 1.2;
console.log(parseInt("12345f"));
console.log(parseFloat("123.45f"));
console.log(Boolean("abc"));

// Conditionals in javascript
// If statement
// Print num is even if even
let num7 = prompt("Enter a num");
if (num7 % 2 == 0) {
  console.log("Num is even");
} else {
  console.log("Odd");
}
console.log("Outside if");
let month = prompt("Enter the month number");
if (month >= 1 && month <= 3) {
  console.log("1st Quarter");
} else if (month >= 4 && month <= 6) {
  console.log("2nd Quarter");
} else if (month >= 7 && month <= 9) {
  console.log("3rd Quarter");
} else if (month >= 10 && month <= 11) {
  console.log("4th Quarter");
} else {
  console.log("Invalid");
}
const email = "mafronfernandes28@gmail.com";
const emailLen = email.length;
console.log(emailLen);
const dotIndex = email.lastIndexOf(".");
const atIndex = email.lastIndexOf("@");
const lastIndex = emailLen - 1;
if (
  emailLen < 11 ||
  lastIndex - dotIndex < 2 ||
  lastIndex - dotIndex > 3 ||
  dotIndex - atIndex < 2
) {
  console.log("Invalid Email");
} else {
  console.log("Valid Email");
}

age = 18;
let testPassed = true;
if (age >= 18) {
  console.log("Enligible for the lisence.");
  if (testPassed) {
    console.log("Congratulations!, You have got the lisence.");
  } else {
    console.log("Sorry, you didnt clear the test.");
  }
} else {
  console.log("Not enligible for the lisence.");
}
let color = "red";
switch (color) {
  case "red":
    console.log("STOP the light is red");
    break;
  case "yellow":
    console.log("CAUTION the light is yellow");
    break;
  case "green":
    console.log("GO AHEAD!");
    break;
  default:
    console.log("Invalid color");
}

let num6 = 10;
let num9 = 19;
let num10 = 50;
let greater =
  num6 > num9 ? (num6 > num10 ? num6 : num10) : num9 > num10 ? num9 : num10;
// if (num6 > num9) {
//   greater = num6;
// } else {
//   greater = num9;
// }
console.log("Greater number is " + greater);
for (let r = 1; r <= 10; r++) {
  console.log("Ronaldo");
}
let k;
for (k = 1; k <= 20; k++) {
  console.log(k);
}
num = 7;
let isPrime = true;
for (let i = 2; i < num; i++) {
  if (num % i == 0) {
    isPrime = false;
    break;
  } else {
    isPrime = true;
  }
}
if (isPrime) {
  console.log("Number is prime");
} else {
  console.log("Number is not prime");
}
i = 1;
while (i <= 10) {
  console.log(i);
  i++;
}
let ramdomNum = 8;
let guessedNum;
do {
  guessedNum = parseInt(prompt("Guess the num"));
  if (guessedNum === ramdomNum) {
    console.log("Guessed correctly");
  } else {
    console.log("Take another guess");
  }
} while (guessedNum != ramdomNum);

for (let k = 2; k <= 10; k++) {
  for (let i = 1; i <= 10; i++) {
    console.log(`${k} * ${i} = ${k * i}`);
  }
  console.log("*********************");
}

// creation or defining of function
function greetUser(userName, medium) {
  console.log(`Hello ${userName}, welcome to the ${medium}!`);
}

// Call or Invoke
greetUser("Tom", "Web");
greetUser("Jerry", "App");
// Certain lines of codes
greetUser("Mark", "IOS");

function printDetails(name) {
  console.log(`Name: ${name}`);
  calculateAge(2000);
}
function calculateAge(birthYear) {
  console.log(2024 - birthYear);
}
printDetails("Mark");
function sum1(num1 = 0, num2 = 0) {
  console.log("The sum of two numbers: " + (num1 + num2));
}
sum1(10, 20);
sum1(10);

function squared(num) {
  return num * num;
}
const squared5 = squared(5);
console.log(squared5);
squared(2);
squared(8);
const historyMarks = [10, 20, 30, 50, 60];
console.log(historyMarks);
console.log(historyMarks[2]);
historyMarks[0] = 40;
console.log(historyMarks);
const studentDetails = ["Alex", 1999, "Dancing"];
console.log(studentDetails);
const Arr = new Array("Mafron", "Ronaldo", "Fernandes");
console.log(Arr);
const cities = ["Mumbai", "Delhi", "Pune", "Chennai"];
console.log(cities.length);
cities[2] = "Goa";
console.log(cities);
cities.push("Margao");
const pushedArray = cities.push("Mapusa");
console.log(pushedArray);
console.log(cities);
cities.unshift("Goa");
console.log(cities);
console.log(cities.length);
cities.pop();
cities.pop();
console.log(cities);
//shift
const GoaIndex = cities.indexOf("Chennai");
console.log(GoaIndex);
const GoaIndexincludes = cities.includes("Chennai");
console.log(GoaIndexincludes);
console.log(cities);
console.log(cities.slice(-1));
console.log(cities);

cities.splice(2, 1, "Rome", "Paris");
console.log(cities);
const cities2 = ["Manchester", "London", "Madrid"];
const mergedCities = cities.concat(cities2);
console.log(mergedCities);

const students = ["Romeo", "Jason", "Jack", "Tom", "Mark", "Luke"];
for (let i = 0; i < students.length; i++) {
  console.log(`Roll no ${i + 1}: ${students[i]}`);
}
for (let i in students) {
  console.log(`Roll no ${Number(i) + 1}: ${students[i]}`);
}
for (let student of students) {
  console.log(student);
}

const aprilBatch = ["Tina", "Madhur"];
const mayBatch = ["Ron", "Sam", "jack"];
const juneBatch = ["Mark", "Luke"];
const julyBatch = [];
function addStudent(batch, ...student) {
  for (let i of student) {
    batch.push(i);
  }
  console.log(batch);
}
addStudent(aprilBatch, "Romeo", "Mark", "Luke");

// Expand / copying
const newBatch = [...mayBatch];
console.log(newBatch);

mayBatch.push("NewStudent");
console.log(mayBatch);
console.log(newBatch);

// Concat
const mergedBatch = [...mayBatch, ...juneBatch];
console.log(mergedBatch);

const inputs = [11, 32, 12, 45, 65, 94, 7, 78, 10, 100, 131, 67, 81, 92, 53];
const evenNum = [];
for (let i of inputs) {
  if (i % 2 !== 0) {
    continue;
  }
  evenNum.push(i);
  if (evenNum.length === 5) {
    break;
  }
}
console.log(evenNum);
let str = "     Javascript,         is an is amazing, language.    ";
let charToFind = "a";

function countChars(str, char) {
  let count = 0;
  for (let i = 0; i < str.length; i++) {
    if (str.charAt(i) === char) {
      count++;
    }
  }
  console.log(`Ocurrances of character ${char} : ${count}`);
}
for (let i = 0; i < str.length; i++) {
  console.log(str.charAt(i));
}
countChars(str, charToFind);

console.log(str.includes("is"));
console.log(str.replace("is", "was"));
console.log(str);
console.log(str.replaceAll("a", "@"));
console.log(str.trim());
let words = str.split(",");
console.log(words);
console.log(str.substring(8, 15));
console.log(str.substring(-7));
console.log(str.slice(-8, -6));

const student = {
  name: "Alexa",
  age: 10,
  hobby: "dancing",
  100: "hundred",
  show: function () {
    console.log("Hello");
  },
};
console.log(student);
console.log(student.name);
console.log(student["name"]);
console.log(student[100]);
student.show();
