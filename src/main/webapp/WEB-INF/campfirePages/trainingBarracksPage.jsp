<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<script type="text/javascript" src="js/heroStats.js"></script>

<div style="display: flex; flex-direction: column;">

  <form:form id="heroForm" method="POST" action="/campfire/assignPoints" modelAttribute="heroStatsForm" style="display: flex; flex-direction: column;">

    <div style="display: flex; flex-direction: row; align-items: center; justify-content: center;">
      <button type="button" onclick="decreaseStat('str')">-</button>

      <div style="display: flex; flex-direction: row; align-items: center; justify-content: center; margin: 0 2vw;">
        <form:label path="strExtra">STR</form:label>
        <form:hidden id="strExtra" path="strExtra" value="${strExtra}"/>
        <p id="strBase" style="display: none;">${hero.strength}</p>
        <p id="strTotal"> <c:out value="${hero.strength + strExtra}">Error</c:out> </p>
      </div>

      <button type="button" onclick="increaseStat('str')">+</button>
    </div>

    <div style="display: flex; flex-direction: row; align-items: center; justify-content: center;">
      <button type="button" onclick="decreaseStat('dex')">-</button>

      <div style="display: flex; flex-direction: row; align-items: center; justify-content: center; margin: 0 2vw;">
        <form:label path="dexExtra">DEX</form:label>
        <form:hidden path="dexExtra" readonly="true"/>
        <p id="dexBase" style="display: none;">${hero.dexterity}</p>
        <p id="dexTotal"> <c:out value="${hero.dexterity + dexExtra}">Error</c:out> </p>
      </div>

      <button type="button" onclick="increaseStat('dex')">+</button>
    </div>

    <div style="display: flex; flex-direction: row; align-items: center; justify-content: center;">
      <button type="button" onclick="decreaseStat('con')">-</button>

      <div style="display: flex; flex-direction: row; align-items: center; justify-content: center; margin: 0 2vw;">
        <form:label path="conExtra">COS</form:label>
        <form:hidden path="conExtra" readonly="true"/>
        <p id="conBase" style="display: none;">${hero.constitution}</p>
        <p id="conTotal"> <c:out value="${hero.constitution + cosExtra}">Error</c:out> </p>
      </div>

      <button type="button" onclick="increaseStat('con')">+</button>
    </div>

    <div style="display: flex; flex-direction: row; align-items: center; justify-content: center;">
      <button type="button" onclick="decreaseStat('int')">-</button>

      <div style="display: flex; flex-direction: row; align-items: center; justify-content: center; margin: 0 2vw;">
        <form:label path="intExtra">INT</form:label>
        <form:hidden path="intExtra" readonly="true"/>
        <p id="intBase" style="display: none;">${hero.intelligence}</p>
        <p id="intTotal"> <c:out value="${hero.intelligence + intExtra}">Error</c:out> </p>
      </div>

      <button type="button" onclick="increaseStat('int')">+</button>
    </div>

    <div style="display: flex; flex-direction: row; align-items: center; justify-content: center;">
      <button type="button" onclick="decreaseStat('wid')">-</button>

      <div style="display: flex; flex-direction: row; align-items: center; justify-content: center; margin: 0 2vw;">
        <form:label path="widExtra">WID</form:label>
        <form:hidden path="widExtra" readonly="true"/>
        <p id="widBase" style="display: none;">${hero.wisdom}</p>
        <p id="widTotal"> <c:out value="${hero.wisdom + widExtra}">Error</c:out> </p>
      </div>

      <button type="button" onclick="increaseStat('wid')">+</button>
    </div>

    <div style="display: flex; flex-direction: row; align-items: center; justify-content: center;">
      <button type="button" onclick="decreaseStat('cha')">-</button>

      <div style="display: flex; flex-direction: row; align-items: center; justify-content: center; margin: 0 2vw;">
        <form:label path="chaExtra">CHA</form:label>
        <form:hidden path="chaExtra" readonly="true"/>
        <p id="chaBase" style="display: none;">${hero.charisma}</p>
        <p id="chaTotal"> <c:out value="${hero.charisma + chaExtra}">Error</c:out> </p>
      </div>

      <button type="button" onclick="increaseStat('cha')">+</button>
    </div>

    <p>AVAILABLE POINTS <span id="availablePoints">${hero.statsPoints}</span></p>

    <button type="button" onclick="callServlet('heroForm')">Assegna punti</button>

  </form:form>

  <button onclick="changePage('/goTo/campfirePage')">campfire</button>

</div>