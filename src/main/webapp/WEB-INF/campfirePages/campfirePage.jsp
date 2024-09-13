<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div style="display: flex; flex-direction: column; align-items: center;">

  <p>Hero: <span> <c:out value = "${hero.name}">No Value</c:out> </span></p>
  <p>LV: <span> <c:out value = "${hero.level}">No Value</c:out> </span></p>
  <p>Class: <span> <c:out value = "${hero.heroClass.className}">No Value</c:out> </span></p>

  <p> <c:out value = "${hero.heroTechnique1.techniqueName}">No Value</c:out> </p>
  <p> <c:out value = "${hero.heroTechnique2.techniqueName}">No Value</c:out> </p>
  <p> <c:out value = "${hero.heroTechnique3.techniqueName}">No Value</c:out> </p>
  <p> <c:out value = "${hero.heroTechnique4.techniqueName}">No Value</c:out> </p>

  <button onclick="changePage('/goTo/trainingBarracksPage')">training barracks</button>
  <button onclick="changePage('/goTo/trainingGroundPage')">training ground</button>

</div>