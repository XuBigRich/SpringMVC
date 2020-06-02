<%@ page contentType="text/html;charset=utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>部门列表</title>
	<link type="text/css" rel="stylesheet" href="common.css">
</head>
<script language="javascript" src="time.js" charset="gbk"></script>
<script language="javascript">

</script>
<body>
<center>

<table width=600 cellspacing=1>
	<tr>
		<th>部门名称</th>
		<th>部门经理</th>
		<th>联系电话</th>
		<th>上级部门</th>
		<th>操作</th>
	</tr>
	<c:forEach var="d" items="${depts }" >
		<tr>
			<td>${d.dname}</td>
            <td>${d.manager}</td>
			<td>${d.tel}</td>
            <td>${d.master}</td>
			<td>
				<a href="dept!beforeUpdate?dept.did=${did }">修改</a>
				<a href="dept!deldept?dept.did=${did }" onclick="return confirm('确定删除这条记录?');">删除</a>
			</td>
		</tr>
	</c:forEach>
</table>
</center>
</body>
</html>