@isTest
private class TestTeacherTrigger {
    
    @isTest static void TestTeacherInsertionTeachingHindi(){
        Contact aTeacher = new Contact(Subject__c='hindi');
        Database.InsertResults result = Database.insert(aTeacher);
        System.assert(!result.isSuccess());
    }
    
    @isTest static void TestTeacherUpdationTeachingHindi(){
        Contact aTeacher = new Contact(Subject__c='english');
        insert aTeacher;
        aTeacher.Subject__c = 'hindi';
        Database.UpdateResults result = Database.update(aTeacher);
        System.assert(!result.isSuccess());
    }

}
