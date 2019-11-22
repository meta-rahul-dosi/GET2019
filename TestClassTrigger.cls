@isTest
private class TestClassTrigger {
    
    @isTest static void TestDeleteAllRelatedStudentsToAClass(){
        Class__c cls = new Class__c(Name='Test Class', Custom_Status__c='New');
        cls.MaxSize__c = 100;
        insert cls;
        List<Student__c> studentsList = new List<Student__c>();
        for(Integer index=0; index<100; index++){
            studentsList.add(new Student__c(Name='Student for Test '+(index+1), Class__c=cls.Id));
        }
        insert studentsList;
        cls.Custom_Status__c = 'Reset';
        Database.update(cls);
        System.assertEquals(0, [SELECT COUNT() FROM Student__c WHERE Class__c =: cls.Id], 
                            'Students were not deleted from the class when its Custom_Status Field is modified to Reset');        
    }
    
    @isTest static void TestClassDeletionWithOneFemaleStudent(){
        Class__c cls = new Class__c(Name='Class With One Girl');
        Student__c stdnt = new Student__c(Sex__c='female', class__c = cls.id); 
        Database.DeleteResult result =Database.delete(cls);
        System.assert(result.isSuccess());
    }
}
