<!DOCTYPE html>
<html lang="en">
<head>
  <title>ComboBreaker</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="css/utils.css">
  <link rel="stylesheet" href="css/welcomePage.css">

</head>

<script type="text/javascript" src="js/servletCaller.js"></script>
<script type="text/javascript" src="js/authenticationFormValidation.js"></script>
<script type="text/javascript" src="js/heroRecruitment.js"></script>
<script type="text/javascript" src="js/heroStats.js"></script>

<body>

  <div id="screen" class="screen">

    <div class="column">

      <button onclick="changePage('/goTo/loginPage')">Login</button>

      <button onclick="changePage('/goTo/registrationPage')">Register</button>

    </div>

  </div>

  <div class="buttonsRow">
    <button style=" border-radius: 50%; border: 1px solid black; width: 3vw; height: 3vw;" onclick="changePage('/goTo/campfirePage')">
      <i class="fa-solid fa-tent fa-2x"></i>
    </button>
    <button style=" border-radius: 50%; border: 1px solid black; width: 3vw; height: 3vw;" onclick="changePage('/goTo/welcomePage')">
      <i class="fa-solid fa-house fa-2x"></i>
    </button>
  </div>

</body>

</html>