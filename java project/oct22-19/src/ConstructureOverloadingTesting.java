
public class ConstructureOverloadingTesting {
public static void main(String[] args) {
	ConstructureOverloading c1 = new ConstructureOverloading(512,"Manjunath");
	c1.printDetails();
	ConstructureOverloading c2 = new ConstructureOverloading("pavan",123);
	c2.printDetails();
	ConstructureOverloading c3 = new ConstructureOverloading("narayana",999,3111714);
    c3.printDetails();
}
}
