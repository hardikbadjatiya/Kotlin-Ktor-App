package com.amex.models

class Address {
    var doorNo  : String = ""
        get()=field
        set(value) {
            field = value
        }


    var streetName : String = ""
        get()=field
        set(value) {
            if(value.toString().length>5)
            field = value
            else {
                field= "dfdf"
            }
        }

}