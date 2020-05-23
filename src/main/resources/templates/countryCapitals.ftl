Approach 1
-------------
<#list countries?keys as key> 
    ${key} = ${countries[key]} 
</#list> 

Approach 2
-----------
<#list countries as key, value> 
    ${key} = ${value} 
</#list>
