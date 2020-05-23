<#assign a = 10, b = true, c = false, d = 123.45>

a : ${a}
b : ${b?string("yes", "no")}
c : ${c?string("yes", "no")}
d : ${d}


"a : ${a}"
"b : ${b?string("yes", "no")}"
"c : ${c?string("yes", "no")}"
"d : ${d}"