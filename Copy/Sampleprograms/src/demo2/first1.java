package demo2;
import java.util.Scanner;

public class first1 {




       public static void main(String args[]) {

	  // Function accepts academic scores as input parameters and outputs the overall
	  // weighted average percentage of an individual.
	  //Calculate the Overall Percentage

	   float averageCalculation(int assignmentScore, int projectScore, int quizScore, int midTermScore,
			      int finalExamScore) 
	   {

			      float overallPercentage;
				  float asp=(float) 0.10;
				  float ps=(float) 0.35;
				  float qs=(float) 0.10;
				  float ms=(float) 0.15;
				  float fes=(float) 0.30;
				  overallPercentage=asp*assignmentScore+projectScore*ps+quizScore*qs+midTermScore*ms+finalExamScore*fes;

			      
			      return overallPercentage;
			  }
	  

	}

}
