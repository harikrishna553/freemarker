${"Printing 1..4"}

<#list 1..4 as item>
Value of element is : ${item}
</#list>

${"Printing 4..1"}

<#list 4..1 as item>
Value of element is : ${item}
</#list>

${"Printing 1..<4"}

<#list 1..<4 as item>
Value of element is : ${item}
</#list>

${"Printing 4..<1"}

<#list 4..<1 as item>
Value of element is : ${item}
</#list>

${"Printing 10..*4"}

<#list 10..*4 as item>
Value of element is : ${item}
</#list>

${"Printing 10..*-4"}

<#list 10..*-4 as item>
Value of element is : ${item}
</#list>