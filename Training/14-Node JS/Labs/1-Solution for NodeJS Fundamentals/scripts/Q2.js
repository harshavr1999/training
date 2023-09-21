for(var i = 2014; i<=2050; i++){
    const date = new Date(`${i}-01-01`);
    if(date.getDay()==0){
        console.log( `1st January is Sunday in this ${i}`);
    }
}