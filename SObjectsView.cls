public class SObjectsView {
    
    public static void showAllSObjects(){
        Map<String, Schema.SObjectType> gd = Schema.getGlobalDescribe();
        List<String> objectNames = new List<String>();

		Integer numberOfObjects = objectNames.size();        
        for(Integer index=0; index<=numberOfObjects; index++){
            system.debug(objectNames.get(index));
        }
    }
}