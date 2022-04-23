<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="urn:jsptagdir:/WEB-INF/tags"%>

<acme:form> 
	<acme:input-textbox code="inventor.patronage.form.label.status" path="status"/>
	<acme:input-textbox code="inventor.patronage.form.label.legalStuff" path="legalStuff"/>
	<acme:input-money code="inventor.patronage.form.label.budget" path="budget"/>
	<acme:input-moment code="inventor.patronage.form.label.creationMoment" path="creationMoment"/>
	<acme:input-moment code="inventor.patronage.form.label.finishDate" path="finishDate"/>
	<acme:input-url code="inventor.patronage.form.label.link" path="link"/>

	
	  <h2><acme:message code="inventor.patronage.form.label.info"/></h2> 
	 <acme:input-textbox code="inventor.patronage.form.label.patronFullName" path="patronFullName"/>
    <acme:input-textbox code="inventor.patronage.form.label.name" path="patronName"/>
    <acme:input-textbox code="inventor.patronage.form.label.surname" path="patronSurname"/>
    <acme:input-email code="inventor.patronage.form.label.email" path="patronEmail"/>
</acme:form>