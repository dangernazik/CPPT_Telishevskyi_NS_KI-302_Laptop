package KI302.Telishevskyi.Lab6;

class Work implements Data {
    private String workName;
    private int hoursOfWork;

    public Work(String wName, int wSize) {
        workName = wName;
        hoursOfWork = wSize;
    }

    public String getProgramName() {
        return workName;
    }

    public void setProgramName(String name) {
        workName = name;
    }

    public int getSize() {
        return hoursOfWork;
    }

    public int compareTo(Data p) {
        Integer s = hoursOfWork;
        return s.compareTo(p.getSize());
    }

    public void print() {
        System.out.print("Work: " + workName + ", Hours of work: " + hoursOfWork + " hour;\n");
    }
}
