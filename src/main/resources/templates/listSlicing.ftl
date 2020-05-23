<#assign seq = ["A", "B", "C", "D", "E", "F"]>

seq : <#list seq as item>${item}</#list>

- seq[1..*3] : <#list seq[0..*2] as i>${i}</#list>
- seq[1..<3] : <#list seq[0..*2] as i>${i}</#list>
- seq[1..*2] : <#list seq[1..*2] as i>${i}</#list>
- seq[1..] : <#list seq[1..] as i>${i}</#list>
