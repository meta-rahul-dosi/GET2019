@isTest
private class TestOpportunityTrigger {
    
    @isTest static void testChangeOfCloseDateField(){
        Opportunity opp = [SELECT Id, StageName FROM Opportunity WHERE StageName != 'CLOSED WON' OR StageName != 'CLOSED LOST' LIMIT 1];
        opp.StageName = 'CLOSED WON';
        update opp;
        Date checkCloseDate = opp.CloseDate;
        
        Test.startTest();
        
        Test.stopTest();
		        System.assertEquals(checkCloseDate,System.today());

    }
}