("use strict");
var varNum = 10;
let letNum = 20;
const constNum = 30;
function print() {
  {
    var varLocal = 10;
    let letLocal = 20;
    const constLocal = 30;
    console.log(varNum, letNum, constNum);
  }
  console.log(varNum, letNum, constNum);
  // console.log(varLocal, letLocal, constLocal);
}
console.log(varNum, letNum, constNum);
print();

//Function Declaration
function sum(a, b) {
  return a + b;
}
const sum1 = sum(5, 7);
console.log(sum1);

// Function expression
const sum2 = function (a, b) {
  return a + b;
};

console.log(sum2(2, 8));
// arrow function
var prod = (num1, num2) => {
  return num1 * num2;
};
console.log(prod(2, 8));
var prod1 = (num1, num2) => num1 * num2;
console.log(prod1(2, 8));
(function (a, b) {
  console.log(a ** b);
})(2, 8);
const user = (function () {
  const userData = {
    userName: "John",
    userAge: 20,
  };
  function getName() {
    console.log(userData.username);
  }
  function updateAge(age) {
    console.log(userData.userAge + age);
  }
  return { getName, updateAge };
})();
console.log(user);
console.log(user.getName());
console.log(user.updateAge(3));
console.log(user.userData);

function calculate(num1, num2) {
  return num1 * num2;
}

console.log(calculate(2, 7));
const discount = 25;
function calcDis(price) {
  discount = discount - 5;
  return price - discount;
}
function greet1(wish) {
  console.log(`${wish()}, welcome to the javascript`);
}
function sayhi() {
  return "Hi!";
}
function sayHello() {
  return "Hello";
}
function goodMorning() {
  return "Good Morning";
}
greet(sayhi);
greet(sayHello);
greet(goodMorning);

function greet(message) {
  return function (wishes) {
    console.log(`${wishes}, ${message}`);
  };
}

const greeting = greet("I hope you're doing well");
greeting("Hello");
greet("Welcome to the session")("Hi");

const inputs = [2, 3, 4, 5, 6, 7, 8];
function square(input) {
  const squared = [];
  for (let num of inputs) {
    squared.push(num * num);
  }
  return squared;
}
function cube(input) {
  const cubic = [];
  for (let num of inputs) {
    cubic.push(num * num * num);
  }
  return cubic;
}
console.log(square(inputs));
console.log(cube(inputs));

function operation(input, fn) {
  const output = [];
  for (let num of input) {
    output.push(fn(num));
  }
  return output;
}
function squaring(num) {
  return num * num;
}
function cube(num) {
  return num * num * num;
}
console.log(operation(inputs, squaring));
console.log(operation(inputs, cube));

function add4(a, b, c) {
  return a + b + c;
}
console.log(add4(2, 7, 8));

function add3(a) {
  return function (b) {
    return function (c) {
      return a + b + c;
    };
  };
}
console.log(add3(2)(7)(8));
function power(a, b) {
  return b ** a;
}
function power1(b) {
  return function (a) {
    return a ** b;
  };
}
const square1 = power1(2);
console.log(square1);
console.log(square1(4));
console.log(square1(3));
console.log(square1(11));

const cube1 = power1(3);
console.log(cube1);
console.log(cube1(4));
console.log(cube1(3));
console.log(cube1(11));

const inputs1 = [1, 2, 3, 4, 5];
const squared_arr = inputs1.map(function (currentElement) {
  return currentElement * currentElement;
});
console.log(squared_arr);

const squared_arr1 = inputs1.map((num) => num * num);
console.log(squared_arr1);

const sum5 = inputs1.reduce((total, num, index) => {
  console.log(total, index);
  return total + num;
}, 0);
console.log(sum5);
const inputs2 = [4, 10, 2, -3, -2, 5, 9, -1];
const positives = inputs2.filter(noNegative);
function noNegative(num) {
  return num > 0;
}
console.log(`Original array : ${inputs2}`);
console.log(`only Positives numbers: ${positives}`);

const negatives = inputs2.filter((num) => num < 0);
console.log(negatives);

