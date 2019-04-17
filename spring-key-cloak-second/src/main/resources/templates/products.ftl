<#import "/spring.ftl" as spring>
<html>

<body>
<h1>My Products</h1>
<br/>
<ul>
<#list products as p>
	<li>${p}</li>
</#list>
</ul>
<br/>
<a href="<@spring.url '/logout'/>">Logout</a>
</body>
</html>
