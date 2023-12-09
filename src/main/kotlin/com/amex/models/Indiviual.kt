package com.amex.models


import kotlinx.serialization.Serializable

import java.time.LocalDate
import java.util.*

@Serializable
data class Indiviual(var _accountNo:Long,var _address:Address,var _surName:String, var _gender: Gender,
                      var _dob: String
)