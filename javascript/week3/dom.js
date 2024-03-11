console.log(document.querySelector("h1")); // only outputs first instance
console.log(document.querySelectorAll("h1"));
const firstHead = document.querySelectorAll("h1");
console.log(firstHead);
console.log(document.querySelector(".second"));
console.log(document.querySelector("#para"));

const heading = document.querySelector(".second");
const para = document.querySelector("#para");
console.log(heading);
console.log(para);
console.log(document.getElementById("para"));
console.log(document.getElementsByClassName("first"));
console.log(document.getElementsByTagName("h2"));
heading.style.color = "red";
para.style.backgroundColor = "grey";

const btn = document.createElement("button");
btn.textContent = "Click here";
btn.className = "btn1";
const division = document.querySelector("div");
division.appendChild(btn);

document.querySelector("h2").remove();
const p = document.querySelector("p");
p.addEventListener("click", function () {
  // mouseover
  clickPara("Hello");
});
p.addEventListener("mouseover", function () {
  // mouseover
  p.style.backgroundColor = "yellow";
});
p.addEventListener("mousedown", function () {
  // mouseover
  p.style.backgroundColor = "red";
});
p.addEventListener("mouseup", function () {
  // mouseover
  p.style.backgroundColor = "purple";
});
function clickPara(name) {
  console.log(name + " Para clicked");
}
document.body.addEventListener("keydown", (event) => {
  console.log("Key Down");
  console.log(event.key);
});
// Bubbling
document.querySelector("h4").addEventListener("click", (event) => {
  event.stopPropagation();
  console.log("Heading 4 clicked"), true;
});

document
  .getElementById("innerDiv")
  .addEventListener("click", () => console.log("Inner div clicked"), true);
document.querySelector("h2").addEventListener("click", (event) => {
  event.stopPropagation();
  console.log("Heading 2 clicked"), true;
});
document
  .getElementsByTagName("div")[0]
  .addEventListener("click", (event) => console.log("Outer div clicked"), true);
document.body.addEventListener("click", (event) => {
  event.stopPropagation();
  console.log("Body clicked"), true;
});

console.log("Message before Alert");
alert("Blocking JS");
console.log("Message after Alert");

const buttonElement = document.querySelector("#button1");
const textElement = document.querySelector("#text");
buttonElement.addEventListener("click", () => {
  textElement.textContent = "button is pressed";
  setTimeout(() => {
    textElement.textContent = "";
  }, 2000);
});
const textElement1 = document.querySelector("#text1");
let seconds = 0;
textElement1.textContent = `${seconds}`;
const timer = setInterval(() => {
  seconds++;
  textElement1.textContent = `${seconds}`;
  if (seconds >= 5) {
    clearInterval(timer);
  }
}, 1000);

function greet(callback) {
  setTimeout(() => {
    console.log("Hello");
    callback();
  }, 1000);
}

function message() {
  console.log("Welcome to the session!");
}
greet(message);
