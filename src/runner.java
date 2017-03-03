import practice.MyTransformer;

import com.beust.testng.TestNG;


public class runner {

	@SuppressWarnings("deprecation")
	
	public void startExecution(){
	TestNG tng = new TestNG();
	tng.setAnnotationTransformer(new MyTransformer());
	}
}
