const express = require("express");
const app = express();

app.listen(3000, () => {
  console.log("listen 3000.");
});

app.all("*", (req, res) => {
  res.sendFile(__dirname + "/index.html");
});