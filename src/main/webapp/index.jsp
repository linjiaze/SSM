<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>SSM整合测试</h1>
<a href="account/findAll.do">［查询所有Account］</a><br/>
<a href="account/findPages/1/3.do">［分页查询Account］</a>

<br>
<hr>
<form action="account/transMoney.do" method="post">
    转账人:<input type="text" name="from"/><br>
    收款人: <input type="text" name="to"/><br>
    转账金额: <input type="text" name="money"/><br>
    <input type="submit" value="转账"> <br>
</form>
</body>
</html>
