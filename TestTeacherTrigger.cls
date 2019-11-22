@isTest
private class TestTeacherTrigger {
    
    @isTest static void TestTeacherInsertionTeachingHindi(){
        Teacher aTeacher = new Teacher(Subject__c='hindi');
        Database.insertResult result = Database.insert(aTeacher);
        System.assert(!result.isSuccess());
    }
    
    @isTest static void TestTeacherUpdationTeachingHindi(){
        Teacher aTeacher = new Teacher(Subject__c='english');
        insert aTeacher;
        aTeacher.Subject__c = 'hindi';
        Database.updateResult result = Database.update(aTeacher);
        System.assert(!result.isSuccess());
    }

}
