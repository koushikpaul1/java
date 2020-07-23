/**
 * 
 */
package com.edge.trilat;

import org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresOptimizer.Optimum;
import org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.util.Pair;
import org.apache.log4j.PropertyConfigurator;

import com.lemmingapex.trilateration.NonLinearLeastSquaresSolver;
import com.lemmingapex.trilateration.TrilaterationFunction;

/**
 * @author Leadics-18-10
 *
 */


class Trilateration implements MultivariateJacobianFunction {
	protected static final double epsilon = 1E-7;
	protected final double positions[][];
	protected final double distances[];
	public Trilateration(double positions[][], double distances[]) {

		if(positions.length < 2) {throw new IllegalArgumentException("Need at least two positions.");}
		if(positions.length != distances.length) {throw new IllegalArgumentException("The number of positions you provided, " + positions.length + ", does not match the number of distances, " + distances.length + ".");}
		for (int i = 0; i < distances.length; i++) {distances[i] = Math.max(distances[i], epsilon);}
		int positionDimension = positions[0].length;
		for (int i = 1; i < positions.length; i++) {
			if(positionDimension != positions[i].length)throw new IllegalArgumentException("The dimension of all positions should be the same.");
			}
		this.positions = positions;
		this.distances = distances;
	}
	@Override
	public Pair<RealVector, RealMatrix> value(RealVector point) {
		return null;
	}
}

public class Main {
	
	/*public double[] getPosition(double[] distances, double[][] positions) {
		TrilaterationFunction trilaterationFunction = new TrilaterationFunction(positions, distances);
		NonLinearLeastSquaresSolver nlSolver = new NonLinearLeastSquaresSolver(trilaterationFunction,
				new LevenbergMarquardtOptimizer());
		Optimum optimum = nlSolver.solve();
		double[] centroid = optimum.getPoint().toArray();
		return centroid;
		}*/
	protected static final Double epsilon = 1E-7;
	public static void main(String[] args) {
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		double[][] positions = new double[][] { { 0.0, 0.0 }, { 0.0, 36.0 }, { 16.0, 32.0 } };
		double[] distances = new double[] { 29, 25, 13 };
		Trilateration trilateration=new Trilateration(positions,distances);
		TrilaterationFunction trilaterationFunction=new TrilaterationFunction(positions,distances);
		//NonLinearLeastSquaresSolver nlSolver = new NonLinearLeastSquaresSolver(trilateration,new LevenbergMarquardtOptimizer());
		NonLinearLeastSquaresSolver nlSolver = new NonLinearLeastSquaresSolver(trilaterationFunction,new LevenbergMarquardtOptimizer());
		Optimum optimum = nlSolver.solve();
		double[] centroid = optimum.getPoint().toArray();
		
		
		
	}

}
