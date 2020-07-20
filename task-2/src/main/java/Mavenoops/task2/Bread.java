package Mavenoops.task2;

public class Bread implements Sweet{
	double weight;
	double cost;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost() {
		this.cost += this.weight*175.5;
	}
}