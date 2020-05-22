<#if name??>
	Welcome ${name}!
<#else>
	Welcome Visitor
</#if>


<#if hobbies??>
	<#list hobbies>
		<#items as hobby>
			${hobby}
		</#items>
	</#list>
<#else>
	No Hobbies entered for user
</#if>
