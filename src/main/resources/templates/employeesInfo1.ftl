<#list employees>
		Id   		first_name  	last_name
		-------------------------------------------
		
	<#items as employee>
		${employee.id} 	 	${employee.firstName}		${employee.lastName}
	</#items>

	Done printing all the employees information

<#else>
No Employees exist
</#list>
