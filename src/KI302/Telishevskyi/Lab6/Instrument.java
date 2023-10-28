package KI302.Telishevskyi.Lab6;

class Instrument implements Data {
    private String instrumentName;
    private int instrumentSize;

    public Instrument(String iName, int iSize) {
        instrumentName = iName;
        instrumentSize = iSize;
    }

    public String getName() {
        return instrumentName;
    }

    public void getFileName(String name) {
        instrumentName = name;
    }

    public void SetSize(int n) {
        instrumentSize = n;
    }

    public int getSize() {
        return instrumentSize;
    }

    public int compareTo(Data p) {
        Integer s = instrumentSize;
        return s.compareTo(p.getSize());
    }

    public void print() {
        System.out.print("Instrument: " + instrumentName + ", Instrument Size: " + instrumentSize + " sm;\n");
    }
}
