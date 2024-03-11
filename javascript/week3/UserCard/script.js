const divEle = document.querySelector(".card-container");
function getDetail(id) {
  const req = new XMLHttpRequest();
  console.log(req);
  req.open("GET", `https://dummyjson.com/users/${id}`);
  req.send();
  req.addEventListener("load", function () {
    if (req.status === 404) {
      return;
    }
    console.log(typeof req.responseText);
    console.log(JSON.parse(this.responseText));
    const data = JSON.parse(this.responseText);
    console.log(data);
    displayUser(data, "beforeend");

    const req2 = new XMLHttpRequest();
    req2.open("GET", `https://dummyjson.com/users/${id - 1}`);
    req2.send();
    req2.addEventListener("load", function () {
      if (req2.status === 404) {
        return;
      }
      console.log(typeof req2.responseText);
      console.log(JSON.parse(this.responseText));
      const data2 = JSON.parse(this.responseText);
      console.log(data2);
      displayUser(data2, "afterbegin", "other");
    });
  });
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
getDetail(1);
