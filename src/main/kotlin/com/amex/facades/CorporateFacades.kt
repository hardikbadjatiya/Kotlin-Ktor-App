package com.amex.facades

import com.amex.models.Corporate

interface CorporateFacades {
    fun addCorporate(corporate: Corporate) : Corporate
    fun getAllCorporates():List<Corporate>
    fun getCorporateById(accountNo:Long): Corporate
    fun updateCorporate(corporate: Corporate): Corporate
    fun deleteCorporate(accountNo: Long)
}