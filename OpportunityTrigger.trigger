trigger OpportunityTrigger on Opportunity (before update){

    // trigger code to update closed date field if stage field is modified
	List<Opportunity> oppList = new List<Opportunity>();
    for(Opportunity opp : trigger.new){
        if(opp.stageName == 'CLOSED WON' || opp.stageName == 'CLOSED LOST'){
            opp.closeDate = System.today();
            oppList.add(opp);
        }        
    }
    update oppList;
}
