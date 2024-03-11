import cart from "./script.js";
cart.addItem({ id: 1, pName: "Product1", price: 10 });
cart.addItem({ id: 2, pName: "Product2", price: 20 });
cart.addItem({ id: 3, pName: "Product3", price: 30 });

const cartItems = document.getElementById("cart-items");

const cartContent = cart.getCartContents();
cartContent.forEach((item) => {
  const listItem = document.createElement("li");
  listItem.textContent = `${item.pName} - $${item.price}`;
  cartItems.appendChild(listItem);
});
const totalPriceElement = document.getElementById("total-price");
totalPriceElement.textContent = `Total: $${cart.getTotal()}`;

let total1 = 0;
function calculateTotal1() {
  total = cart.reduce((acc, item) => acc + item.price, 0);
}
export function addItem1(item) {
  cart.push(item);
  calculateTotal();
}
export function getTotal1() {
  return total;
}
export function getCartContents1() {
  return cart;
}
