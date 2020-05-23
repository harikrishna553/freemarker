<#assign empDetails={ "id" : 1, "name": "krishna", "city": "Bangalore" } >

<#list empDetails as key, value> 
${key} = ${value} 
</#list>


<#assign items = [1, 2, 3, 4]>
<#list items as item> 
Value of item is ${item}
</#list>

<#assign a=10, b=11, name="Krishna">

Value of a is ${a}
Value of b is ${b}
Value of name is ${name}