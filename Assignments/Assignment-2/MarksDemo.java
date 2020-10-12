public class MarksDemo {
    public static void main(String[] args) {
        Marks marks = new Marks();
        marks.setScience(92);
        System.out.println("Marks in science: " + marks.getScience());
        marks.setMath(85);
        System.out.println("Marks in math: " + marks.getMath());
        marks.setArts(90);
        System.out.println("Marks in arts: " + marks.getArts());
        System.out.println("Grade of student is : " + marks.getResults());
    }

}
