<#assign empDetails={ "id" : 1, "name": "krishna", "address" : { "city": "Bangalore", "country" : "India"} } >

id : ${empDetails["id"]}
name : ${empDetails["id"]}

city : ${empDetails["address"]["city"]}
city : ${empDetails["address"].city}
city : ${empDetails.address["city"]}

country : ${empDetails["address"]["country"]}
country : ${empDetails["address"].country}
country : ${empDetails.address["country"]}


