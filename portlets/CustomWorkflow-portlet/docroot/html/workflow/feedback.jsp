<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@ include file="init.jsp"%>
<portlet:actionURL var="submitFeedBack"
	windowState="<%=LiferayWindowState.NORMAL.toString()%>"
	name="submitFeedback">
</portlet:actionURL>
<a href="<portlet:renderURL />">&laquo;Home</a>
<div class="separator"></div>
<fieldset>
	<legend>Feedback Form</legend>
	<c:if
		test='<%=SessionMessages.contains(
						renderRequest.getPortletSession(),
						"feedback-submit-success")%>'>
		<liferay-ui:success key="feedback-submit-success"
			message="Feedback has been submited successfully." />
	</c:if>
	<c:if
		test='<%=SessionMessages.contains(
						renderRequest.getPortletSession(),
						"workflow-not-enabled")%>'>
		<liferay-ui:success key="workflow-not-enabled"
			message="Feedback not enabled with workflow please enable workflow." />
	</c:if>
	<c:if
		test='<%=SessionErrors.contains(
						renderRequest.getPortletSession(),
						"feedback-submit-failed")%>'>
		<liferay-ui:success key="feedback-submit-failed"
			message="There is problem of submit feedback please try again.." />
	</c:if>
	<aui:form action="<%=submitFeedBack%>" method="post"
		name="feedbackForm">
		<aui:layout>
			<aui:column>
				<aui:input label="Feedback Subject" name="feedbackSubject"
					id="feedbackSubject" type="text" style="width:600px;height:20px;">
					<aui:validator name="required" />
				</aui:input>
			</aui:column>
		</aui:layout>
		
		<aui:layout>
			<aui:column>
				<aui:input label="Feedback Mail from" name="feedbackMailFrom"
					id="feedbackMailFrom" type="text" style="width:600px;height:20px;">
					<aui:validator name="required" />
				</aui:input>
			</aui:column>
		</aui:layout>
		<aui:layout>
			<aui:column>
				<aui:input label="Feedback Mail to" name="feedbackMailTo"
					id="feedbackMailTo" type="text" style="width:600px;height:20px;">
					<aui:validator name="required" />
				</aui:input>
			</aui:column>
		</aui:layout>

		<aui:layout>
			<aui:input name="feedbackMessage" id="feedbackMessage"
				label="Feedback Message" type="textarea"
				style="width:600px;height:100px;">
				<aui:validator name="required" />
			</aui:input>
			<span style="float: left;">Characters Left&nbsp;</span>
			<p id="<portlet:namespace/>textCounter"></p>
		</aui:layout>
		<aui:layout>
			<aui:column>
&nbsp;
</aui:column>
		</aui:layout>
		<aui:layout>
			<aui:column>
				<aui:button type="submit" value="Submit Feedback" name="submit"></aui:button>
			</aui:column>
		</aui:layout>
	</aui:form>
</fieldset>
<aui:script>
AUI().use('aui-char-counter', function(A) {
new A.CharCounter({
counter : '#<portlet:namespace />textCounter',
input : '#<portlet:namespace />feedbackMessage',
maxLength : 75,
on : {
maxLength : function(event) {
alert('The max length limit was reached');
}
}
});
});
</aui:script>
