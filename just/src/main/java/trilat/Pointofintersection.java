package trilat;

import org.apache.commons.math3.fitting.leastsquares.LeastSquaresOptimizer.Optimum;
import org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer;

import com.lemmingapex.trilateration.NonLinearLeastSquaresSolver;
import com.lemmingapex.trilateration.TrilaterationFunction;


public class Pointofintersection {
public static void main() {


    // TODO Auto-generated method stub
    double[][] positions = new double[][] { { 5.0, -6.0 }, { 13.0, -15.0 }, { 21.0, -3.0 }, { 12.4, -21.2 } };
    double[] distances = new double[] { 8.06, 13.97, 23.32, 15.31 };
    NonLinearLeastSquaresSolver solver = new NonLinearLeastSquaresSolver(new TrilaterationFunction(positions, distances), new LevenbergMarquardtOptimizer());
    Optimum optimum = solver.solve();
    double[] centroid = optimum.getPoint().toArray();
    for(int i=1;i<centroid.length;i++) { System.out.println(centroid[i]);}
    System.out.println(centroid);
    //System.out.println(centroid[1]);
}

}