trigger StudentTrigger on Student__c (before insert) {
    
	// trigger code to restrict student insertion into a class if that class maximum capacity is reached.
    Set<ID> classIds = new Set<ID>();
    for(Student__c everyStudent : trigger.new){
        classIds.add(everyStudent.class__c);
    }
    
    List<Student__c> studentsToBeInserted = new List<Student__c>();
    
	insert studentsToBeInserted;
}