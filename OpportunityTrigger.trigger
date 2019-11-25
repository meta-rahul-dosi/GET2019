trigger OpportunityTrigger on Opportunity (after update){

    // trigger code to update closed date field if stage field is modified
    List<Opportunity> modifiedOpps = new List<Opportunity>();
    for(opportunity op : [SELECT Id , stageName , CloseDate FROM Opportunity WHERE Id IN :Trigger.New AND (StageName = 'Closed Won' OR StageName = 'Closed Lost')]){
        if(Trigger.oldMap.get(op.Id).StageName != op.StageName){
            opp.CloseDate = System.today();
            modifiedOpps.add(opp);
        }        
    }
    update modifiedOpps;
}
