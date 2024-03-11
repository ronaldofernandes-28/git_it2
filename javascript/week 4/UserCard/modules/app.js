// import { addItem1, getTotal1, getCartContents1 } from "./cart.js";
import * as cart from "./cart.js";
cart.addItem1({ id: 1, pName: "Product1", price: 10 });
cart.addItem1({ id: 2, pName: "Product2", price: 20 });
cart.addItem1({ id: 3, pName: "Product3", price: 30 });

const cartItems = document.getElementById("cart-items");

const cartContent = cart.getCartContents1();
cartContent.forEach((item) => {
  const listItem = document.createElement("li");
  listItem.textContent = `${item.pName} - $${item.price}`;
  cartItems.appendChild(listItem);
});
const totalPriceElement = document.getElementById("total-price");
totalPriceElement.textContent = `Total: $${cart.getTotal1()}`;
