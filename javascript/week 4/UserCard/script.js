const divEle = document.querySelector(".card-container");
function getUser(url) {
  return fetch(url).then((response) => {
    if (!response.ok) {
      throw new Error("ID does not match any data");
    }
    return response.json();
  });
}
async function getDetail(id) {
  try {
    const response = await fetch(`https://dummyjson.com/users/${id}`);
    console.log(response);
    if (!response.ok) {
      throw new Error("No data present");
    }
    const userData = await response.json();
    displayUser(userData, "beforeend");
  } catch (err) {
    console.log(err);
  }
  // const req = fetch(`https://dummyjson.com/users/${id}`);
  // // console.log(req);
  // const response = req.then((response) => {
  //   console.log(response);
  //   return response.json();
  // });
  // response.then((user) => console.log(user));
  // getUser(`https://dummyjson.com/users/${id}`)
  //   .then((user) => {
  //     displayUser(user, "beforeend");
  //     return fetch(`https://dummyjson.com/users/${id - 1}`);
  //   })
  //   .then((response) => {
  //     if (!response.ok) {
  //       throw new Error("No previous IDs exist");
  //     }
  //     return response.json();
  //   })
  //   .then((user) => {
  //     displayUser(user, "afterbegin", "other");
  //   })
  //   .catch((err) => {
  //     console.error(err);
  //   });
}
function displayUser(data, pos, className = "") {
  const card = `<div class="user-card" ${className}> 
        <img src=${data.image} alt="Profile Image" />
        <h3>${data.firstName}</h3>
        <h3>${data.lastName}</h3>
        <p class="email">${data.email}</p>
        <button class="btn">View Profile</button>
        </div>`;
  divEle.insertAdjacentHTML(pos, card);
}
getDetail(2);
function calculateArea(radius) {
  return Math.PI * radius * radius;
}
document
  .getElementById("calculate-button")
  .addEventListener("click", function () {
    let radiusInput = document.getElementById("radius-input");
    let radius = parseFloat(radiusInput.value);
    if (!isNaN(radius)) {
      let area = calculateArea(radius);
      let resultElement = document.getElementById("result");
      resultElement.textContent =
        "The area of the circle is " + area.toFixed(2);
    } else {
      let resultElement = document.getElementById("result");
      resultElement.textContent = "Please enter a valid number for radius.";
    }
  });

const shoppingCart = (function () {
  let cart = [];
  let total = 0;
  function calculateTotal() {
    total = cart.reduce((acc, item) => acc + item.price, 0);
  }
  return {
    addItem: function (item) {
      cart.push(item);
      calculateTotal();
    },
    getTotal: function () {
      return total;
    },
    getCartContents: function () {
      return cart;
    },
  };
})();

export default shoppingCart;
