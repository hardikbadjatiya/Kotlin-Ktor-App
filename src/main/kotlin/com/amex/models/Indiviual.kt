package com.amex.models

import java.time.LocalDate

class Individual(_accountNo:Long,_address:Address,_surName:String, _gender: Gender,_dob:LocalDate):Customer( "ffdf", _accountNo , "sdf@aexp.com" , "fdfdf", 34343434, _address) {

    //override variable
    override val code="CI"

    var surName=_surName;
    var gender=_gender
    var dob=_dob

}