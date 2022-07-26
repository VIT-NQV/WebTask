
function validator(options) {

    function validate(inputElement, rule) {
        var errorMessage = rule.test(inputElement.value);
        var errorElement = inputElement.parentElement.querySelector('.form-message');


        if (errorMessage) {
            errorElement.innerText = errorMessage;
            // inputElement.parentElement.classList.add('invalid');
        } else {
            errorElement.innerText = '';
            // inputElement.parentElement.classList.remove('invalid');
        }
    }

    var formElement = document.querySelector(options.form);

    if (formElement) {

        options.rules.forEach(function (rule) {

            var inputElement = formElement.querySelector(rule.selector);


            if (inputElement) {

                inputElement.onblur = function () {
                    validate(inputElement, rule);
                }

                inputElement.oninput = function () {
                    var errorElement = inputElement.parentElement.querySelector('.form-message');
                    errorElement.innerText = '';
                    // inputElement.parentElement.classList.remove('invalid');
                }
            }
        });
    }
}

validator.isRequired = function (selector) {
    return {
        selector: selector,
        test: function (value) {
            return value.trim() ? undefined : 'Vui long nhap truong nay'
        }
    };
}

validator.namelength = function (selector) {
    return {
        selector: selector,
        test: function (value) {
            return value.length >= 3 || value.length <= 256 ? undefined : 'Yeu cau nhap 3-256 ky tu'
        }
    }
}

validator.passwordlength = function (selector) {
    return {
        selector: selector,
        test: function (value) {
            return value.length >= 8 || value.length <= 256 ? undefined : 'Yeu cau nhap 3-256 ky tu'
        }
    }
}

