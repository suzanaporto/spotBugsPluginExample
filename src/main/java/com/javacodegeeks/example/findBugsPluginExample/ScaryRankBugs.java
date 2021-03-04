package com.javacodegeeks.example.findBugsPluginExample;

/**
 * Scary Rank Bugs Sample
 */
public class ScaryRankBugs {
	
	/** The check str value. */
	private String checkStrValue = null;

	/**
	 * The Constructor.
	 */
	public ScaryRankBugs() {
		this.checkStrValue = "SomeValue";
	}

	/**
	 * Execute some conditions.
	 */
	private void executeSomeConditions() {
		if ("SomeValue".equalsIgnoreCase(this.checkStrValue)) {
			System.out.println("a");
		} 
		else if ("SomeValue".equals(this.checkStrValue)) {
			System.out.printf("b");
		}
	}

	/**
	 * Incorrect assignment in if condition.
	 */
	private static void incorrectAssignmentInIfCondition() {
		final boolean value = false;
		if (value == true) {
			System.out.println(String.format("   - value is true"));
		} else {
			System.out.println(String.format("   - value is false"));
		}
	}
	
	private static void qabQuestionableBooleanAssignmentWRONG() {
		final boolean value = false;
		if (value == true) {
			System.out.println(String.format("   - value is true"));
		} else {
			System.out.println(String.format("   - value is false"));
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the args
	 */
	public static void main(String[] args) {
		ScaryRankBugs instance = new ScaryRankBugs();
		instance.executeSomeConditions();
	}
}
