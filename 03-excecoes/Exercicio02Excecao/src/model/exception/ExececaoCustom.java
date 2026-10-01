package model.exception;

public class ExececaoCustom extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ExececaoCustom(String msg) {
		super(msg);
	}
}
