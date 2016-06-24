<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.10/js/dataTables.jqueryui.min.js"></script>
<link href="https://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css" rel="stylesheet"/>
<link href="https://cdn.datatables.net/1.10.10/css/dataTables.jqueryui.min.css" rel="stylesheet"/> -->

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/r/bs-3.3.5/jq-2.1.4,dt-1.10.8/datatables.min.css" />
<script type="text/javascript"
	src="https://cdn.datatables.net/r/bs-3.3.5/jqc-1.11.3,dt-1.10.8/datatables.min.js"></script>
<script>
$(document).ready(function() {
    $('#example').DataTable({
    	//"pagingType": "full_numbers",
    	"bPaginate":false,
    	'columnDefs': [{
            'aTargets': [0],
            'searchable': false,
            //'orderable': false,
            'className': 'dt-body-center',
            'asSorting':[[ 1,'asc']] ,
            'render': function (data, type, full, meta){
                return '<input type="checkbox" name="id[]" value="' + $('<div/>').text(data).html() + '">';
            }
         }]
        });
} );
</script>
<style>
.no-sort::after {
	display: none !important;
}

.no-sort {
	pointer-events: none !important;
	cursor: default !important;
}
</style>
</head>
<body>
	<div style="width: 80%;margin-left: 90px"><br><br>
		<table id="example" class="display" cellspacing="0" >
			<thead>
				<tr>
					<th class="no-sort"><input type="checkbox" /></th>
					<th>Name</th>
					<th>Position</th>
					<th>Office</th>
					<th>Age</th>
					<th>Start date</th>
					<th>Salary</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="checkbox"></td>
					<td>Tiger Nixon</td>
					<td>System Architect</td>
					<td>Edinburgh</td>
					<td>61</td>
					<td>2011/04/25</td>
					<td>$320,800</td>
				</tr>
				<tr>
					<td><input type="checkbox"></td>
					<td>Garrett Winters</td>
					<td>Accountant</td>
					<td>Tokyo</td>
					<td>63</td>
					<td>2011/07/25</td>
					<td>$170,750</td>
				</tr>
				<tr>
					<td><input type="checkbox"></td>
					<td>Ashton Cox</td>
					<td>Junior Technical Author</td>
					<td>San Francisco</td>
					<td>66</td>
					<td>2009/01/12</td>
					<td>$86,000</td>
				</tr>
				<tr>
					<td><input type="checkbox"></td>
					<td>Cedric Kelly</td>
					<td>Senior Javascript Developer</td>
					<td>Edinburgh</td>
					<td>22</td>
					<td>2012/03/29</td>
					<td>$433,060</td>
				</tr>
				<tr>
					<td><input type="checkbox"></td>
					<td>Airi Satou</td>
					<td>Accountant</td>
					<td>Tokyo</td>
					<td>33</td>
					<td>2008/11/28</td>
					<td>$162,700</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
<script type="text/javascript">
	// For demo to fit into DataTables site builder...
	$('#example')
		.removeClass( 'display' )
		.addClass('table table-striped table-bordered');
</script>
</html>