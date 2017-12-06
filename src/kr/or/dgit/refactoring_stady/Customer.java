package kr.or.dgit.refactoring_stady;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();
	
	public Customer(String aname) {
		
		this.name = aname;
	}
	
	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}
	
	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}

	public String getName() {
		return name;
	}
	
	public String statement() {	
		StringBuilder result = new StringBuilder(getName() + " 고객님의 대여 기록 \n");	
		for(Rental each:rentals) {			
			result.append("\t" + each.getMovie().getTitle());
			result.append("\t" + String.valueOf(each.getCharge())+"\n");
	
		}
		
		result.append("누적 대여료 :" + String.valueOf(getTotalCharge())+ "\n");
		result.append("적립 포인트 :" + String.valueOf(getTotalFrequentRenterPoints()));
		
		return result.toString();
	}
	
	public double getTotalCharge() {
		double result= 0;
		for(Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}
	
	public double getTotalFrequentRenterPoints() {
		double result= 0;
		for(Rental rental : rentals) {
			result += rental.getFrequentRenterPoints();
		}
		return result;
	}
	
	public String htmlStatement() {
		StringBuilder result = new StringBuilder("<H1><EM>"+getName() + " 고객님의 대여 기록</EM><H1><p> \n");
		for(Rental each:rentals) {			
			result.append(each.getMovie().getTitle()+":");
			result.append(String.valueOf(each.getCharge())+"<br>\n");
	
		}
		
		result.append("<p>누적 대여료 :<EM>" + String.valueOf(getTotalCharge())+ "</EM>\n");
		result.append("<p>적립 포인트 :<EM>" + String.valueOf(getTotalFrequentRenterPoints()+"</EM><p>"));
		
		return result.toString();
	}
	
}
