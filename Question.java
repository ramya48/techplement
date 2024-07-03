package app;

public class Question {

	    private String questionText;
	    private String[] options;
	    private int correctOption;

	    public Question(String questionText, String[] options, int correctOption) {
	        this.questionText = questionText;
	        this.options = options;
	        this.correctOption = correctOption;
	    }

		public String getQuestionText() {
			return questionText;
		}

		public void setQuestionText(String questionText) {
			this.questionText = questionText;
		}

		public String[] getOptions() {
			return options;
		}

		public void setOptions(String[] options) {
			this.options = options;
		}

		public int getCorrectOption() {
			return correctOption;
		}

		public void setCorrectOption(int correctOption) {
			this.correctOption = correctOption;
		}

		public String getQuestionText1() {
			// TODO Auto-generated method stub
			return null;
		}

}
