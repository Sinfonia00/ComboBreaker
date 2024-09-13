function validateAuthenticationForm(idForm){
  let usernameField = document.getElementById("usernameField");
  let emailField = document.getElementById("emailField");
  let passwordField = document.getElementById("passwordField");

  let check1 = (usernameField.disabled ? true : validateUsername(document.getElementById("usernameField").value));
  let check2 = validateEmail(document.getElementById("emailField").value);
  let check3 = validatePassword(document.getElementById("passwordField").value);

  if(check1 && check2 && check3)
    callServlet(idForm);

}

function validateEmail(email) {
  let emailRegex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
  document.getElementById("emailErrorMessage").innerHTML = "";

  if(!email.match(emailRegex)){
    document.getElementById("emailErrorMessage").innerHTML = "<p>The email is not valid</p>";
    return false;
  }

  return true;
}

function validatePassword(password) {
  document.getElementById("passwordErrorMessage").innerHTML = "";

  if (password.length < 8) {
    document.getElementById("passwordErrorMessage").innerHTML = "<p>Your password must be at least 8 characters</p>";
    return false;
  }
  if (password.search(/[A-Z]/g) < 0) {
    document.getElementById("passwordErrorMessage").innerHTML = "<p>Your password must contain at least one capital letter</p>";
    return false;
  }
  if (password.search(/[a-z]/g) < 0) {
    document.getElementById("passwordErrorMessage").innerHTML = "<p>Your password must contain at least one lowercase letter</p>";
    return false;
  }
  if (password.search(/[0-9]/g) < 0) {
    document.getElementById("passwordErrorMessage").innerHTML = "<p>Your password must contain at least one digit</p>";
    return false;
  }

  return true;
}

function validateUsername(username) {
  let usernameRegex = "^[a-zA-Z0-9]{4,10}$";
  document.getElementById("usernameErrorMessage").innerHTML = "";

  if(username.length < 4  || username.length > 10){
    document.getElementById("usernameErrorMessage").innerHTML = "<p>The username must be at least 4 and at max 10 characters</p>";
    return false;
  }

  if(!username.match(usernameRegex)){
    document.getElementById("usernameErrorMessage").innerHTML = "<p>The username cannot have special characters</p>";
    return false;
  }

  return true;
}