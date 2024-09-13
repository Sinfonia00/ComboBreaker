<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div style="display: flex; justify-content: space-around; flex-direction: column; height: 80%;">

  <c:forEach var = "i" begin = "0" end = "2">

     <c:choose>

        <c:when test="${heroes.size() > i}">

          <form:form id="hero${i}" modelAttribute="heroForm" action="/campfire/chooseHero" method="POST">

            <form:hidden path="id" value="${heroes.get(i).id}"/>

            <button type="button" onclick="callServlet('hero${i}')">
              <p>
                <span>${heroes.get(i).name}</span>
                <span>LV:${heroes.get(i).level}</span>
                <span>${heroes.get(i).heroClass.className}</span>
              </p>
              <p>
                <span>STR: ${heroes.get(i).strength}</span>
                <span>DEX: ${heroes.get(i).dexterity}</span>
                <span>CON: ${heroes.get(i).constitution}</span>
                <span>INT: ${heroes.get(i).intelligence}</span>
                <span>WIS: ${heroes.get(i).wisdom}</span>
                <span>CHA: ${heroes.get(i).charisma}</span>
              </p>
            </button>

          </form:form>

        </c:when>

        <c:otherwise>
           <button onclick="changePage('/goTo/heroRecruitmentPage')">Recruit a new hero!</button>
        </c:otherwise>

     </c:choose>

  </c:forEach>

</div>