const inputs3 = [22, 13, 15, 77, 65, 98, 76, 44, 55];
const find1 = inputs3.find((num) => num == 65);
console.log(find1);
const find2 = inputs3.findIndex((num) => num == 65);
console.log(find2);
// every, fill, findLast, findLastIndex, forEach
console.log(this);
var user1 = "John";
console.log(this.user1);
function checkThis() {
  console.log(this);
}
("use strict");
checkThis();
const checkArrow = () => {
  console.log(this);
};
checkArrow();
const user2 = {
  userName: "John",
  userAge: 18,
  work: function () {
    console.log(this);
  },
};
user2.work();
const user3 = {
  userName: "Harry",
};
user3.work = user2.work;
console.log(user3);
user3.work();

const movie = {
  title: "The Avengers",
  year: 2012,
  genre: "Action, Sci-Fi, Thriller",
  cast: { main_lead: "Robert Downey Jr.", others: "chris Evans" },
  getDetails: function () {
    console.log(
      `Title: ${this.title}\n Year: ${movie.year}\n Genre: ${movie.genre}\n Cast: ${movie.cast}`
    );
  },
  getMovieDetails(detail) {
    console.log(movie[detail]);
  },
};

console.log(movie.title);
movie.getDetails();
const detail = "year";
movie.getMovieDetails(detail);
console.log(movie.cast.main_lead);

function movie3(title, year) {
  const movie1 = {
    title: title,
    year: year,
    genre: "Action, Sci-Fi, Thriller",
    cast: { main_lead: "Robert Downey Jr.", others: "chris Evans" },
    getDetails: function () {
      console.log(
        `Title: ${this.title}\n Year: ${this.year}\n Genre: ${this.genre}\n Cast: ${this.cast}`
      );
    },
    getMovieDetails(detail) {
      console.log(movie1[detail]);
    },
  };
  return movie1;
}

const movie4 = movie3("The Avengers", 2012);
console.log(movie4);
movie4.getDetails();

const movie5 = movie3("The Jungle Book", 2012);
console.log(movie5);
movie5.getDetails();

function Movie(title, year) {
  this.title = title;
  this.year = year;
  this.getDetails = function () {
    console.log(
      `Title: ${this.title}\n Year: ${this.year}\n Genre: ${this.genre}\n Cast: ${this.cast}`
    );
  };
}
Movie.prototype.listDetails = function () {
  console.log(
    `Title: ${this.title}\n Year: ${this.year}\n Genre: ${this.genre}\n Cast: ${this.cast}`
  );
};
Movie.prototype.years = 50;
const movie6 = new Movie("Iron Man", 2008);
console.log(movie6);
movie6.getDetails();
console.log(movie6.__proto__);

movie6.rating = 5;
console.log(movie6);

const movie7 = new Movie("Your name", 2016);
console.log(movie7);
console.log(movie7.__proto__.__proto__);
console.log(movie7.__proto__.__proto__.__proto__);
const car = {
  name: "BMW",
};
console.log(car.__proto__);
const inputs4 = [1, 2, 3, 4, 5];
console.log(inputs.__proto__.__proto__);

const car1 = {
  name: "car",
  color: "black",
  getDetails(brand, seats) {
    console.log(
      `This is a ${this.color} ${this.name} of ${brand} company. It has ${seats} seats`
    );
  },
};
const car2 = Object.create(car1);
console.log(car2.__proto__);
car2.getDetails("Audi", 8);
car1.getDetails("BMW", 8);

const bus = {
  name: "bus",
  color: "blue",
};
car1.getDetails.call(bus, "star", 50);
car1.getDetails.apply(bus, ["gold", 50]);
const vehicle = car1.getDetails.bind(bus);
vehicle("Silver", 80);
vehicle("Bronze", 28);
const obj = {
  a: 1,
  b: 2,
  c: ["0", "B", "J"],
  d: { value: "Val" },
};
const { a, c } = obj; // const a = obj.a
console.log(a);
console.log(c);
//Binding Pattern
const { a: a1 } = obj;
console.log(a1);

