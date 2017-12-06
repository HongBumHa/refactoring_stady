package kr.or.dgit.refactoring_stady;

public class TestMain {

	public static void main(String[] args) {
		Movie mc1 = new Movie("니모를 찾아서", Movie.CHILDRENS);
		Movie mc2 = new Movie("말레피센트", Movie.CHILDRENS);
		Movie mr1 = new Movie("명량", Movie.REGULAR);
		Movie mr2 = new Movie("변호사", Movie.REGULAR);
		Movie mn1 = new Movie("곡성", Movie.NEW_RELEASE);
		Movie mn2 = new Movie("인디펜던스데이", Movie.NEW_RELEASE);
		
		Rental r1 = new Rental(mc1,3);
		Rental r2 = new Rental(mc2,4);
		Rental r3 = new Rental(mr1,2);
		Rental r4 = new Rental(mr2,3);
		Rental r5 = new Rental(mn1,2);
		Rental r6 = new Rental(mn2,3);
		
		Customer c = new Customer("김주하");
		c.addRental(r1);
		c.addRental(r3);
		c.addRental(r5);
		
		Customer c1 = new Customer("김희영");
		c1.addRental(r2);
		c1.addRental(r4);
		c1.addRental(r6);
		
		System.out.println(c.statement());
		System.out.println();
		System.out.println(c1.statement());
	}

}
