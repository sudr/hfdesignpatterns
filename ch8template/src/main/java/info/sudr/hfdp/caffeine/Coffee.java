package info.sudr.hfdp.caffeine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

	@Override
	protected void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	@Override
	public void onComplete() {
		System.out.println("Stirring coffee");
	}
	
	@Override
	protected boolean customerWantsCondiments() {
		return getAnswer().toLowerCase().startsWith("y");
	}

	private String getAnswer() {
		if (true) {
			return "yes";
		}
		String answer = "no";
		System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.err.println("IO error trying to read your answer");
		}
		return answer;
	}
}
