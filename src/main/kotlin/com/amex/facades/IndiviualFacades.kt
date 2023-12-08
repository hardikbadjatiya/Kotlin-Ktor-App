package com.amex.facades

import com.amex.models.Indiviual

interface IndiviualFacades {
    fun addIndiviual(indiviual: Indiviual) : Boolean
    fun getAllIndiviual() : List<Indiviual>
    fun getIndiviualById(accountNo:Long):Indiviual
    fun updateIndiviual(indiviual: Indiviual) : Indiviual
    fun deleteIndiviual(accountNo: Long)
}