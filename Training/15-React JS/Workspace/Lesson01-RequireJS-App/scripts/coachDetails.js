define(['./coach'],function(coachRef){
    return {
        displayDetails: function(){
            document.write("Coach Name : "+coachRef.coachName+", Coaches for : "+coachRef.team);
        }
    }
});