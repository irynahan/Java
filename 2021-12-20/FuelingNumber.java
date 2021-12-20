import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuelingNumber {

    /**
     * @param l            the length of the way
     * @param maxDistance  the distance which is reachable by one refueling
     * @param fuelStations the points for refueling (km from the start)
     * @return number of stops for refueling
     */
    public int getFuelingNumber(int l, int maxDistance, int[] fuelStations) {
        if(l<maxDistance){
            return 0;
        }
        for(int index=1; index<fuelStations.length; index++){
            if(fuelStations[index]-fuelStations[index-1]>maxDistance){
                throw new IllegalArgumentException("distance between stations is too big");
            }
        }
        if(fuelStations[fuelStations.length-1]+maxDistance<l){
            throw new IllegalArgumentException("length between the last fuelstation and destination point is too big");
        }
        List<Integer> checkPoints = new ArrayList<Integer>();
        checkPoints.add(0);
        checkPoints.addAll(Arrays.stream(fuelStations).boxed().collect(Collectors.toList()));
        checkPoints.add(l);

        int currentPositionInKm = 0;
        int currentIndex = 0;
        int numberOfStops = 0;

        while(currentPositionInKm<l && (currentPositionInKm+maxDistance)<l ){
            currentIndex = getNextStop(currentIndex, maxDistance, checkPoints);
            currentPositionInKm = checkPoints.get(currentIndex);
            numberOfStops++;
        }
        return numberOfStops;
    }

    int getNextStop(int currentIndex, int maxDistance, List<Integer> fuelStations) {
        int maxDriveDistance = fuelStations.get(currentIndex) + maxDistance;
        int resultIndex = currentIndex + 1;
        while (resultIndex < fuelStations.size()) {
            if (fuelStations.get(resultIndex) < maxDriveDistance) {
                resultIndex = resultIndex + 1;
            } else {
                resultIndex--;
                break;
            }
        }
        return resultIndex;
    }

}
