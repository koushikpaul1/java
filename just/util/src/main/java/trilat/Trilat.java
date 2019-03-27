package trilat;


import org.apache.commons.math3.fitting.leastsquares.LeastSquaresOptimizer.Optimum;
import org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer;
import org.apache.log4j.PropertyConfigurator;

import com.lemmingapex.trilateration.NonLinearLeastSquaresSolver;
import com.lemmingapex.trilateration.TrilaterationFunction;


public class Trilat {
	

	protected static final Double epsilon = 1E-7;
	public static void main(String[] args) {
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		
		
		//double[][] positions = new double[][] { { 0.0, 0.0 }, {36.0,0.0 }, { 16.0, 32.0 },{2.0,00.0},{7.0,00.0} };
		//double[] distances = new double[] { 29, 25, 13,20,13 };	
		
		//1
		//double[][] positions = new double[][] { { 2.0, 0.0 }, {5.0,0.0}, { 8.0, 0.0 } };
		//double[] distances = new double[] { 4.24, 3, 4.24 };//5.0,0.0/wrong
		//2
		//double[][] positions = new double[][] { { 0,0 }, {2.5,1 }, { 5,0 } };
		//double[] distances = new double[] { 4, 2.2, 4 };//2.4999999999999996,-1.7264197033284172/wrong
		//3
		//double[][] positions = new double[][] { { 0.0, 0.0 }, {3.0,2.0}, { 6.0, 0.0 } };
		//double[] distances = new double[] { 5, 2, 5};//3.0,4.0/correct
		//4
		//double[][] positions = new double[][] { { 0.0, 0.0 }, {3.0,1.5}, { 6.0, 0.0 } };
		//double[] distances = new double[] { 5, 2.5, 5};//3.0,-1.6180333396289484/wrong
		//5
		double[][] positions = new double[][] { { 0.0, 0.0 }, {3.0,1.5}, { 6.0, 0.0 } };
		double[] distances = new double[] { 5, 2.5, 5};//3.0,-1.6180333396289484/wrong
		TrilaterationFunction trilaterationFunction=new TrilaterationFunction(positions,distances);
		NonLinearLeastSquaresSolver nlSolver = new NonLinearLeastSquaresSolver(trilaterationFunction,new LevenbergMarquardtOptimizer());
		Optimum optimum = nlSolver.solve();
		double[] centroid = optimum.getPoint().toArray();
		//for(int i=0;i<centroid.length;i++) { System.out.println(centroid[i]);}
		//System.out.println(centroid);
		System.out.println(centroid[0]+","+centroid[1]);
		
		
		
	}

}
