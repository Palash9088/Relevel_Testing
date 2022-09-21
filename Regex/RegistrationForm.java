import Validations.Validation;

public class RegistrationForm {
    public static void main(String[] args) {

        Validation validation = new Validation();

        System.out.println("Is Username correct: " + validation.validateUsername( "Palash9088"));
        System.out.println("Is Password correct: " + validation.validatePassword("Palash@123456"));
        System.out.println("Is Email correct: " + validation.validateEmail( "Palash@gmail.com"));

        System.out.println();

        System.out.println("Is Username correct: " + validation.validateUsername( "palash"));
        System.out.println("Is Password correct: " + validation.validatePassword("Palash123456"));
        System.out.println("Is Email correct: " +validation.validateEmail("Palash9088"));
    }
}
