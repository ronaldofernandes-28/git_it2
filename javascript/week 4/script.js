const req = new Promise((resolve, reject) => {
  setTimeout(() => {
    console.log("promise Initiated");
    resolve({ firstname: "Mafron", lastname: "Fernandes" });
    reject("Request has been rejected");
  }, 1000);
});
req
  .then((value) => {
    console.log(value);
  })
  .catch((err) => {
    console.log(err);
  })
  .finally(() => {
    console.log("Request completed");
  });
console.log(req);
