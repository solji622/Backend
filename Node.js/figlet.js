var figlet = require("figlet"); //figlet이라는 모듈을 요구(require)함

figlet("Hello World!!", function (err, data) {
  if (err) {
    console.log("Something went wrong...");
    console.dir(err);
    return;
  }
  console.log(data);
});
