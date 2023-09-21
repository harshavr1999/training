let connection;
var oracledb = require('oracledb');

oracledb.getConnection(
	{
		user: 'HR',
		password: 'HR',
		connectString: 'localhost/XE'
	},
	function (err, connection) {
		if (err) {
			console.error("db has connected failed: " + err.message);
			return;
		}

		console.log("db has connected ");

		insertData(connection)
		readAll(connection);
        updateData(connection);
		 deleteData(connection);
	});

// insert to Department
function insertData(connection){
    var sql = "INSERT INTO DEPARTMENTS VALUES (1,'Accounts',200,1700)";
    var params = [];
	connection.execute(sql, params, function (err, result) {
		if (err) {
			console.error("query failed: " + err.message);
			console.error(err);
			return;
		}else{
            console.log("Rows Inserted : "+result.rowsAffected);
        }
	});
}

// All records available in Department
function readAll(connection) {
	var sql = "select * from DEPARTMENTS";
	var params = [];
	connection.execute(sql, params, function (err, result) {
		if (err) {
			console.error("query failed: " + err.message);
			console.error(err);
			return;
		}
		//console.log(result);
		console.log(result.rows);
	});
}

// Updating Department using Id
function updateData(connection){
    var sql = "UPDATE DEPARTMENTS SET DEPARTMENT_NAME='Admin', MANAGER_ID=201, LOCATION_ID=1800 WHERE DEPARTMENT_ID=10";
    var params = [];
	connection.execute(sql, params, function (err, result) {
		if (err) {
			console.error("query failed: " + err.message);
			console.error(err);
			return;
		}else{
            console.log("Rows Updated : "+result.rowsAffected);
        }
	});
}

// Remove Department from table
function deleteData(connection){
    var sql = "DELETE FROM DEPARTMENTS WHERE DEPARTMENT_ID=1";
    var params = [];
	connection.execute(sql, params, function (err, result) {
		if (err) {
			console.error("query failed: " + err.message);
			console.error(err);
			return;
		}else{
            console.log("Rows Deleted : "+result.rowsAffected);
        }
	});
}