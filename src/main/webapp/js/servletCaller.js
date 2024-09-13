function callServlet(idForm){
  var mail = new XMLHttpRequest();
  var form = document.getElementById(idForm);
  var data = "";
  var url = form.action;
  var method = form.method;

  mail.open(method, url);
  mail.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

  for(const field of form.elements)
    data += field.name + "=" + field.value + "&";

  mail.onload = function() {
    document.getElementById("screen").innerHTML = this.responseText;
  }

  mail.send(data);
}

function changePage(action){
  var http = new XMLHttpRequest();

  http.open("GET", action);
  http.onload = function() {
    document.getElementById("screen").innerHTML = this.responseText;
  }

  http.send();
}