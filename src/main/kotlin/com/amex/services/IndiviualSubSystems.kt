package com.amex.dao

import com.amex.facades.IndiviualFacades
import com.amex.helper.DbHelper
import com.amex.models.Indiviual
import java.sql.Connection


class IndiviualSubSystems: IndiviualFacades {
    var connection : Connection ? = null

    var indiviualList : MutableList<Indiviual> = mutableListOf<Indiviual>()
    init {
        try {
            connection = DbHelper.getConnection()
        } catch (classNotFound : ClassNotFoundException) {
            println("Class Not Found.....")
        }
        indiviualList = mutableListOf<Indiviual>()
    }

    override fun addIndiviual(indiviual: Indiviual): Boolean {
        return indiviualList.add(indiviual)
    }

    override fun getAllIndiviual(): List<Indiviual> {
        return indiviualList
        }


    override fun getIndiviualById(accountNo: Long): Indiviual {
    return   indiviualList.filter { it -> it.accNo  == accountNo }.first()
    }

    override fun updateIndiviual(indiviual: Indiviual) : Indiviual {

        var index  = indiviualList.indexOf(indiviualList.filter{it -> it.accNo  == indiviual.accNo}.first())
       return indiviualList.set(index, indiviual)
    }

    override fun deleteIndiviual(accountNo: Long) {
        var index  = indiviualList.indexOf(indiviualList.filter{it -> it.accNo  == accountNo}.first())
        indiviualList.removeAt(index)
    }

}