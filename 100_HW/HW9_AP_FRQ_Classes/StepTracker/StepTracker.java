public class StepTracker{
    int totalSteps;
    int minSteps;
    int activeDays;
    int days;
    
    public StepTracker(){
        totalSteps = 0;
        minSteps = 0;
        activeDays = 0;
        days = 0;
    }
    public StepTracker(int minSteps){
        totalSteps = 0;
        this.minSteps = minSteps;
        activeDays = 0;
        days = 0;
    }
    public void addDailySteps(int steps){
        if(steps >= minSep){
            days++;
        }
        totalSteps = totalSteps + steps;
    }
    public int activeDays(){
        return activedays;
    }
    public int averageSteps(){
      return (totalSteps/days);
    }
}