// Assignment Pattern
let b;
({ b: b } = obj);
console.log(b);
const fruits = ["Apple", "Mango", "Kiwi", "Berry", "banana", "lichi"];
const [app, , , k] = fruits;
console.log(app, k);
const [ap, ma, ...[, be, ba]] = fruits;
console.log(be);
// class expressions
const Vehicle = class {};
// Classes in JS ... class declaration
class VehicleCl {
  static vname = "Static Name";
  // property
  name;
  color;
  wheels;
  // Private Property
  #regNumber;
  // constructor
  constructor(name, color, wheels, number) {
    this.name = name;
    this.color = color;
    this.wheels = wheels;
    this.#regNumber = number;

    this.getDetails1 = function () {
      console.log(
        `This ${name} is ${this.color} in color. It has ${
          this.wheels
        } wheels. Registration number is: ${this.#getNumber(this.#regNumber)}`
      );
    };
  }
  // private number
  #getNumber(number) {
    return number;
  }
  // methods
  getDetails() {
    console.log(
      `This ${this.name} is ${this.color} in color. It has ${this.wheels} wheels.`
    );
  }
  // static method
  static showMsg() {
    console.log("This is static method of the class");
  }
}
VehicleCl.prototype.getDetails2 = function () {
  console.log(
    `This ${this.name} is ${this.color} in color. It has ${this.wheels} wheels.`
  );
};
function car3(name, color, wheels, brand, seats) {
  this.name = name;
  this.color = color;
  this.wheels = wheels;
  this.brand = brand;
  this.seats = seats;
}

const veh1 = new VehicleCl("Scooter", "grey", 2, 8888);
console.log(veh1);
VehicleCl.showMsg();
console.log(VehicleCl.vname);
veh1.getDetails1();
console.log(veh1.hasOwnProperty("name"));
console.log(veh1.hasOwnProperty("getDetails1"));
veh1.name = "BMW";
veh1.getDetails();
class car4 extends VehicleCl {
  constructor(color, brand, purpose) {
    super("Car", color, 4, 888);
    this.brand = brand;
    this.purpose = purpose;
  }
  getDetails() {
    console.log(
      `This ${this.name} is ${this.color} in color of ${this.brand} company. It is for ${this.purpose}`
    );
  }
}
const car5 = new car4("Red", "Audi", "Luxury Travelling");
car5.getDetails();
console.log(car5);
console.log(car5.__proto__);

function vehiclex(name, color, wheels) {
  this.name = name;
  this.color = color;
  this.wheels = wheels;
}
vehiclex.prototype.getDetails2 = function () {
  console.log(
    `This ${this.name} is ${this.color} in color. It has ${this.wheels} wheels.`
  );
};

function carx(color, brand, wheels, seats) {
  vehiclex.call(this, "car", "blue", 4);
  vehiclex("car", color, 8);
  this.brand = brand;
  this.seats = seats;
}
carx.prototype.getDetails2 = function () {
  console.log(
    `This ${this.name} is ${this.color} in color. It has ${this.wheels} wheels.`
  );
};
const c1 = new carx(("Blue", "Audi", 4));
c1.prototype = Object.create(vehiclex.prototype);
c1.getDetails2();
console.log(c1);
console.log(c1.__proto__);
c1.getDetails2();
class Circle {
  constructor(radius) {
    this.radius = radius;
  }
  getDiameter() {
    console.log(this.radius * 2);
  }
  get diameter() {
    return this.radius * 2;
  }
  set diameter(newDiameter) {
    if (newDiameter >= 0) {
      this.radius = newDiameter / 2;
    } else {
      console.log("Invalid Input");
    }
  }
}
const circle = new Circle(8);
console.log(circle.radius);
circle.getDiameter();
console.log(circle.diameter);
circle.diameter = 16;
console.log(circle.radius);
circle.diameter = -2;
console.log(circle.radius);

const today = new Date();
console.log(today);
const birthDate = new Date("2000-02-08");
console.log(birthDate);
const someDay = new Date(2000, 1, 8);
console.log(someDay);
console.log(typeof birthDate.getFullYear());
console.log(birthDate.toDateString());
const birthStr = birthDate.toDateString();
console.log(birthStr.slice(5, 20));

const user7 = {
  userName: "Sara",
  age: 12,
  marks: {
    maths: 20,
    eng: 25,
  },
  getMarks() {
    console.log(this.marks);
  },
};
// shallow copy
const user8 = user7;
console.log(user7);
console.log(user8);
user8.userName = "Harry";
console.log(user7);
console.log(user8);
// Object.assign
const user10 = Object.assign({}, user7);
const user9 = { ...user7 };
console.log(user7);
console.log(user9);
user7.userName = "Sara";
user9.userName = "Harry";
user9.marks.maths = 18;
console.log(user7);
console.log(user9);
console.log(user7);
console.log(user10);
user7.userName = "Sara";
user10.userName = "Tom";
console.log(user10);

// Deep copy
const user11 = JSON.parse(JSON.stringify(user7));
user7.userName = "Sara";
user11.userName = "Mark";
user9.marks.maths = 18;
console.log(user7);
console.log(user11);
