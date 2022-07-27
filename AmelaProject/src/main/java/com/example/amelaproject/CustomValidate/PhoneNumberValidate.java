package com.example.amelaproject.CustomValidate;

import com.example.amelaproject.CustomValidate.implValidation.PhoneNumber;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidate  implements ConstraintValidator<PhoneNumber,String> {

    public boolean isValid(String s, ConstraintValidatorContext cvc) {

        return s != null && s.matches("[0-9]+")
                && (s.length() == 10 ) && (s.substring(0 ,1).equals("0"));
    }

}
