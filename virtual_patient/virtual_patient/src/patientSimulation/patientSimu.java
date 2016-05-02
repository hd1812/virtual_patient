package patientSimulation;

import virtual_patient.FunctionBlocks.FunctionBlocks;
import virtual_patient.paramGen.Params;

public class patientSimu
{

	public static void main(String[] args)
	{
		Params p = new Params("type1");
		FunctionBlocks patient1=new FunctionBlocks(p);
		patient1.init();
		for(int i=0;i<5*24*60;i++){
			
			//Morning injection and glucose
			if(i%(60*24)==8*60-30){
				patient1.injectInsulin(45 *2* 70/7.17);
			}
			
			if(i%(60*24)==8*60){
				patient1.ingestGlucose(45*1000.00); //in mg
			}
			
			//Lunch time
		    if(i%(60*24)==12*60-30){
		    	patient1.injectInsulin(70 *1* 70/7.17);
		    }
		    if(i%(60*24)==12*60){
		    	patient1.ingestGlucose(70*1000.00); //in mg
		    }
			
		    if(i%(60*24)==20*60-30)
		    	patient1.injectInsulin(70 *1.5* 70/7.17);
		    if(i%(60*24)==20*60){
		    	patient1.ingestGlucose(70*1000.00); //in mg
		    }
			patient1.next();
		}
		patient1.writeClose();
		
	}

}
