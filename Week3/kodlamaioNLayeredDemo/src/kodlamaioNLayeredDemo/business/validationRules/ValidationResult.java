package kodlamaioNLayeredDemo.business.validationRules;

public class ValidationResult {

	private boolean result;
	private String message;
	
	public ValidationResult(boolean result) {
		this.result = result;
	}
	
	public ValidationResult(boolean result, String message) {
		this.result = result;
		this.message = message;
	}
	
	
	
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
