trigger StudentTrigger on Student__c (before insert, after insert, after update) {
    
    // trigger code to restrict student insertion into a class if that class maximum capacity is reached.
     if(trigger.isBefore){
    List<Student__c> studentsToBeInserted = new List<Student__c>();
    for(Student__c everyStudent : trigger.new){
        Class__c cls = [SELECT MaxSize__c, NumberOfStudents__c FROM Class__c WHERE Id =: everyStudent.Class__c];
        if(cls.NumberOfStudents__c < cls.MaxSize__c){
            studentsToBeInserted.add(everyStudent);
        }
    }
    insert studentsToBeInserted;
    
    //trigger code to update MyCount field of Class object according to new student insertion
    if(trigger.isAfter){
        for(Student__c everyStudent : trigger.new){
            if(trigger.isInsert){
                Class__c cls = [SELECT MyCount__c FROM Class__c WHERE id=:everyStudent.Class__c];
                cls.MyCount++;
            }
        }
    }
}
