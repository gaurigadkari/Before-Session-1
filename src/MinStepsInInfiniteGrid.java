import java.util.ArrayList;

public class MinStepsInInfiniteGrid {
	public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int size = X.size();
        int currentX, currentY, previousX, previousY, differenceX, differenceY, step =0;
        previousX = X.get(0);
        previousY = Y.get(0);
        for(int i = 1; i < size; i++) {
            
            currentX = X.get(i);
            currentY = Y.get(i);
            differenceX = Math.abs(currentX - previousX);
            differenceY = Math.abs(currentY - previousY);
            if(differenceX == 0 && differenceY == 0) {
            } else if(differenceX <= 1 && differenceY <=1) {
                step++;
            } else if(differenceX > 1 && differenceY <=1) {
                step = step + differenceX;
            } else if(differenceY > 1 && differenceX <=1) {
                step = step + differenceY;
            } else if(differenceY > 1 && differenceX > 1) {
                step = step + ((differenceX > differenceY) ? differenceX : differenceY);
            }
            previousX = currentX;
            previousY = currentY;
        }
        return step;
    }
}

