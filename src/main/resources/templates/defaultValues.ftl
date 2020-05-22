Welcome ${name!"visitor"}!

<#list hobbies![]>
	Your Hobbies are
	<#items as hobby>
		${hobby}
	</#items>
</#list>