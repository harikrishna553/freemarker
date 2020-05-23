<#assign a = 10, b = 11>

a : ${a}
b : ${b}

is a equals to a :  ${(a==a)?string}
is a equals to b : ${(a==b)?string}
is a not equals to a : ${(a!=a)?string}
is a not equals to b : ${(a!=b)?string}
is a less than a : ${(a<a)?string}
is a less than b : ${(a<b)?string}
is a less than or equal to a : ${(a<=a)?string}
is a less than or equal b : ${(a<=b)?string}
is a greater than a : ${(a>a)?string}
is a greater than b : ${(a>b)?string}
is a greater than or equal to a : ${(a>=a)?string}
is a greater than or equal to b : ${(a>=b)?string}

