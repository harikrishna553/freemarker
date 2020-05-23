<#assign empDetails={ "id" : 1, "name": "krishna", "city": "Bangalore" } >

<#list empDetails as key, value> 
${key} = ${value} 
</#list>

<#list { "id" : 1, "name": "krishna", "city": "Bangalore" } as key, value> 
${key} = ${value} 
</#list>