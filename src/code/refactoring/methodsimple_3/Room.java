package code.refactoring.methodsimple_3;

public class Room {
	boolean withinPlan(HeatingPlan plan) {
		return plan.withinRange(daysTempRange());
//	    int low = daysTempRange().getLow();
//	    int high = daysTempRange().getHigh();
//	    return plan.withinRange(low, high);
	}
	
	TempRange daysTempRange() {   
		TempRange temp=new TempRange() ;  
		return temp;
	}

}
