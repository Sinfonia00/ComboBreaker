<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="column">

  <h1>ComboBreaker</h1>
  <p>Registration</p>

  <form:form modelAttribute="registrationForm" id="registrationForm" method="POST" action="/authentication/registration">

    <p class="column">
      <span>
        <form:label path="username">Username:</form:label>
        <form:input id="usernameField" path="username" />
      </span>
      <p id="usernameErrorMessage" class="errorMessage">
        <form:errors path = "username" />
      </p>
    </p>

    <p class="column">
      <span>
        <form:label path="email">Email:</form:label>
        <form:input id="emailField" path="email" />
      </span>
      <p id="emailErrorMessage" class="errorMessage">
        <form:errors path = "email" />
      </p>
    </p>

    <p class="column">
      <span>
        <form:label path="password">Password:</form:label>
        <form:password id="passwordField"  path="password" />
      </span>
      <p id="passwordErrorMessage" class="errorMessage">
        <form:errors path = "password" />
      </p>
    </p>

    <div class="center">
      <button type="button" onclick="validateAuthenticationForm('registrationForm')">Register</button>
    </div>

    <p id="formErrorMessage" class="errorMessage">
      <c:out value="${errorForm}"></c:out>
    </p>

  </form:form>

    <p>Already registered?

      <button class="hypertextButton" onclick="changePage('/goTo/loginPage')">
        Login now!
      </button>

    </p>

</div>