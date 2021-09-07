public abstract class BasicEngineering {

    public final void completeCourse() {
        completeMath();
        completeSoftSkills();
        completePaperWork();
    }

    private void completeMath() {
        System.out.println("Completed math course");
    }

    private void completeSoftSkills() {
        System.out.println("Completed soft skills course");
    }

    public abstract void completePaperWork();
}
