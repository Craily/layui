layui.use('table', function() {
	var table = layui.table;
	// 第一个实例
	table.render({
		elem : '#table',
		url : 'getemp',
		page : true,
		cols : [[
			{field : 'EMPNO',title : 'EMPNO'}, 
			{field : 'ENAME',title : 'ENAME'}, 
			{field : 'JOB',title : 'JOB'},
			{field : 'MGR',title : 'MGR'},
			{field : 'HIREDATE',title : 'HIREDATE'},
			{field : 'SAL',title : 'SAL'},
			{field : 'COMM',title : 'COMM'},
			{field : 'DEPTNO',title : 'DEPTNO'}
		]]
	});
});