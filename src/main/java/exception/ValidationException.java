package exception;

public class ValidationException extends RuntimeException {

  private static final long serialVersionUID = 7318016056112220443L;

  public ValidationException(String message) {
    super(message);
  }
}