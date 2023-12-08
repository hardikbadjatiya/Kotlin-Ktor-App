package com.amex.models

import java.time.LocalDate

class Corporate (_name : String, _accNo : Long , _email : String , _pass : String ,
                 _contactNo : Long, _address : Address, _companyType : CompanyType) : Customer( _name, _accNo , _email , _pass, _contactNo, _address){

    var companyType = _companyType
    override var code = "c"


//    override fun showCustomerData(): String {
//        return super.showCustomerData() + " "+ this.companyType +  " " + accNo;
//    }
}