package practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;




public class MyTransformer implements IAnnotationTransformer {

/*	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2,
			Method arg3) {
if("test1".equals(arg0.getTestName())){
	arg0.setEnabled(true);
}
else{
	arg0.setEnabled(false);
}
	}*/
	
	
	
	
	/*public void startExecution(){
		
	}*/




	public void transform(ITestAnnotation annotation, Class cl, Constructor cc,
			Method mtd) {
		System.out.println(mtd.getName());
		if("test2".equalsIgnoreCase(mtd.getName())){
			annotation.setEnabled(true);
		}
		else{
			annotation.setEnabled(false);
		}		
	}
			
			

	}
	
	


