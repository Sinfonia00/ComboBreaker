<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="column">

  <h1>ComboBreaker</h1>
  <p>Login</p>

  <form:form modelAttribute="loginForm" id="loginForm" method="POST" action="/authentication/login" >

    <form:hidden id="usernameField" path="username" value="null" disabled="true"/>

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
        <form:password id="passwordField" path="password" />
      </span>
      <p id="passwordErrorMessage" class="errorMessage">
        <form:errors path = "password" />
      </p>
    </p>

    <div class="center">
      <button type="button" onclick="validateAuthenticationForm('loginForm')">Login</button>
    </div>

    <p id="formErrorMessage" class="errorMessage">
      <c:out value="${errorForm}"></c:out>
    </p>

  </form:form>

    <p>You are not registered?

      <button class="hypertextButton" onclick="changePage('/goTo/registrationPage')">
        Register now!
      </button>

    </p>

</div>