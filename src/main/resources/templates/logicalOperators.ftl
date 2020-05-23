<#assign a=true, b=false >

${b?string} && ${b?string} : ${(b && b)?string}
${b?string} && ${a?string} : ${(b && a)?string}
${a?string} && ${b?string} : ${(a && b)?string}
${a?string} && ${a?string} : ${(a && a)?string}

${b?string} || ${b?string} : ${(b || b)?string}
${b?string} || ${a?string} : ${(b || a)?string}
${a?string} || ${b?string} : ${(a || b)?string}
${a?string} || ${a?string} : ${(a || a)?string}

!true = ${(!a)?string}
!false = ${(!b)?string}