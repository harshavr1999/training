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
            console.error("Failed: " + err.message);
            return;
        }

        console.log("connected!");

        connection.close(
            function (err) {
                if (err) {
                    console.error("Error in closing Connection : " + err.message);
                    return;
                }
            });
    });

