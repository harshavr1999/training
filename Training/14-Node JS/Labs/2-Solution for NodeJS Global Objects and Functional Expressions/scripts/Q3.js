console.time();
//Memory Used
const memoryUsed =  process.memoryUsage().heapUsed;
console.log(memoryUsed);

//Process Id
const processID = process.pid;
console.log(processID);

// Process in Action Time
console.timeEnd();

// Abort Process
process.exit(1);
