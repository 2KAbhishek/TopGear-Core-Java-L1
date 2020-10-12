public class Marks {
    private int science = 0, math = 0, arts = 0;

    public int getScience() {
        return this.science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getMath() {
        return this.math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getArts() {
        return this.arts;
    }

    public void setArts(int arts) {
        this.arts = arts;
    }

    public String getResults() {
        int average = (this.science + this.math + this.arts) / 3;
        if (average >= 80 && 100 >= average) {
            return "A";
        } else if (average >= 73 && 79 >= average) {
            return "B+";
        } else if (average >= 65 && 72 >= average) {
            return "B";
        } else if (average >= 55 && 64 >= average) {
            return "C";
        } else {
            return "D";
        }
    }

}
