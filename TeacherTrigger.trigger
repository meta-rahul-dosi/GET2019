trigger TeacherTrigger on Contact (before insert, before update) {

    //trigger to restrict teacher to insert/update if teacher has subject to teach 'hindi'
    Integer teacherNumber = 1;
    while(teacherNumber <= trigger.new.size()){
        if(trigger.new[teacherNumber].Subject__c.contains('hindi')){
            trigger.new[teacherNumber].addError('cannot insert or update this record');
        }
        teacherNumber++;
    }

}