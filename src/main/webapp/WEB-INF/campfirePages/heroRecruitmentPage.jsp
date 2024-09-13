<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div style="display: flex; flex-direction: column; align-items: center;">

  <form:form modelAttribute="heroForm" id="heroForm" method="POST" action="/campfire/heroRecruitment">

    <p>
      <form:label path="name">Name:</form:label>
      <form:input path="name" required="required"/>
      <form:errors path = "name" />
    </p>

    <p>
      <form:label path="heroClass">Class:</form:label>
      <form:select path="heroClass" onchange="showStartingStats(this)">
        <form:option value="-1" label="Select a class for your hero" selected="true" disabled="true"/>

        <c:forEach var="heroClass" items="${heroClasses}">
          <form:option value="${heroClass.id}" label="${heroClass.className}" />
        </c:forEach>

      </form:select>
      <form:errors path = "heroClass" />
    </p>

    <c:forEach var="heroClass" items="${heroClasses}" varStatus="i">
      <div id="startingStats${i.index}" style="display: none;">
        <p style="text-align: center;">STR: ${heroClass.startingStrength}</p>
        <p style="text-align: center;">DEX: ${heroClass.startingDexterity}</p>
        <p style="text-align: center;">CON: ${heroClass.startingConstitution}</p>
        <p style="text-align: center;">INT: ${heroClass.startingIntelligence}</p>
        <p style="text-align: center;">WIS: ${heroClass.startingWisdom}</p>
        <p style="text-align: center;">CHA: ${heroClass.startingCharisma}</p>
        <p style="text-align: center;">EXTRA POINTS: ${heroClass.extraStatsPoints}</p>
      </div>
    </c:forEach>



    <c:forEach var="technique" items="${techniques}" varStatus="i">
      <p> <form:checkbox path="aaa" value="${technique.id}" label="aaa"/> </p>
    </c:forEach>





    <div style="display: flex; justify-content: center; align-items: center;">
      <button type="button" onclick="callServlet('heroForm')">Recruit</button>
    </div>

  </form:form>

  <button onclick="changePage('/goTo/heroChoicePage')">hero choice</button>

</div>