package javaapplication13;

public class MyList {

    private double[] list;
    private double sum;

    public MyList() {
        this.list = new double[0];
    }

    public void add(double o) {
        double[] newList = new double[this.list.length + 1];
        System.arraycopy(this.list, 0, newList, 0, this.list.length);
        newList[newList.length - 1] = o;
        this.list = newList;
    }

    public double getSum() {
        for (int i = 0; i < this.list.length; i++) {
            sum += list[i];
        }
        return sum;
    }

    public double getAvrg() {
        return getSum() / this.list.length;
    }
}
