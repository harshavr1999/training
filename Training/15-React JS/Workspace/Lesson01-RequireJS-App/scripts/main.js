require(['./coach','./coachDetails'],function(coachRef,coachDetRef){
    
    alert(coachRef.coachName);

    coachDetRef.displayDetails();
    
});