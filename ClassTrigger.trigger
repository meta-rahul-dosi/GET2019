trigger ClassTrigger on Class__c (before insert, before delete, before update) {
    
    // trigger code to restrict class deletion if class has more than one female students
    if(trigger.isDelete){
        List<AggregateResult> studentss = [SELECT Class__r.id, COUNT(Name) FROM Student__c WHERE Sex__c = 'female' AND Class__c IN: Trigger.old
                                           GROUP BY Class__r.id HAVING COUNT(Name) > 1];
        for (AggregateResult everyStudent : studentss) 
        {
            Trigger.oldMap.get((id)everyStudent.get('Class__r.id')).addError('This class cannot be deleted as it contains more than one female students');    
        }
    }
    
    // trigger code to delete all related students record if class custom status is changed to reset
    if(trigger.isUpdate){
        List<Id> classIds = new List<Id>();
        for(Class__c cls : trigger.new)
        {
            Class__c oldRecord = trigger.oldMap.get(cls.Id);
            if(oldRecord.Custom_Status__c != 'reset' && cls.Custom_Status__c == 'reset'){
                classIds.add(cls.Id);
            }
        }
        List<Student__c> studentList = [SELECT Id FROM Student__c WHERE Class__c IN: classIds];
        delete studentList;
    }    
}