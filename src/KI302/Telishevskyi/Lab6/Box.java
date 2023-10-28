package KI302.Telishevskyi.Lab6;

import java.util.ArrayList;

class Box<T extends Data> {
    private ArrayList<Instrument> arrInstrument;
    private ArrayList<Work> arrWork;
    public Box() {
        arrInstrument = new ArrayList<Instrument>();
        arrWork = new ArrayList<Work>();
    }

    public Instrument findMinInstrument() {
        if (!arrInstrument.isEmpty()) {
            Instrument min = arrInstrument.get(0);
            for (int i = 1; i < arrInstrument.size(); i++) {
                if (arrInstrument.get(i).compareTo(min) < 0)
                    min = arrInstrument.get(i);
            }
            return min;
        }
        return null;
    }

    public Work findMinWork() {
        if (!arrWork.isEmpty()) {
            Work min = arrWork.get(0);
            for (int i = 1; i < arrWork.size(); i++) {
                if (arrWork.get(i).compareTo(min) < 0)
                    min = arrWork.get(i);
            }
            return min;
        }
        return null;
    }

    public void AddData(Instrument data) {
        arrInstrument.add(data);
        System.out.print("Element added: ");
        data.print();
    }
    public void AddData(Work data) {
        arrWork.add(data);
        System.out.print("Element added: ");
        data.print();
    }

}
