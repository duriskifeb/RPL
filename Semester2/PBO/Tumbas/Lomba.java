package Semester2.PBO.Tumbas;

public class Lomba {
    protected int nilai1;
    protected int nilai2;
    protected int nilai3;
    protected int nilai4;

    public Lomba(int nilai1, int nilai2, int nilai3, int nilai4) {
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
    }

    @Override
    public String toString() {
        return nilai1 + ", " + nilai2 + ", " + nilai3 + ", " + nilai4;
    }

    public int getNilai1() {
        return nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public int getNilai3() {
        return nilai3;
    }

    public int getNilai4() {
        return nilai4;
    }

    public double getHasil() {
        return ((double) (getNilai1() + getNilai2() + getNilai3() + getNilai4()) / 4);
    }
}

class UIUX extends Lomba {
    public UIUX(int nilai1, int nilai2, int nilai3, int nilai4) {
        super(nilai1, nilai2, nilai3, nilai4);
    }
}

class Algo extends Lomba {
    public Algo(int nilai1, int nilai2, int nilai3) {
        super(nilai1, nilai2, nilai3, 0);
    }

    @Override
    public double getHasil() {
        return ((double) (getNilai1() + getNilai2() + getNilai3()) / 3);
    }

    @Override
    public String toString() {
        return nilai1 + ", " + nilai2 + ", " + nilai3;
    }
}

class Data extends Lomba {
    public Data(int nilai1, int nilai2, int nilai3) {
        super(nilai1, nilai2, nilai3, 0);
    }

    @Override
    public double getHasil() {
        return ((double) (getNilai1() + getNilai2() + getNilai3()) / 3);
    }

    @Override
    public String toString() {
        return nilai1 + ", " + nilai2 + ", " + nilai3;
    }
}