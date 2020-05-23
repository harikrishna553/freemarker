<#assign a=10, b=11, c=true >

<#assign d = a + b>

a : ${a}
b : ${b}
c : ${c?string}
d : ${d}

