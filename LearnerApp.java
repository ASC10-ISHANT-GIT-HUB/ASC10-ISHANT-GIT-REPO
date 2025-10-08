public class LearnerApp {
    public static void main(String[] args) {
        workingWithArrays();
        workingWithMaps();
    }

    private static void workingWithArrays(){

        LearnerArrayData learnerdata = new LearnerArrayData();
        learnerdata.assignLearnerNames();
        learnerdata.printLearnerNames();
    }

    private static void workingWithMaps(){

        LearnerAnswersMap learneranswers = new LearnerAnswersMap();
        learneranswers.assignlearnerAnswers();
        learneranswers.displaylearnerAnswers();
    }
}
